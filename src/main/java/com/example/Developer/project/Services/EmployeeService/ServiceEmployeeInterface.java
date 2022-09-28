package com.example.Developer.project.Services.EmployeeService;



import com.example.Developer.project.Entities.Employee;
import com.example.Developer.project.Entities.Enterprise;
import java.util.List;

public interface ServiceEmployeeInterface {
    public List<Employee> getEmployees();
    public Employee getEmployee(String id) throws Exception;
    public String setEmployee (Employee employee_parametro);
    public Employee updateEmployeeAll(Employee employee_update, String id) throws Exception;
    public Employee updateEmployee(Employee employee_update, String id) throws Exception;
    public String deleteEmployee(String id);
}
