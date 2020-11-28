package com.mycompany.softwaredistribucionmedicamentos;

public class Doctor {
    
    private String nombre;
    private String cedula;
    private String centroMedico;

    public Doctor() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula){
        this.cedula = cedula;
    }
    
    public String getCedula(){
        return cedula;
    }
    
    public String getCentroMedico() {
        return centroMedico;
    }

    public void setCentroMedico(String centroMedico) {
        this.centroMedico = centroMedico;
    }
    
}
