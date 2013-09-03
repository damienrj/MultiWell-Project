/**
 * Creates a two dimensional Plane class
 * 
 * @author Alec Bowcock
 * 
 * @version %I% %G%
 * 
 * @since 1.0
 */

package MultiWell;

public class Plane 
{
  /***********************
  *   Constants 
  ************************/ 
  static final double ERROR_CODE = -9999.0;
  
  private Vector3D mcNormalVector;
  private Vector3D mcInitialPosition;

  /**
   * Initializes the normal vector and initial position vector to default values
   * 
   * @since 1.0
   */
  
  public Plane ()
  {
    mcNormalVector = new Vector3D ();
    mcInitialPosition = new Vector3D ();
  }

  /*
   * Initializes the initial position vector to the passed in vector; 
   * initilizes the normal vector to default values.
   * 
   * @param cInitialPosition - the initial position vector
   * 
   * @since 1.0
   */
  
  public Plane (Vector3D cInitialPosition)
  {
    mcInitialPosition = new Vector3D ();
    mcNormalVector = new Vector3D ();
    
    mcInitialPosition = (Vector3D) cInitialPosition.copy ();
  }
  
  /**
   * Initializes the initial position vector and normal vector to the passed in 
   * vectors
   * 
   * @param cInitialPosition - the initial position vector
   * 
   * @param cNormalVector    - the normal vector 
   * 
   * @since 1.0
   */
  
  public Plane (Vector3D cInitialPosition, Vector3D cNormalVector)
  {
    mcInitialPosition = new Vector3D ();
    mcNormalVector = new Vector3D ();
    
    mcNormalVector = (Vector3D) cNormalVector.copy ();
    mcInitialPosition = (Vector3D) cInitialPosition.copy ();
  }

  /**
   * Returns the normal vector
   * 
   * @return the normal vector
   * 
   * @since 1.0
   */
  
  public Vector3D getNormalVector ()
  {
    return mcNormalVector;
  }

  /**
   * Sets the normal vector to the passed in vector
   * 
   * @param cVector - a 3D vector
   * 
   * @since 1.0
   */
  
  public void setNormalVector (Vector3D cVector)
  {
    mcNormalVector =  (Vector3D) cVector.copy ();
  }

  /**
   * Sets the normal vector by computing the cross product of the passed in 
   * vectors
   * 
   * @param cVector1 - a 3D vector
   *
   * @param cVector2 - a 3D vector
   * 
   * @since 1.0
   */
  
  public void setNormalVector (Vector3D cVector1, Vector3D cVector2)
  { 
    mcNormalVector = (Vector3D) (cVector1.cross (cVector2)).copy (); 
  }

  /**
   * Returns the initial position vector 
   * 
   * @return the initial position vector 
   * 
   * @since 1.0
   */
  
  public Vector3D getInitialVector ()
  {
    return mcInitialPosition;
  }
  
  /**
   * Sets the initial position vector using the passed in vector
   * 
   * @param cVector - a 3D vector
   * 
   * @since 1.0
   */
  
  public void setInitialVector (Vector3D cVector)
  {
    mcInitialPosition = (Vector3D) cVector.copy ();
  }
  
  /**
   * Computes the z-coordinate for a given point on the plane using the 
   * x-coordinate and y-coordinate of the point
   * 
   * @param xCoord - the x-coordinate of the point 
   * 
   * @param yCoord - the y-coordinate of the point
   * 
   * @return the z-coordinate of the point in question
   * 
   * @since 1.0
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
