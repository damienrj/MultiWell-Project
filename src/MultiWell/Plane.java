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
  private Vector3D mcNormalVector;
  private Vector3D mcInitialPosition;

  public Plane ()
  {
    mcNormalVector.setXCoord (0.0);
    mcNormalVector.setYCoord (0.0);
    mcNormalVector.setZCoord (0.0);

    mcInitialPosition.setXCoord (-99.0);
    mcInitialPosition.setYCoord (-99.0);
    mcInitialPosition.setZCoord (-99.0);
  }

  public Plane (Vector3D cNormalVector, Vector3D cInitialPosition)
  {
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

  public double computeZCoord (double xCoord, double yCoord)
  {
    return (mcNormalVector.getZCoord () * mcInitialPosition.getZCoord () 
            - mcNormalVector.getZCoord () 
            * (xCoord - mcInitialPosition.getXCoord ()) 
            - mcNormalVector.getYCoord () 
            * (yCoord - mcInitialPosition.getYCoord ())) 
            / mcNormalVector.getZCoord ();
  }
}
