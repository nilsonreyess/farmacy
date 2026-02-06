
package farmacy;

import controllers.CtrlFrmMain;
import views.FrmMain;

public class Farmacy {

    public static void main(String[] args) {
        FrmMain frmMain = new FrmMain();
        CtrlFrmMain ctrlMain = new CtrlFrmMain(frmMain);
        
        frmMain.setVisible(true);
        frmMain.setLocationRelativeTo(null);
    }
    
}
