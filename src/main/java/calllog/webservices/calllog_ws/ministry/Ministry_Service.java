package calllog.webservices.calllog_ws.ministry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;
@Service
public class Ministry_Service {
    private Ministry_Repository ministry_repository;

    @Autowired
    public Ministry_Service(Ministry_Repository repository) {
        this.ministry_repository = repository;
    }
    public List<Ministry> retrieveMinistry() { 
        return (List<Ministry>) ministry_repository.findministry();
    }
}