package calllog.webservices.calllog_ws.update_module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;
@Service
public class Update_Module_Service {
    private Update_Module_Repository update_module_repository;

    @Autowired
    public Update_Module_Service(Update_Module_Repository repository) {
        this.update_module_repository = repository;
    }
    public Update_Module updateModule(Update_Module detail) {
       return update_module_repository.save(detail);
   }
}