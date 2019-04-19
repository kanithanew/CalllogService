package calllog.webservices.calllog_ws.insert_module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;
@Service
public class Insert_Module_Service {
    private Insert_Module_Repository insert_module_repository;

    @Autowired
    public Insert_Module_Service(Insert_Module_Repository repository) {
        this.insert_module_repository = repository;
    }
    public Insert_Module createModule(Insert_Module detail) {
       return insert_module_repository.save(detail);
   }
}