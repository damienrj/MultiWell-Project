/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiWell;

import org.micromanager.api.ScriptInterface;
import mmcorej.CMMCore;
import org.micromanager.MMStudioMainFrame;
import org.micromanager.api.AcquisitionEngine;
import org.micromanager.api.ScriptInterface;
import org.micromanager.utils.ReportingUtils;

/**
 *
 * @author ramunnoj
 */
public class MultiWell implements org.micromanager.api.MMPlugin {

    public static String menuName = "Hello world plugin";
    public static String tooltipDescription = "A test plugin";
    private CMMCore core;
    private MMStudioMainFrame gui;
    private AcquisitionEngine acq;

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
        acq = gui.getAcquisitionEngine();
    }

    @Override
    public void show() {
     gui.showMessage("Hello world! "); 
    }

    @Override
    public void configurationChanged() {
      // TODO Auto-generated method stub  
    }

    @Override
    public String getDescription() {
return "Description: Hello world";
    }

    @Override
    public String getInfo() {
return "Info: Hello world";
    }

    @Override
    public String getVersion() {
return "1.0";
    }

    @Override
    public String getCopyright() {
return "test";
    }
}
