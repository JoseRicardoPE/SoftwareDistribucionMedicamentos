package com.mycompany.softwaredistribucionmedicamentos;

public class AdministradorApp {

    private String usuario;

    public AdministradorApp(String usuario) {
        this.usuario = usuario;
    }
    
    public void nuevaCuenta(){
        
    }
    
    public void nuevoPaciente(){
        
    }
    
    public String getConsultarMedicamento(){
        return "medicamento";
    }
    
    public String getDisponibilidadMedicamento(){
        return "disponibilidad";
    }
    
    public void setGeneraOrdenEntrega(){
        
    }
    
    public String getGeneraOrdenEntrega(){
        return "ordenEntrega";
    }
    
    public String getConsultaInventario(){
        return "inventario";
    }
}
