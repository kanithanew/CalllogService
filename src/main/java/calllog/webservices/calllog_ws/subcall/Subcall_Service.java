package calllog.webservices.calllog_ws.subcall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;
@Service
public class Subcall_Service {
    private Subcall_Repository subcall_repository;

    @Autowired
    public Subcall_Service(Subcall_Repository repository) {
        this.subcall_repository = repository;
    }
    public List<Subcall> retrieveSubcall(Integer callid) { 
        return (List<Subcall>) subcall_repository.findsubcall(callid);
    }

}