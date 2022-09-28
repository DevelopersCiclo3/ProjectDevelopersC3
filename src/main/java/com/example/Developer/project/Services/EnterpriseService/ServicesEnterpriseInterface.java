package com.example.Developer.project.Services.EnterpriseService;

import com.example.Developer.project.Entities.Enterprise;

import java.util.List;

public interface ServicesEnterpriseInterface {
    public List<Enterprise> getEnterprises();
    public Enterprise getEnterprise(String id) throws Exception;
    public String setEnterprise (Enterprise enterprise_parametro);
    public Enterprise updateEnterpriseAll(Enterprise enterprise_update, String id) throws Exception;
    public Enterprise updateEnterprise(Enterprise enterprise_update, String id) throws Exception;
    public String deleteEnterprise(String id);
}
