/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiWell;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

import org.micromanager.api.ScriptInterface;
import mmcorej.CMMCore;
import org.micromanager.MMStudioMainFrame;

import org.micromanager.api.ScriptInterface;
import org.micromanager.utils.ReportingUtils;
import org.micromanager.api.*;

/**
 *
 * @author ramunnoj
 */
public class MultiWell implements org.micromanager.api.MMPlugin {

   public static String menuName = "Multi-Well plugin";
   public static String tooltipDescription = "A automated data collection plugin";
   private CMMCore core;
   private MMStudioMainFrame gui;
   //private AcquisitionEngine acq;
   private String xyStage;
   private String zStage;

   @Override
   public void dispose() {
      /*
       * you can put things that need to be run on shutdown here
       * note: if you launch a JDialog from the plugin using show(), shutdown of the dialog will not automatically call dispose()
       * You will need to add a call to dispose() from the formWindowClosing() method of your JDialog.
       */
   }

   @Override
   public void setApp(ScriptInterface app) {
      gui = (MMStudioMainFrame) app;
      core = app.getMMCore();
      //acq = gui.getAcquisitionEngine();
      xyStage = core.getXYStageDevice();
      zStage = core.getFocusDevice();
   }

   @Override
   public void show() {
      //This Section creates the gui
      MultiWellGui guiWindow = new MultiWellGui();


      //This section creates the controller, and passes controller to GUI
      WellController controller = new WellController(gui, core);
      guiWindow.setVisible(true);
      guiWindow.setController(controller);

   }



   @Override
   public String getDescription() {
      return "Description: This plugin is ment to automate data collection";
   }

   @Override
   public String getInfo() {
      return "Info: This plugin is ment to automate data collection";
   }

   @Override
   public String getVersion() {
      return "1.0";
   }

   @Override
   public String getCopyright() {
      return "This software is by Damien Ramunno-Johnson";
   }
}
