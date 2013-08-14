/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiWell;

/**
 *
 * @author bowcocka
 */
public class Plane 
{
  static final double ERROR_CODE = -9999.0;
  
  private Vector3D mcNormalVector;
  private Vector3D mcInitialPosition;

  public Plane ()
  {
    mcNormalVector = new Vector3D ();
    mcInitialPosition = new Vector3D ();
  }

  public Plane (Vector3D cInitialPosition)
  {
    mcInitialPosition = new Vector3D ();
    mcNormalVector = new Vector3D ();
    
    mcInitialPosition = (Vector3D) cInitialPosition.copy ();
  }
  
  public Plane (Vector3D cInitialPosition, Vector3D cNormalVector)
  {
    mcInitialPosition = new Vector3D ();
    mcNormalVector = new Vector3D ();
    
    mcNormalVector = (Vector3D) cNormalVector.copy ();
    mcInitialPosition = (Vector3D) cInitialPosition.copy ();
  }

  public Vector3D getNormalVector ()
  {
    return mcNormalVector;
  }

  public void setNormalVector (Vector3D cVector)
  {
    mcNormalVector =  (Vector3D) cVector.copy ();
  }

  public void setNormalVector (Vector3D cVector1, Vector3D cVector2)
  { 
    mcNormalVector = (Vector3D) (cVector1.cross (cVector2)).copy (); 
  }

  public Vector3D getInitialVector ()
  {
    return mcInitialPosition;
  }
  
  public void setInitialVector (Vector3D cVector)
  {
    mcInitialPosition = (Vector3D) cVector.copy ();
  }
  
  /*
  public boolean computeZCoordWrapper (double xCoord, double yCoord)
  {
    //should wrap because of error code
  }
  */
  public double computeZCoord (double xCoord, double yCoord)
  { 
    double zCoord = ERROR_CODE;
    
    if (mcNormalVector.getZCoord () != 0)
    {
      zCoord = (mcNormalVector.getZCoord () * mcInitialPosition.getZCoord () 
             - mcNormalVector.getXCoord () 
             * (xCoord - mcInitialPosition.getXCoord ()) 
             - mcNormalVector.getYCoord () 
             * (yCoord - mcInitialPosition.getYCoord ())) 
             / mcNormalVector.getZCoord ();
    }
    
    return zCoord;
  }
}
