/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiWell;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import mmcorej.CMMCore;
import org.micromanager.MMStudioMainFrame;
import org.micromanager.api.AcquisitionEngine;
import org.micromanager.navigation.MultiStagePosition;
import org.micromanager.navigation.PositionList;
import org.micromanager.utils.MMScriptException;

/**
 *
 * @author ramunnoj
 */
public class WellController {

    private MMStudioMainFrame gui;
    private CMMCore core;
    private AcquisitionEngine acq;
    private String xyStage;
    private String zStage;
    private double[] x;
    private double[] y;
    private double[] z;
    private MakeGrid grid;
    private int row;
    private int col;
    private PositionList list;
    private ArrayList<String[]> gridCenters;
    private double pixSize;
    private long imageHeight;
    private long imageWidth;
    private int startCol;
    private int startRow;
    private int overLapPercent;
    private Plane plane;
    private int[] size;

    public WellController(MMStudioMainFrame guiIN, CMMCore coreIN) {
        gui = guiIN;
        core = coreIN;
        acq = gui.getAcquisitionEngine();
        xyStage = core.getXYStageDevice();
        zStage = core.getFocusDevice();

        pixSize = core.getPixelSizeUm();
        imageHeight = core.getImageHeight();
        imageWidth = core.getImageWidth();


        //Position 0 is for the first box, 1 the second box, 2 the third box
        x = new double[3];
        y = new double[3];
        z = new double[3];

    }

    public void openMessage() {
        gui.showMessage("test");

    }

    public void setOverlap(int x) {
        overLapPercent = x;
    }

