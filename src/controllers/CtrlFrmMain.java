
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Pedido;
import views.FrmImprime;
import views.FrmMain;

public class CtrlFrmMain implements ActionListener{
    // Attributes
    FrmMain frmMain = new FrmMain();
    
    // Construct
    public CtrlFrmMain(FrmMain frm) {
        this.frmMain = frm;
        this.frmMain.btnConfirmar.addActionListener(this);
        this.frmMain.btnBorrar.addActionListener(this);
        ocultarMensajesdeError();
    }
    
    // Method 
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.frmMain.btnConfirmar) {
            boolean validar = validarCampos();
            
            if (validar) {
                ocultarMensajesdeError();
                
                Pedido p = new Pedido();
                p.setMedicamento(this.frmMain.txtMedicamento.getText());
                p.setTipo_medicamento(this.frmMain.cmbTipoMedicamento.getSelectedItem().toString());
                p.setCantidad((int) this.frmMain.spnCantidad.getValue());
                // p.distribuidor
                // p.sucursal
                limpiar();
                
                FrmImprime frmImprime = new FrmImprime();
                CtrlFrmImprime ctrlImprime = new CtrlFrmImprime(frmImprime, p);
                
                frmImprime.setVisible(true);
                frmImprime.setLocationRelativeTo(frmMain);
            } 
        }
        if (e.getSource() == this.frmMain.btnBorrar) {
            limpiar();
        }
    }
    
    // Method Perzonalied
    public void ocultarMensajesdeError() {
        this.frmMain.lblErrMedicamento.setVisible(false);
        this.frmMain.lblErrTipoMedicamento.setVisible(false);
        this.frmMain.lblErrCantidad.setVisible(false);
        this.frmMain.lblErrDistribuidor.setVisible(false);
        this.frmMain.lblErrSucursal.setVisible(false);
    }
    
    private void limpiar() {
        //Limpia los campos
        this.frmMain.txtMedicamento.setText("");
        this.frmMain.cmbTipoMedicamento.setSelectedIndex(0);
        this.frmMain.spnCantidad.setValue(0);
        this.frmMain.btgDistribuidor.clearSelection();
        this.frmMain.chkPrincipal.setSelected(false);
        this.frmMain.chkSucursal.setSelected(false);
        ocultarMensajesdeError();
    }
    
    public boolean validarCampos() {
        boolean validate = true;
        ocultarMensajesdeError();
        if (this.frmMain.txtMedicamento.getText().isEmpty()) {
            validate = false;
            this.frmMain.lblErrMedicamento.setVisible(true);
        }
        if (this.frmMain.cmbTipoMedicamento.getSelectedItem().equals("Seleccione")) {
            validate = false;
            this.frmMain.lblErrTipoMedicamento.setVisible(true);
        }
        if (this.frmMain.spnCantidad.getValue().equals(0)) {
            validate = false;
            this.frmMain.lblErrCantidad.setVisible(true);
        }
        // Button
        // CheckBox
        
        return validate;
    }
    
    
}
