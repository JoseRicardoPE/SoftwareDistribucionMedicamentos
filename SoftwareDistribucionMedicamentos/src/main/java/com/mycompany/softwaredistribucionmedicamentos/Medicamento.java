package com.mycompany.softwaredistribucionmedicamentos;

public class Medicamento {

    private String nombre;
    private int cantidad;
    private String laboratorio;

    public Medicamento() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    @Override
    public String toString() {
        return "Medicamento{" + "nombre=" + nombre + ", cantidad=" + cantidad + ", laboratorio=" + laboratorio + '}';
    }
    
    
}
