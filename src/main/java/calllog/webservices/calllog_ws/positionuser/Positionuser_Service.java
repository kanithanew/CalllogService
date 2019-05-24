package calllog.webservices.calllog_ws.positionuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;
@Service
public class Positionuser_Service {
    private Positionuser_Repository positionuser_repository;

    @Autowired
    public Positionuser_Service(Positionuser_Repository repository) {
        this.positionuser_repository = repository;
    }
    public List<Positionuser> retrievePositionuser() { 
        return (List<Positionuser>) positionuser_repository.findPositionuser();
    }

}