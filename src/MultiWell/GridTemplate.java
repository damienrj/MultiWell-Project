/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiWell;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JFileChooser;

/**
 *
 * @author ramunnoj
 */
public class GridTemplate {

    private String csvFile;
    private String line = "";
    private String csvSplitBy = ",";
    private LineNumberReader br = null;
    private ArrayList<String[]> data = new ArrayList<String[]>();

    public GridTemplate(String file) {
        csvFile = file;
    }

    public GridTemplate() {
        JFileChooser fileopen = new JFileChooser();

        int ret = fileopen.showDialog(null, "Open file");

        if (ret == JFileChooser.APPROVE_OPTION) {
            File file = fileopen.getSelectedFile();
            csvFile=file.toString();
            System.out.println(file);
        }
    }

    public void loadTemplete() {
        try {
            br = new LineNumberReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                //Use Comma as seperator
                data.add(line.split(csvSplitBy));
                System.out.println(line);
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
