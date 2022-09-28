package com.example.Developer.project.Entities;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="enterprise")
public class Enterprise {
    @Id
    private String nombre;
    @Column
    private String direccion;
    @Column
    private String telefono;
    @Column
    private String nit;
    @OneToMany(mappedBy = "enterprise")
    private List<Employee> employee;
    @OneToMany(mappedBy = "enterprise")
    private List<Transaction> transaction;

    public Enterprise(String nombre, String direccion, String telefono, String nit, List<Employee> employee, List<Transaction> transaction) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
        this.employee = employee;
        this.transaction = transaction;
    }

    public Enterprise(String nombre, String direccion, String telefono, String nit, List<Employee> employee) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
        this.employee = employee;
    }

    public Enterprise(String nombre, String direccion, String telefono, String nit){
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }


    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    public List<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<Transaction> transaction) {
        this.transaction = transaction;
    }
}



