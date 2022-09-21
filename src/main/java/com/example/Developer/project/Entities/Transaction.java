package com.example.Developer.project.Entities;

public class Transaction {
    private double cantidad;
    private String concepto;
    private Employee user;

    public Transaction(double cantidad, String concepto, Employee user) {
        this.cantidad = cantidad;
        this.concepto = concepto;
        this.user = user;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Employee getUser() {
        return user;
    }

    public void setUser(Employee user) {
        this.user = user;
    }
}
