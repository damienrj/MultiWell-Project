/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiWell;

import mmcorej.CMMCore;
import org.micromanager.MMStudioMainFrame;
import org.micromanager.api.AcquisitionEngine;

/**
 *
 * @author ramunnoj
 */
public class WellController {
    private  MMStudioMainFrame gui;
    private  CMMCore core;
    private  AcquisitionEngine acq;
    private  String xyStage;
    private  String zStage;

    public WellController(MMStudioMainFrame guiIN, CMMCore coreIN) {
       gui = guiIN;
       core = coreIN;
        acq = gui.getAcquisitionEngine();
        xyStage = core.getXYStageDevice();
        zStage = core.getFocusDevice();
        
    }
    
    public void openMessage(){
    gui.showMessage("test");
    
    }
}
