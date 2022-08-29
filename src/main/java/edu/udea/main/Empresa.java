package edu.udea.main.model;

public class Empresa {
    //ATRIBUTOS
    public String nombreEmpresa;
    public String direccionEmpresa;
    public String telefonoEmpresa;
    public String NitEmpresa;

    //CONSTRUCTOR


    public Empresa(String nombreEmpresa, String direccionEmpresa, String telefonoEmpresa, String nitEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        NitEmpresa = nitEmpresa;
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
