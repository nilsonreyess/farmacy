
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.Pedido;
import views.FrmImprime;

public class CtrlFrmImprime implements ActionListener{
    // Attributes
    FrmImprime frm = new FrmImprime();
    Pedido p = new Pedido();
    
    // Construct
    public CtrlFrmImprime(FrmImprime frm, Pedido p) {
        this.frm = frm;
        this.p = p;
        this.frm.setTitle("Resumen de pedido");
        this.frm.btnEnviar.addActionListener(this);
        this.frm.btnCancelar.addActionListener(this);
        cargarPedido();
    }
    
    // Method 
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.frm.btnEnviar) {
            JOptionPane.showMessageDialog(frm, "El pedido ha sido procesado.");
            this.frm.dispose();
        }
        if (e.getSource() == this.frm.btnCancelar) {
            
        }
    }
    
    // Method Personalized
    public void cargarPedido() {
        // Pedido realizado
        this.frm.lblPedido.setText("Medicamento: " + this.p.getMedicamento());
        
        // Enviar a
        this.frm.lblDespachar.setText("Despachar a: SIn información");
    }
}
