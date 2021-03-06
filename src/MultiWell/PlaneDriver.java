/**
 * Creates a Plane class driver to test the Plane and Vector3D classes
 *
 * @author Alec Bowcock
 *
 * @version %I% %G%
 *
 * @since 1.0
 *
 * @see Plane
 */
package MultiWell;

public class PlaneDriver {

   /**
    * Main testing method
    *
    * @param args - command line arguments
    *
    * @since 1.0
    */
   public static void main(String[] args) {
      Vector3D cVector3D1 = new Vector3D(3, 14, 1);
      Vector3D cVector3D2 = new Vector3D(2, 4, 8);
      //Vector3D cVector3D3 = new Vector3D ();
      Plane cPlane = new Plane(cVector3D1);
      double zCoord = 0;

      System.out.println("initial position: ");
      cPlane.getInitialVector().display();
      cPlane.getInitialVector().opposite();
      cPlane.getInitialVector().display();

      /*
       System.out.println ("normal vector: ");
       cPlane.getNormalVector().display ();
      
       Vector3D cVectorNorm = new Vector3D (0.2, 0.1, 0.0);
      
       cPlane.setNormalVector(cVectorNorm);
      
       //cPlane.setNormalVector (cVector3D1, cVector3D2);
       cPlane.getNormalVector ().display ();
       //cPlane.setInitialVector(cVector3D1);
       //cPlane.getInitialVector().display();
      
       System.out.println ("z-coordinate: " + cPlane.computeZCoord(1, 0));
      
       /*
       System.out.println (cVector3D1.times(cVector3D2));
      
       cVector3D3 = (Vector3D) (cVector3D1.cross(cVector3D2)).copy ();
       cVector3D3.display ();
      
       */



   }
}
