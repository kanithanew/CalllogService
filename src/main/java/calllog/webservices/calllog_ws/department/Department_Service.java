package calllog.webservices.calllog_ws.department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;
@Service
public class Department_Service {
    private Department_Repository department_repository;

    @Autowired
    public Department_Service(Department_Repository repository) {
        this.department_repository = repository;
    }
    public List<Department> retrieveDepartment() { 
        return (List<Department>) department_repository.finddepartment();
    }
}