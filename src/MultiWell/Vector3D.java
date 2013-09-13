/**
 * Creates a three dimensional (3D) vector class
 *
 * @author Alec Bowcock
 *
 * @version %I% %G%
 *
 * @since 1.0
 */
package MultiWell;

import org.jscience.mathematics.structure.Field;
import org.jscience.mathematics.vector.Vector;

public class Vector3D extends Vector {

   /**
    * *********************
    * Constants **********************
    */
   static final int DIMENSION = 3;
   private double mXCoord;
   private double mYCoord;
   private double mZCoord;

   /**
    * Initializes the coordinates of the 3D vector to 0
    *
    * @since 1.0
    */
   public Vector3D() {
      mXCoord = mYCoord = mZCoord = 0.0;
   }

   /**
    * Initializes the coordinates of the 3D vector to the passed in values
    *
    * @param xCoord - a x-coordinate
    *
    * @param yCoord - a y-coordinate
    *
    * @param zCoord - a z-coordinate
    *
    * @since 1.0
    */
   public Vector3D(double xCoord, double yCoord, double zCoord) {
      mXCoord = xCoord;
      mYCoord = yCoord;
      mZCoord = zCoord;
   }

   /**
    * Returns the dimension of the vector
    *
    * @return the dimension of the vector
    *
    * @since 1.0
    */
   @Override
   public int getDimension() {
      return DIMENSION;
   }

   /**
    *
    * @param element - a particular element of a 3D vector
    *
    * @return
    * @since 1.0
    */
   @Override
   public Field get(int element) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   /**
    * Returns the x-coordinate
    *
    * @return the x-coordinate
    *
    * @since 1.0
    */
   public double getXCoord() {
      return mXCoord;
   }

   /**
    * Sets the x-coordinate to the passed in value
    *
    * @param xCoord - a x-coordinate
    *
    * @since 1.0
    */
   public void setXCoord(double xCoord) {
      mXCoord = xCoord;
   }

   /**
    * Returns the y-coordinate
    *
    * @return the y-coordinate
    *
    * @since 1.0
    */
   public double getYCoord() {
      return mYCoord;
   }

   /**
    * Sets the y-coordinate to the passed in value
    *
    * @param yCoord - a y-coordinate
    *
    * @since 1.0
    */
   public void setYCoord(double yCoord) {
      mYCoord = yCoord;
   }

   /**
    * Returns the z-coordinate
    *
    * @return the z-coordinate
    *
    * @since 1.0
    */
   public double getZCoord() {
      return mZCoord;
   }

   /**
    * Sets the z-coordinate to the passed in value
    *
    * @param zCoord - a z-coordinate
    *
    * @since 1.0
    */
   public void setZCoord(double zCoord) {
      mZCoord = zCoord;
   }

   /**
    * Returns a vector that has been reflected across the plane defined by the
    * original vector
    *
    * @return a 3D vector that is antiparallel to the original vector
    *
    * @since 1.0
    */
   @Override
   public Vector opposite() {
      Vector3D cVector3D = new Vector3D();

      return cVector3D.times(-1.0);
   }

   /**
    * Returns the sum of the calling vector and the passed in vector
    *
    * @param cVector - a vector
    *
    * @return the sum of two vectors
    *
    * @since 1.0
    */
   @Override
   public Vector plus(Vector cVector) {
      Vector3D cVector3D = (Vector3D) cVector;
      Vector3D cVectorResult = new Vector3D(cVector3D.mXCoord + mXCoord,
              cVector3D.mYCoord + mYCoord,
              cVector3D.mZCoord + mZCoord);

      return cVectorResult;
   }
   /*
    public Vector3D plus(Vector3D cVector3D) 
    {
    Vector3D cVectorResult = new Vector3D ();
    
    cVectorResult.mXCoord = cVector3D.mXCoord + mXCoord;
    cVectorResult.mYCoord = cVector3D.mYCoord + mYCoord;
    cVectorResult.mZCoord = cVector3D.mZCoord + mZCoord;
     
    return cVectorResult;
    }
    */

   @Override
   public Vector times(Field value) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   /**
    * Returns a 3D vector that has been multiplied by the passed in scalar
    * quantity
    *
    * @param value - a scalar quantity
    *
    * @return a 3D vector
    *
    * @since 1.0
    */
   public Vector3D times(double value) {
      Vector3D cVectorResult = new Vector3D(mXCoord * value, mYCoord * value,
              mZCoord * value);

      return cVectorResult;
   }

   @Override
   public Field times(Vector vector) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   /**
    * Calculates the dot product of two 3D vectors
    *
    * @param cVector3D - a 3D vector
    *
    * @return the dot product (scalar quantity)
    *
    * @since 1.0
    */
   public double times(Vector3D cVector3D) {
      return cVector3D.getXCoord() * mXCoord + cVector3D.getYCoord() * mYCoord
              + cVector3D.getZCoord() * mZCoord;
   }

   /**
    * Copies the vector calling the method
    *
    * @return a copy of the vector
    *
    * @since 1.0
    */
   @Override
   public Vector copy() {
      Vector3D cVector3D = new Vector3D(mXCoord, mYCoord, mZCoord);

      return cVector3D;
   }

   /**
    * Calculates the cross product of two 3D vectors; the 3D vector calling the
    * method is the multiplicand and the passed in vector is the multiplier i.e.
    *
    * this X cVector3D
    *
    * @param cVector3D - a 3D vector
    *
    * @return the cross product
    *
    * @since 1.0
    */
   public Vector3D cross(Vector3D cVector3D) {
      Vector3D cVectorResult = new Vector3D();

      cVectorResult.setXCoord(mYCoord * cVector3D.getZCoord() - mZCoord * cVector3D.getYCoord());
      cVectorResult.setYCoord(mZCoord * cVector3D.getXCoord() - mXCoord * cVector3D.getZCoord());
      cVectorResult.setZCoord(mXCoord * cVector3D.getYCoord() - mYCoord * cVector3D.getXCoord());

      return cVectorResult;
   }

   /**
    * Displays to the screen the coordinates of the 3D vector calling the method
    * in the form:
    *
    * <x, y, z>
    *
    * @since 1.0
    */
   public void display() {
      System.out.println("<" + mXCoord + ", " + mYCoord + ", " + mZCoord + '>');
   }
}
