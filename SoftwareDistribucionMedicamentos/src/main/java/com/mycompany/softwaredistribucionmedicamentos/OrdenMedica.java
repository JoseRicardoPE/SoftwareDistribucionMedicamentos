package com.mycompany.softwaredistribucionmedicamentos;

public class OrdenMedica {

    private int codigoOrden;
    private String nombrePaciente;
    private String nombreMedicamento;
    private String diagnostico;
    private boolean incapacidad;
    private String dosis;
    private String eps;

    public OrdenMedica() {
    }
    
    public int getCodigoOrden() {
        return codigoOrden;
    }

    public void setCodigoOrden(int codigoOrden) {
        this.codigoOrden = codigoOrden;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public boolean isIncapacidad() {
        return incapacidad;
    }

    public void setIncapacidad(boolean incapacidad) {
        this.incapacidad = incapacidad;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }
   
    
}
