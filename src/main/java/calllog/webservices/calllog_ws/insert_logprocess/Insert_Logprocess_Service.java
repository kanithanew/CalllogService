package calllog.webservices.calllog_ws.insert_logprocess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;

@Service
public class Insert_Logprocess_Service {
    private Insert_Logprocess_Repository insert_logprocess_repository;

    @Autowired
    public Insert_Logprocess_Service(Insert_Logprocess_Repository repository) {
        this.insert_logprocess_repository = repository;
    }
    
       public Insert_Logprocess createLogprocess(Insert_Logprocess detail) {
        return insert_logprocess_repository.save(detail);
    }

}