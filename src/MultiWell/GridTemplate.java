/**
 * Creates a grid based on the template file
 *
 * @author Damien Ramunno-Johnson
 *
 *
 * @since 1.0
 */
package MultiWell;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class GridTemplate {

   private String csvFile;
   private String line = "";
   private String csvSplitBy = ",";
   private LineNumberReader br = null;
   private ArrayList<String[]> data = new ArrayList<String[]>();

   public GridTemplate(String file) {
      csvFile = file;
   }

      /**
    * Constructor for GridTemplate
    * 
    * A file open window appears, asking for the *.csv file which contains the
    * grid spacing pattern
    *
    * @since 1.0
    */
   public GridTemplate() {
      JFileChooser fileopen = new JFileChooser();
      FileNameExtensionFilter filter = new FileNameExtensionFilter("csv files", "csv");
      fileopen.addChoosableFileFilter(filter);

      int ret = fileopen.showDialog(null, "Open file");

      if (ret == JFileChooser.APPROVE_OPTION) {
         File file = fileopen.getSelectedFile();
         csvFile = file.toString();
         System.out.println(file);
      }
   }
   /**
    * Get method for grid
    *
    * @since 1.0
    */
   public ArrayList<String[]> getGrid() {
      return data;
   }
   /**
    * Loads the csv file containing grid information
    *
    * @since 1.0
    */
   public void loadTemplete() {

      try {
         br = new LineNumberReader(new FileReader(csvFile));
         while ((line = br.readLine()) != null) {
            //Use Comma as seperator
            data.add(line.split(csvSplitBy));
            //System.out.println(line);
         }

      } catch (FileNotFoundException e) {
         e.printStackTrace();

      } catch (IOException e) {
         e.printStackTrace();
      } finally {
         if (br != null) {
            try {
               br.close();
            } catch (IOException e) {
               e.printStackTrace();
            }
         }
      }
   }
}
