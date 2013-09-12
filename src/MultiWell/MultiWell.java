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
import org.micromanager.api.AcquisitionEngine;
import org.micromanager.api.ScriptInterface;
import org.micromanager.utils.ReportingUtils;
import org.micromanager.navigation.PositionList;
import org.micromanager.navigation.MultiStagePosition;
import org.micromanager.utils.MMScriptException;

/**
 *
 * @author ramunnoj
 */
public class MultiWell implements org.micromanager.api.MMPlugin {

    public static String menuName = "Multi-Well plugin";
    public static String tooltipDescription = "A test plugin";
    private CMMCore core;
    private MMStudioMainFrame gui;
    private AcquisitionEngine acq;
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
        acq = gui.getAcquisitionEngine();
        xyStage = core.getXYStageDevice();
        zStage = core.getFocusDevice();
    }

    @Override
    public void show() {
        WellController controller = new WellController(gui, core);
       
        
        MultiWellGui guiWindow= new MultiWellGui();
        guiWindow.setVisible(true);
        guiWindow.setController(controller);
        

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
