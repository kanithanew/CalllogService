package calllog.webservices.calllog_ws.insert_staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;
@Service
public class Insert_Staff_Service {
    private Insert_Staff_Repository insert_staff_repository;

    @Autowired
    public Insert_Staff_Service(Insert_Staff_Repository repository) {
        this.insert_staff_repository = repository;
    }
    public Insert_Staff updateSubModule(Insert_Staff detail) {
       return insert_staff_repository.save(detail);
   }
}