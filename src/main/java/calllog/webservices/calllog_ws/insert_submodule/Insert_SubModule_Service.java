package calllog.webservices.calllog_ws.insert_submodule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;
@Service
public class Insert_SubModule_Service {
    private Insert_SubModule_Repository insert_submodule_repository;

    @Autowired
    public Insert_SubModule_Service(Insert_SubModule_Repository repository) {
        this.insert_submodule_repository = repository;
    }
    public Insert_SubModule updateSubModule(Insert_SubModule detail) {
       return insert_submodule_repository.save(detail);
   }
}