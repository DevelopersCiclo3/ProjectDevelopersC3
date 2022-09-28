package com.example.Developer.project.Entities;

import javax.persistence.*;

@Entity
@Table(name="transaction")
public class Transaction {
    @Id
    private String concepto;
    @Column
    private double cantidad;
    @ManyToOne
    private Employee employee;
    @ManyToOne
    private Enterprise enterprise;

    public Transaction(String concepto, double cantidad, Employee employee, Enterprise enterprise) {
        this.concepto = concepto;
        this.cantidad = cantidad;
        this.employee = employee;
        this.enterprise = enterprise;
    }

    public Transaction(String concepto, double cantidad, Employee employee) {
        this.concepto = concepto;
        this.cantidad = cantidad;
        this.employee = employee;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }
}
