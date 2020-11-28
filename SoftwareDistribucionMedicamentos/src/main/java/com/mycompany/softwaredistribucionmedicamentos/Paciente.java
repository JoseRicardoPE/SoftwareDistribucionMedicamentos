package com.mycompany.softwaredistribucionmedicamentos;

import java.util.Date;

public class Paciente {

    private String nombre;
    private String cedula;
    private Date fechaNacimiento;
    private int edad;
    private String eps;
    private String diagnostico;

    public Paciente() {
    }

    public Paciente(String nombre, String cedula, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre + ", cedula=" + cedula + ", fechaNacimiento=" + fechaNacimiento + ", edad=" + edad + ", eps=" + eps + ", diagnostico=" + diagnostico + '}';
    }
    
}