    public void setFirstBox() {
        try {
            x[0] = core.getXPosition(xyStage);
            y[0] = core.getYPosition(xyStage);
            z[0] = core.getPosition(zStage);

        } catch (Exception ex) {
            Logger.getLogger(WellController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void showList() {
        gui.showXYPositionList();
    }

    public void setPosition2() {

        try {
            x[1] = core.getXPosition(xyStage);
            y[1] = core.getYPosition(xyStage);
            z[1] = core.getPosition(zStage);
//System.out.println(Arrays.toString(x));
//System.out.println(Arrays.toString(y));
//System.out.println(Arrays.toString(z));
        } catch (Exception ex) {
            Logger.getLogger(WellController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void setPosition3() {
        try {
            x[2] = core.getXPosition(xyStage);
            y[2] = core.getYPosition(xyStage);
            z[2] = core.getPosition(zStage);


        } catch (Exception ex) {
            Logger.getLogger(WellController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setSecondBox() {

        try {
            x[1] = core.getXPosition(xyStage);
            y[1] = core.getYPosition(xyStage);
            z[1] = core.getPosition(zStage);

        } catch (Exception ex) {
            Logger.getLogger(WellController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void findFocusPlane() {
        plane = new Plane();
        Vector3D cVector3D1 = new Vector3D(x[0] - x[1], y[0] - y[1], z[0] - z[1]);
        Vector3D cVector3D2 = new Vector3D(x[0] - x[2], y[0] - y[2], z[0] - z[2]);
        plane.setNormalVector(cVector3D1, cVector3D2);
        plane.setInitialVector(new Vector3D(x[0], y[0], z[0]));
        try {
            list = gui.getPositionList();
            int num = list.getNumberOfPositions();

            for (int i = 0; i < num; i++) {
                MultiStagePosition currentPosition = list.getPosition(i);
                double X = currentPosition.getX();
                double Y = currentPosition.getY();
                double Z = currentPosition.getZ();
                System.out.println(Double.toString(X) + "   " + Double.toString(Y) + "   " + Double.toString(Z));
                Z = plane.computeZCoord(X, Y);
                System.out.println(Double.toString(X) + "   " + Double.toString(Y) + "   " + Double.toString(Z));

                MultiStagePosition msp = new MultiStagePosition(xyStage, X, Y, zStage, Z);
                msp.setLabel(currentPosition.getLabel());
                list.replacePosition(i, msp);
            }
        } catch (MMScriptException ex) {
            Logger.getLogger(WellController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setInit(int r, int c, int startr, int startc) {
        row = r;
        col = c;
        startRow = startr;
        startCol = startc;

    }

    public void makeGrid() {
        grid = new MakeGrid();
        grid.calculateAngle(x[0], y[0], x[1], y[1]);
        grid.makeGrid(row, col);
        double[][][] gridCorner = grid.getGridCorner();

        list = new PositionList();

        for (int x = 0; x <= row - 1; x = x + 1) {
            for (int y = 0; y <= col - 1; y = y + 1) {


                MultiStagePosition msp = new MultiStagePosition(xyStage, gridCorner[x][y][0], gridCorner[x][y][1], zStage, 100.0);
                msp.setLabel("Box Row " + Integer.toString(x) + "Col " + Integer.toString(y));
                msp.setProperty("Slide", "Number 1");
                System.out.println(Double.toString(gridCorner[x][y][0]) + "  " + Double.toString(gridCorner[x][y][1]));
                list.addPosition(msp);
            }
        }

        try {

            gui.setPositionList(list);
        } catch (MMScriptException ex) {
            Logger.getLogger(MultiWell.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    public void setTileSizes(int r, int c) {
        size = new int[2];
        size[0] = r;
        size[1] = c;

    }

    public void makeTiles() {
        try {
            PositionList list2 = gui.getPositionList();
            int num = list2.getNumberOfPositions();
            PositionList tileList = new PositionList();

            pixSize = core.getPixelSizeUm();
            imageHeight = core.getImageHeight();
            imageWidth = core.getImageWidth();

            for (int i = 0; i < num; i++) {
                int count = 0;
                MultiStagePosition tempPoint = list2.getPosition(i);
                String oldLabel = tempPoint.getLabel();
                double xPoint = tempPoint.getX();
                double yPoint = tempPoint.getY();
                double zPoint = tempPoint.getZ();

                for (int a = -(size[1] - 1) / 2; a <= (size[1] - 1) / 2; a++) {
                    for (int b = -(size[0] - 1) / 2; b <= (size[0] - 1) / 2; b++) {
                        count++;
                        MultiStagePosition msp = new MultiStagePosition(xyStage,
                                xPoint - a * pixSize * imageWidth * (100 - overLapPercent) / 100,
                                yPoint - b * pixSize * imageHeight * (100 - overLapPercent) / 100,
                                zStage, zPoint);
                        msp.setLabel(oldLabel + "_Field_" + Integer.toString(count));
                        tileList.addPosition(msp);
                    }
                }



            }
            try {
                gui.setPositionList(tileList);
            } catch (MMScriptException ex) {
                Logger.getLogger(WellController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (MMScriptException ex) {
            Logger.getLogger(WellController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void loadTemplate() {
        GridTemplate grid = new GridTemplate();
        grid.loadTemplete();
        gridCenters = grid.getGrid();
        int r = gridCenters.size();
        if (row <= r) {
            r = row;
        }


        list = new PositionList();

        //for (String[] rowPoints : gridCenters) {
        for (int i = startRow - 1; i < r; i++) {
            String[] rowPoints = gridCenters.get(i);

            int c = rowPoints.length - 2;

            if (2 * col - 2 < c) {
                c = 2 * col - 2;
            }
            for (int a = 2 * startCol - 2; a <= c; a = a + 2) {
                double xPoint = 1000 * Double.parseDouble(rowPoints[a]);
                double yPoint = 1000 * Double.parseDouble(rowPoints[a + 1]);

                MultiStagePosition msp = new MultiStagePosition(xyStage, x[0] - xPoint, yPoint + y[0], zStage, z[0]);
                msp.setLabel("Col " + Integer.toString((a + 2) / 2) + " Row " + Integer.toString(i + 1));


                list.addPosition(msp);
            }

        }
        try {

            gui.setPositionList(list);
        } catch (MMScriptException ex) {
            Logger.getLogger(MultiWell.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
