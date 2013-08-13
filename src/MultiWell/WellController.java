/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiWell;

import java.util.ArrayList;
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
    private final double pixSize;
    private final long imageHeight;
    private final long imageWidth;

    public WellController(MMStudioMainFrame guiIN, CMMCore coreIN) {
        gui = guiIN;
        core = coreIN;
        acq = gui.getAcquisitionEngine();
        xyStage = core.getXYStageDevice();
        zStage = core.getFocusDevice();

        pixSize = core.getPixelSizeUm();
        imageHeight = core.getImageHeight();
        imageWidth = core.getImageWidth();


        //Position 1 is for the first box, 2 the second box
        x = new double[2];
        y = new double[2];
        z = new double[2];

    }

    public void openMessage() {
        gui.showMessage("test");

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

    public void setSecondBox() {

        try {
            x[1] = core.getXPosition(xyStage);
            y[1] = core.getYPosition(xyStage);
            z[1] = core.getPosition(zStage);

        } catch (Exception ex) {
            Logger.getLogger(WellController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setRows(int r) {
        row = r;

    }

    public void setCols(int c) {
        col = c;
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
        for (int i = 0; i<r; i++) {
            String[] rowPoints = gridCenters.get(i);

            int c = rowPoints.length - 2;

            if (2*col-2 < c){
                c=2*col-2;
            }
            for (int a = 0; a <= c; a = a + 2) {
                double xPoint = 1000 * Double.parseDouble(rowPoints[a]);
                double yPoint = 1000 * Double.parseDouble(rowPoints[a + 1]);

                MultiStagePosition msp = new MultiStagePosition(xyStage, x[0] - xPoint, yPoint + y[0], zStage, z[0]);
                msp.setLabel("Col " + Integer.toString((a + 2) / 2) + " Row " + Integer.toString(i+1));


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
