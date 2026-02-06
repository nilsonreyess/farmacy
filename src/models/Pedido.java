
package models;

import java.util.ArrayList;

public class Pedido {
    // Attributes
    String medicamento;
    String tipo_medicamento;
    int cantidad;
    String distribuidor;
    ArrayList <String> sucursal;
    
    // Construct
    public Pedido() {
    }

    public Pedido(String medicamento, String tipo_medicamento, int cantidad, String distribuidor) {
        this.medicamento = medicamento;
        this.tipo_medicamento = tipo_medicamento;
        this.cantidad = cantidad;
        this.distribuidor = distribuidor;
    }
    
    // Getters and Setters
    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getTipo_medicamento() {
        return tipo_medicamento;
    }

    public void setTipo_medicamento(String tipo_medicamento) {
        this.tipo_medicamento = tipo_medicamento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }

    public ArrayList<String> getSucursal() {
        return sucursal;
    }

    public void setSucursal(ArrayList<String> sucursal) {
        this.sucursal = sucursal;
    }
    
}
