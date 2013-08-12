/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiWell;

import org.jscience.mathematics.structure.Field;
import org.jscience.mathematics.vector.Vector;

/**
 *
 * @author Alec Bowcock
 */
public class Vector3D extends Vector
{
  static final int DIMENSION = 3;
  
  private double mXCoord;
  private double mYCoord;
  private double mZCoord;
  
  public Vector3D ()
  {
    mXCoord = mYCoord = mZCoord = 0.0;
  }
  
  public Vector3D (double xCoord, double yCoord, double zCoord)
  {
    mXCoord = xCoord;
    mYCoord = yCoord;
    mZCoord = zCoord;
  }
  
  @Override
  public int getDimension()
  {
    return DIMENSION;
  }

  @Override
  public Field get(int element) 
  {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
  public double getXCoord ()
  {
    return mXCoord;
  }
  
  public void setXCoord (double xCoord)
  {
    mXCoord = xCoord;
  }
  
  public double getYCoord ()
  {
    return mYCoord;
  }
  
  public void setYCoord (double yCoord)
  {
    mYCoord = yCoord;
  }
  
  public double getZCoord ()
  {
    return mZCoord;
  }
  
  public void setZCoord (double zCoord)
  {
    mZCoord = zCoord;
  }
  
  @Override
  public Vector opposite() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Vector plus(Vector cVector) 
  {
    Vector3D cVectorResult = new Vector3D ();
    Vector3D cVector3D = (Vector3D) cVector;
    
    cVectorResult.mXCoord = cVector3D.mXCoord + mXCoord;
    cVectorResult.mYCoord = cVector3D.mYCoord + mYCoord;
    cVectorResult.mZCoord = cVector3D.mZCoord + mZCoord;
    
    return cVectorResult;
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
  public Vector times(Field f) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Field times(Vector vector) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Vector copy() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
  
}
