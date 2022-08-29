package edu.udea.main.model;

public class Empresa {
    //ATRIBUTOS
    private String nombreEmpresa;
    private String direccionEmpresa;
    private String telefonoEmpresa;
    private String NitEmpresa;

    //CONSTRUCTOR


    public Empresa(String nombreEmpresa, String direccionEmpresa, String telefonoEmpresa, String NitEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.NitEmpresa = NitEmpresa;
    }
    
        public void EditarEmpresa(String nombreEmpresa, String direccionEmpresa, String telefonoEmpresa, String NitEmpresa){
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.NitEmpresa = NitEmpresa;
    }
    
    
    //GETTERS AND SETTERS
    public String getNombreEmpresa() {

        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {

        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccionEmpresa() {

        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {

        this.direccionEmpresa = direccionEmpresa;
    }

    public String getTelefonoEmpresa() {

        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {

        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getNitEmpresa(){
    return NitEmpresa;
    }

    public void setNitEmpresa(String NitEmpresa) {

        this.NitEmpresa = NitEmpresa;
    }
}
