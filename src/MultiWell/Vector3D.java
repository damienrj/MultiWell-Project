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
    Vector3D cVector3D = (Vector3D) cVector;
    Vector3D cVectorResult = new Vector3D (cVector3D.mXCoord + mXCoord, 
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
  public Vector times(Field value) 
  {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
  public Vector3D times (double value)
  {
    Vector3D cVectorResult = new Vector3D (mXCoord * value, mYCoord * value, 
                                           mZCoord * value);
    
    return cVectorResult;
  }

  @Override
  public Field times(Vector vector) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
  public double times (Vector3D cVector3D)
  {
    return cVector3D.getXCoord () * mXCoord + cVector3D.getYCoord () * mYCoord 
           + cVector3D.getZCoord () * mZCoord;
  }

  @Override
  public Vector copy() 
  {
    Vector3D cVector3D = new Vector3D (mXCoord, mYCoord, mZCoord);
    
    return cVector3D;    
  }
  
  public Vector3D cross (Vector3D cVector3D)
  {
    Vector3D cVectorResult = new Vector3D ();
    
    cVectorResult.setXCoord (mYCoord * cVector3D.getZCoord () - mZCoord * cVector3D.getYCoord ());
    cVectorResult.setYCoord (mZCoord * cVector3D.getXCoord () - mXCoord * cVector3D.getZCoord ());
    cVectorResult.setZCoord (mXCoord * cVector3D.getYCoord () - mYCoord * cVector3D.getXCoord ());
    
    return cVectorResult;
  }
  
  public void display ()
  {
    System.out.println ("<" + mXCoord + ", " + mYCoord + ", " + mZCoord + '>');
  }
}
