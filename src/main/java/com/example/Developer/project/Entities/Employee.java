package com.example.Developer.project.Entities;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="employee")
public class Employee {
    @Id
    private String nombre;
    @Column
    private String correo;
    @ManyToOne
    private Enterprise enterprise;
    @OneToMany(mappedBy = "employee")
    private List<Transaction> transactions;

    private RoleName rol;

    public Employee(String nombre, String correo, Enterprise enterprise, List<Transaction> transactions, RoleName rol) {
        this.nombre = nombre;
        this.correo = correo;
        this.enterprise = enterprise;
        this.transactions = transactions;
        this.rol = rol;
    }

    public Employee(String nombre, String correo, Enterprise enterprise, RoleName rol) {
        this.nombre = nombre;
        this.correo = correo;
        this.enterprise = enterprise;
        this.rol = rol;
    }

    public Employee(String nombre, String correo, Enterprise enterprise) {
        this.nombre = nombre;
        this.correo = correo;
        this.enterprise = enterprise;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public RoleName getRol() {
        return rol;
    }

    public void setRol(RoleName rol) {
        this.rol = rol;
    }
}
