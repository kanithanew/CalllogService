package calllog.webservices.calllog_ws.HD_Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;
@Service
public class HD_Owner_Service {
    private HD_Owner_Repository hd_owner_Repository;

    @Autowired
    public HD_Owner_Service(HD_Owner_Repository repository) {
        this.hd_owner_Repository = repository;
    }
    public List<HD_Owner> retrieveHD_Owner(Integer callid) {
              return (List<HD_Owner>) hd_owner_Repository.findHD_Owner(callid);
    }

}