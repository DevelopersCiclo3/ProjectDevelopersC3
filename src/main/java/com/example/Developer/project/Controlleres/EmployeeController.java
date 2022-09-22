package com.example.Developer.project.Controlleres;


import com.example.Developer.project.Entities.Employee;
import com.example.Developer.project.Entities.Enterprise;
import com.example.Developer.project.Entities.objectResponse;
import com.example.Developer.project.Services.EmployeeServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
public class EmployeeController {
    private EmployeeServices employeeServices = new EmployeeServices();
    @GetMapping("/employees")
    public ResponseEntity<ArrayList<Employee>> getEmployees(){
        return new ResponseEntity<>(employeeServices.getEmployees(), HttpStatus.OK);
    }
    @GetMapping("/employee")
    public ResponseEntity<Object> getEmployee(@RequestParam String name){
        try {
            Employee employee = employeeServices.getEmployee(name);
            return new ResponseEntity<>(employee, HttpStatus.OK);
        } catch (Exception e){
            return  new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/employee/{name}")
    public ResponseEntity<Object> getEmployeePath(@PathVariable String name){
        try {
            Employee employee = employeeServices.getEmployee(name);
            return new ResponseEntity<>(employee, HttpStatus.OK);
        } catch (Exception e){
            return  new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PostMapping("/employee")
    public ResponseEntity<String> postEmployee(@RequestBody Employee employee_parametro){
        try {
            String mensaje = employeeServices.setEmployee(employee_parametro);
            return new ResponseEntity<>(mensaje, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }
    @PutMapping("/employee/{id}")
    public ResponseEntity<objectResponse> putEmployee(@RequestBody Employee employee_update, @PathVariable String id) {
        try {
            Employee employee_bd = employeeServices.updateEmployeeAll(employee_update, id);
            return new ResponseEntity<>(new objectResponse("Registro de actualizacion exitoso", employee_bd), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new objectResponse(e.getMessage(), null), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PatchMapping("/employee/{id}")
    public ResponseEntity<objectResponse> patchEmployee(@RequestBody Employee employee_update, @PathVariable String id ){

        try {
            Employee employee_bd = employeeServices.updateEmployee(employee_update, id);
            return new ResponseEntity<>(new objectResponse("Actualizacion Exitosa",employee_bd),HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(new objectResponse(e.getMessage(),null),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping("/employee/{id}")
    public ResponseEntity<objectResponse> deleteEmployee(@PathVariable String id) {

        try {
            String mensaje = employeeServices.deleteEmployee(id);

            return new ResponseEntity<>(new objectResponse(mensaje, null), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new objectResponse(e.getMessage(), null), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
