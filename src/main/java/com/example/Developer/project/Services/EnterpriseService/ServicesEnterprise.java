package com.example.Developer.project.Services.EnterpriseService;



        import com.example.Developer.project.Entities.Enterprise;
        import com.example.Developer.project.Repository.EnterpriseRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import java.util.List;
        import java.util.Optional;

@Service
public class ServicesEnterprise implements ServicesEnterpriseInterface {
    @Autowired
    private EnterpriseRepository repositorio;
    @Override
    public List<Enterprise> getEnterprises() {
        return repositorio.findAll();
    }

    @Override
    public Enterprise getEnterprise(String id) throws Exception {
        Optional<Enterprise> enterpriseBD = repositorio.findById(id);
        if(enterpriseBD.isPresent()){
            return enterpriseBD.get();
        }
        throw new Exception("Empresa no existe");
    }

    @Override
    public String setEnterprise(Enterprise enterprise_parametro) {
        repositorio.save(enterprise_parametro);
        return "Empresa creada exitosamente";
    }

    @Override
    public Enterprise updateEnterpriseAll(Enterprise enterprise_update, String id){
        repositorio.deleteById(id);
        repositorio.save(enterprise_update);
        return null;
    }

    @Override
    public Enterprise updateEnterprise(Enterprise enterprise_update, String id) throws Exception {
        repositorio.deleteById(id);
        repositorio.save(enterprise_update);
        return null;
    }

    @Override
    public String deleteEnterprise(String id) {
        repositorio.deleteById(id);
        return "Empresa eliminada";
    }
}
