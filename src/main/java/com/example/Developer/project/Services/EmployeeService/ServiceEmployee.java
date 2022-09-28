package com.example.Developer.project.Services.EmployeeService;

import com.example.Developer.project.Entities.Employee;
import com.example.Developer.project.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceEmployee  implements ServiceEmployeeInterface {
    @Autowired
    private EmployeeRepository repositorio;
    @Override
    public List<Employee> getEmployees() {
        return repositorio.findAll();
    }

    @Override
    public Employee getEmployee(String id) throws Exception {
        Optional<Employee> enterpriseBD = repositorio.findById(id);
        if(enterpriseBD.isPresent()){
            return enterpriseBD.get();
        }
        throw new Exception("Empresa no existe");
    }

    @Override
    public String setEmployee(Employee employee_parametro) {
        repositorio.save(employee_parametro);
        return "Empleado creado exitosamente";
    }

    @Override
    public Employee updateEmployeeAll(Employee employee_update, String id){
        repositorio.deleteById(id);
        repositorio.save(employee_update);
        return null;
    }

    @Override
    public Employee updateEmployee(Employee employee_update, String id) throws Exception {
        repositorio.deleteById(id);
        repositorio.save(employee_update);
        return null;
    }

    @Override
    public String deleteEmployee(String id) {
        repositorio.deleteById(id);
        return "Empleado eliminado";
    }
}
