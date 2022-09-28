package com.example.Developer.project.Services.EmployeeService;


import com.example.Developer.project.Entities.Employee;
import com.example.Developer.project.Entities.Enterprise;
import com.example.Developer.project.Entities.RoleName;

import java.util.ArrayList;

public class EmployeeServicesList {
    private ArrayList<Employee> employees = new ArrayList<>();
    private Enterprise enterprise = new Enterprise("Oriente", "Bogota", "23443", "1-1234");

    private RoleName administrator = RoleName.ADMIN;
    private RoleName operator = RoleName.OPERARIO;
    private Employee employeeOne = new Employee("Orlando", "orlandobarragan@outlook.com", enterprise, administrator);
    private Employee employeeTwo = new Employee("Carlos", "carlosJonathan@outlook.com", enterprise, operator);

    public EmployeeServicesList(){
        employees.add(employeeOne);
        employees.add(employeeTwo);
    }
    public Employee getEmployee(String nameEmployee) throws Exception{
        for(Employee employee: this.employees){
            if(employee.getNombre().equals(nameEmployee)){
                return employee;
            }
        }
        throw new Exception("El Empleado no existe");
    }
    public String setEmployee(Employee employee_parameter) throws Exception {
        try{
            //Consulta la existencia del usuario
            getEmployee(employee_parameter.getNombre());
        }
        catch (Exception e){
            //Crea el usuario
            this.employees.add(employee_parameter);
            return "Creacion del usuario exitosa";
        }
        //Error si el usuario ya existe
        throw  new Exception("Usuario existente");
    }
    public Employee updateEmployee(Employee employee_update, String id) throws Exception {
        try {
            Employee employee_bd = getEmployee(id);

            if(employee_update.getNombre() != null && !employee_update.getNombre().equals("")){
                employee_bd.setNombre(employee_update.getNombre());
            }
            if(employee_update.getCorreo() != null && !employee_update.getCorreo().equals("")){
                employee_bd.setCorreo(employee_update.getCorreo());
            }
            if(employee_update.getEnterprise() != null && !employee_update.getEnterprise().equals("")){
                employee_bd.setEnterprise(employee_update.getEnterprise());
            }
            if(employee_update.getRol() != null && !employee_update.getRol().equals("")){
                employee_bd.setRol(employee_update.getRol());
            }
            return employee_bd;
        } catch (Exception e) {
            throw new Exception("Empleado NO existe, fallo actualizaciÃ³n de datos");
        }
    }
    public Employee updateEmployeeAll(Employee employee_update, String id) throws Exception {
        try {
            Employee employee_bd = getEmployee(id);

            employee_bd.setNombre(employee_update.getNombre());
            employee_bd.setCorreo(employee_update.getCorreo());
            employee_bd.setEnterprise(employee_update.getEnterprise());
            employee_bd.setRol(employee_update.getRol());

            return employee_bd;
        } catch (Exception e) {
            throw new Exception("Empleado NO existe, fallo actualizaciÃ³n de datos");
        }
    }
    public String deleteEmployee(String id) throws Exception {
        try {
            Employee employee = getEmployee(id);

            this.employees.remove(employee);

            return "Eliminado exitoso";
        } catch (Exception e) {
            throw new Exception("Empleado NO Existe para Eliminar");
        }
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Employee getEmployeeOne() {
        return employeeOne;
    }

    public void setEmployeeOne(Employee employeeOne) {
        this.employeeOne = employeeOne;
    }
}


