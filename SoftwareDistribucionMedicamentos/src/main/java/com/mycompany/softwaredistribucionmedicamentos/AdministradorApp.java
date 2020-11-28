package com.mycompany.softwaredistribucionmedicamentos;

public class AdministradorApp {

    private String usuario;
    private String medicamento;
    private boolean disponibilidad;
    private String ordenEntrega;
    private String inventario;

    public AdministradorApp(String usuario) {
        this.usuario = usuario;
    }
    
    public void nuevaCuenta(){
        
    }
    
    public void nuevoPaciente(){
        
    }
    
    public String getConsultarMedicamento(){
        return medicamento;
    }
    
    public boolean getDisponibilidadMedicamento(){
        return disponibilidad;
    }
    
    public void setGeneraOrdenEntrega(){
        
    }
    
    public String getGeneraOrdenEntrega(){
        return ordenEntrega;
    }
    
    public String getConsultaInventario(){
        return inventario;
    }
}
