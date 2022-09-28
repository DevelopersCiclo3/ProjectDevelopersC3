package com.example.Developer.project.Services.TransactionService;

import com.example.Developer.project.Entities.Employee;
import com.example.Developer.project.Entities.Enterprise;
import com.example.Developer.project.Entities.RoleName;
import com.example.Developer.project.Entities.Transaction;

import java.util.ArrayList;

public class TransactionServiceList {
    private ArrayList<Transaction> transactions =new ArrayList<>();

    private Enterprise enterpriseOne = new Enterprise("Mintic", "Calle 68", "34655323", "0095400");
    private RoleName administrator = RoleName.ADMIN;
    private RoleName operator = RoleName.OPERARIO;
    private Employee employeeOne = new Employee("Jonathan", "Jonathan@gmail.com", enterpriseOne, administrator);
    private Employee employeeTwo = new Employee("Sebastian", "sebas@gmail.com", enterpriseOne, operator);
    private Transaction transactionOne = new Transaction("Pago administracion",1200, employeeOne);
    private Transaction transactionTwo = new Transaction("Pago salud",-12000, employeeTwo);

    public TransactionServiceList(){
        transactions.add(transactionOne);
        transactions.add(transactionTwo);
    }

    public Transaction getTransaction(String nameTransaction) throws Exception {
        for(Transaction transaction: this.transactions){
            if(transaction.getConcepto().equals(nameTransaction)){
                return transaction;
            }
        }
        throw new Exception("Concepto no existente");
    }

    public String setTransaction(Transaction transaction_parameter) throws Exception {
        try{
            //Consulta la existencia del usuario
            getTransaction(transaction_parameter.getConcepto());
        }
        catch (Exception e){
            //Crea el usuario
            this.transactions.add(transaction_parameter);
            return "Creacion transaccion exitosa";
        }
        //Error si el usuario ya existe
        throw  new Exception("Transaccion existente");
    }

    public Transaction updateTransactionAll(Transaction transaction_update, String id) throws Exception {
        try {
            Transaction transaction_bd = getTransaction(id);

            transaction_bd.setCantidad(transaction_update.getCantidad());
            transaction_bd.setConcepto(transaction_update.getConcepto());
            transaction_bd.setEmployee(transaction_update.getEmployee());

            return transaction_bd;
        } catch (Exception e) {
            throw new Exception("Transaccion NO existe, fallo actualizaciÃ³n de datos");
        }
    }

    public Transaction updateTransaction(Transaction transaction_update, String id) throws Exception {
        try {
            Transaction transaction_bd = getTransaction(id);

            if(transaction_update.getCantidad() == 0.0 && transaction_update.getCantidad()==0.0){
                transaction_bd.setCantidad(transaction_update.getCantidad());
            }
            if(transaction_update.getConcepto() != null && !transaction_update.getConcepto().equals("")){
                transaction_bd.setCantidad(transaction_update.getCantidad());
            }
            if(transaction_update.getEmployee() != null && !transaction_update.getEmployee().equals("")){
                transaction_bd.setEmployee(transaction_update.getEmployee());
            }

            return transaction_bd;
        } catch (Exception e) {
            throw new Exception("Transaccion NO existe, fallo actualizaciÃ³n de datos");
        }
    }


    public String deleteTransaction(String id) throws Exception {
        try {
            Transaction transaction = getTransaction(id);

            this.transactions.remove(transaction);

            return "Eliminado exitoso";
        } catch (Exception e) {
            throw new Exception("Transaccion NO Existe para Eliminar");
        }
    }

    //getters and setters
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Enterprise getEnterpriseOne() {
        return enterpriseOne;
    }

    public void setEnterpriseOne(Enterprise enterpriseOne) {
        this.enterpriseOne = enterpriseOne;
    }

    public RoleName getAdministrator() {
        return administrator;
    }

    public void setAdministrator(RoleName administrator) {
        this.administrator = administrator;
    }

    public RoleName getOperator() {
        return operator;
    }

    public void setOperator(RoleName operator) {
        this.operator = operator;
    }

    public Employee getEmployeeOne() {
        return employeeOne;
    }

    public void setEmployeeOne(Employee employeeOne) {
        this.employeeOne = employeeOne;
    }

    public Employee getEmployeeTwo() {
        return employeeTwo;
    }

    public void setEmployeeTwo(Employee employeeTwo) {
        this.employeeTwo = employeeTwo;
    }

    public Transaction getTransactionOne() {
        return transactionOne;
    }

    public void setTransactionOne(Transaction transactionOne) {
        this.transactionOne = transactionOne;
    }

    public Transaction getTransactionTwo() {
        return transactionTwo;
    }

    public void setTransactionTwo(Transaction transactionTwo) {
        this.transactionTwo = transactionTwo;
    }
}


