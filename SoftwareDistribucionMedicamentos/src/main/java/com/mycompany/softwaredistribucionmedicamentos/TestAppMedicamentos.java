package com.mycompany.softwaredistribucionmedicamentos;

public class TestAppMedicamentos {

    public static void main(String[] args) {
        
        AdministradorApp iniciaApp = new AdministradorApp("Admin");
        iniciaApp.setGeneraOrdenEntrega();
        iniciaApp.getConsultaInventario();
    }

}
