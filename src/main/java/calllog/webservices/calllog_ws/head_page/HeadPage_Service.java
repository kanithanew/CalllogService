package calllog.webservices.calllog_ws.head_page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;
@Service
public class HeadPage_Service {
    private HeadPage_Repository headpage_Repository;

    @Autowired
    public HeadPage_Service(HeadPage_Repository repository) {
        this.headpage_Repository = repository;
    }
    public List<HeadPage> retrieveData(Integer callid) { 
        return (List<HeadPage>) headpage_Repository.findData(callid);
    }

}