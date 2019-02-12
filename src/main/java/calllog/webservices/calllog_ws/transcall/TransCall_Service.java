package calllog.webservices.calllog_ws.transcall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;
@Service
public class TransCall_Service {
    private TransCall_Repository transcall_repository;

    @Autowired
    public TransCall_Service(TransCall_Repository repository) {
        this.transcall_repository = repository;
    }
    public List<TransCall> retrieveStatus_TransCall(Integer callid) { 
        return (List<TransCall>) transcall_repository.findTransCall(callid);
    }
}


