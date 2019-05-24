package calllog.webservices.calllog_ws.callposition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;
@Service
public class Callposition_Service {
    private Callposition_Repository callposition_repository;

    @Autowired
    public Callposition_Service(Callposition_Repository repository) {
        this.callposition_repository = repository;
    }
    public List<Callposition> retrieveCallposition() { 
        return (List<Callposition>) callposition_repository.findcallposition();
    }
}