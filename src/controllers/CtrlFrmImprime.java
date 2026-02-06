
package controllers;

import models.Pedido;
import views.FrmImprime;

public class CtrlFrmImprime {
    // Attributes
    FrmImprime frm = new FrmImprime();
    Pedido p = new Pedido();
    
    // Construct
    public CtrlFrmImprime(FrmImprime frm, Pedido p) {
        this.frm = frm;
        this.p = p;
        this.frm.lblPedido.setText("Medicamento: " + this.p.getMedicamento());
    }
    
}
