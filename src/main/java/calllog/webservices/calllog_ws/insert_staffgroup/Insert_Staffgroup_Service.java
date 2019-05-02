package calllog.webservices.calllog_ws.insert_staffgroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;
@Service
public class Insert_Staffgroup_Service {
    private Insert_Staffgroup_Repository insert_staffgroup_repository;

    @Autowired
    public Insert_Staffgroup_Service(Insert_Staffgroup_Repository repository) {
        this.insert_staffgroup_repository = repository;
    }
    public Insert_Staffgroup createStaffgroup(Insert_Staffgroup detail) {
       return insert_staffgroup_repository.save(detail);
   }
}