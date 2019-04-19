package calllog.webservices.calllog_ws.modulerelateion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
@Service
public class ModuleRelateion_Service {
    private ModuleRelateion_Repository module_repository;

    @Autowired
    public ModuleRelateion_Service(ModuleRelateion_Repository repository) {
        this.module_repository = repository;
    }
    public List<ModuleRelateion> retrieveModuleRelateion(Integer module,Integer submodule) { 
        return (List<ModuleRelateion>) module_repository.findmodulerelation(module,submodule);
    }
    public List<ModuleRelateion> retrieveModuleRelateion2(Integer module) { 
        return (List<ModuleRelateion>) module_repository.findmodulerelation2(module);
    }


}