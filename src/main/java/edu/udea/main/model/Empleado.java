package edu.udea.main.model;

public class Empleado {
    //ATRIBUTOS
    private String nombreEmpleado;
    private String correoEmpleado;
    private String empresaEmpleado;
    private String rolEmpleado;

    //CONSTRUCTOR

    public Empleado(String nombreEmpleado, String correoEmpleado, String empresaEmpleado, String rolEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.empresaEmpleado = empresaEmpleado;
        this.rolEmpleado = rolEmpleado;
    }

    //GETTERS AND SETTERS

    public String getNombreEmpleado() {

        return nombreEmpleado;

    }

    public void setNombreEmpleado(String nombreEmpleado) {

        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreoEmpleado() {

        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {

        this.correoEmpleado = correoEmpleado;
    }

    public String getEmpresaEmpleado(){
    return empresaEmpleado;
    }

    public void setEmpresaEmpleado(String empresaEmpleado) {

    this.empresaEmpleado = empresaEmpleado;
    }

    public String getRolEmpleado() {

    return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {

    this.rolEmpleado = rolEmpleado;
    }
}
