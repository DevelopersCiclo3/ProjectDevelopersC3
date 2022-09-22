package com.example.Developer.project.Services;

import com.example.Developer.project.Entities.Enterprise;
import java.util.ArrayList;

public class EnterpriseService {
    private ArrayList<Enterprise> enterprises = new ArrayList<>();
    private Enterprise enterpriseOne = new Enterprise("Mintic", "Calle 68", "34655323", "0095400");
    private Enterprise enterpriseTwo = new Enterprise("Telecomunicaciones", "Calle 68", "311783453", "1-0095400");
    public EnterpriseService (){
        enterprises.add(enterpriseOne);
        enterprises.add(enterpriseTwo);
    }
    public Enterprise getEnterprise(String nameEnterprise) throws Exception{
        for(Enterprise enterprise: this.enterprises){
            if(enterprise.getNombre().equals(nameEnterprise)){
                return enterprise;
            }
        }
        throw new Exception("Empresa no existente");
    }
    public String setEnterprise(Enterprise enterprise_parameter) throws Exception {
        try{
            //Consulta la existencia de la empresa
            getEnterprise(enterprise_parameter.getNombre());
        }
        catch (Exception e){
            //Crea la empresa
            this.enterprises.add(enterprise_parameter);
            return "Creacion de empresa exitosa";
        }
        //Error si la empresa ya existe
        throw  new Exception("Empresa existennte");
    }
    public Enterprise updateEnterprise(Enterprise enterprise_update, String id) throws Exception {
        try {
            Enterprise enterprise_bd = getEnterprise(id);

            if(enterprise_update.getNombre() != null && !enterprise_update.getNombre().equals("")){
                enterprise_bd.setNombre(enterprise_update.getNombre());
            }
            if(enterprise_update.getDireccion() != null && !enterprise_update.getDireccion().equals("")){
                enterprise_bd.setDireccion(enterprise_update.getDireccion());
            }
            if(enterprise_update.getTelefono() != null && !enterprise_update.getTelefono().equals("")){
                enterprise_bd.setTelefono(enterprise_update.getTelefono());
            }
            if(enterprise_update.getNit() != null && !enterprise_update.getNit().equals("")){
                enterprise_bd.setNit(enterprise_update.getNit());
            }
            return enterprise_bd;
        } catch (Exception e) {
            throw new Exception("Empresa NO existe, fallo actualizaciÃ³n de datos");
        }
    }
    public Enterprise updateEnterpriseAll(Enterprise enterprise_update, String id) throws Exception {
        try {
            Enterprise enterprise_bd = getEnterprise(id);

            enterprise_bd.setNombre(enterprise_update.getNombre());
            enterprise_bd.setDireccion(enterprise_update.getDireccion());
            enterprise_bd.setTelefono(enterprise_update.getTelefono());
            enterprise_bd.setNit(enterprise_update.getNit());
            return enterprise_bd;
        } catch (Exception e) {
            throw new Exception("Empresa NO existe, fallo actualizaciÃ³n de datos");
        }
    }
    public String deleteEnterprise(String id) throws Exception {
        try {
            Enterprise enterprise = getEnterprise(id);

            this.enterprises.remove(enterprise);

            return "Eliminado exitoso";
        } catch (Exception e) {
            throw new Exception("Empresa NO Existe para Eliminar");
        }
    }





    public ArrayList<Enterprise> getEnterprises() {
        return enterprises;
    }

    public void setEnterprises(ArrayList<Enterprise> enterprises) {
        this.enterprises = enterprises;
    }

    public Enterprise getEnterpriseOne() {
        return enterpriseOne;
    }

    public void setEnterpriseOne(Enterprise enterpriseOne) {
        this.enterpriseOne = enterpriseOne;
    }

    public Enterprise getEnterpriseTwo() {
        return enterpriseTwo;
    }

    public void setEnterpriseTwo(Enterprise enterpriseTwo) {
        this.enterpriseTwo = enterpriseTwo;
    }

}
