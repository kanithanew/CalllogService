package calllog.webservices.calllog_ws.update_submodule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;
@Service
public class Update_SubModule_Service {
    private Update_SubModule_Repository insert_submodule_repository;

    @Autowired
    public Update_SubModule_Service(Update_SubModule_Repository repository) {
        this.insert_submodule_repository = repository;
    }
    public Update_SubModule updateSubModule(Update_SubModule detail) {
       return insert_submodule_repository.save(detail);
   }
}