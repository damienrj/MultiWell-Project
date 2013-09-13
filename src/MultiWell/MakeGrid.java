/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiWell;

import static java.lang.Math.*;

/**
 *
 * @author ramunnoj
 */
public class MakeGrid {

   private double r;
   private double deltaY;
   private double angle;
   private double deltaX;
   private double[][][] gridCorner;

   public void calculateAngle(double x1, double y1, double x2, double y2) {
      r = sqrt(pow(x1 - x2, 2) + pow(y1 - y2, 2));
      deltaY = abs(y1 - y2);
      angle = asin(deltaY / r);
      deltaX = abs(x1 - x2);

   }

   public void makeGrid(int r, int c) {

      gridCorner = new double[r][c][2];

      for (int x = 0; x <= r - 1; x = x + 1) {
         for (int y = 0; y <= c - 1; y = y + 1) {

            gridCorner[x][y][0] = x;
            gridCorner[x][y][1] = y;



         }
      }

   }

   public double[][][] getGridCorner() {
      return gridCorner;
   }
}