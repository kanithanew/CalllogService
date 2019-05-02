package calllog.webservices.calllog_ws.gfmis_staffgroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;
@Service
public class Gfmis_Staffgroup_Service {
    private Gfmis_Staffgroup_Repository gfmis_staffgroup_Repository;

    @Autowired
    public Gfmis_Staffgroup_Service(Gfmis_Staffgroup_Repository repository) {
        this.gfmis_staffgroup_Repository = repository;
    }
    public List<Gfmis_Staffgroup> retrieveGfmis_staffhead(Integer moduleid) {
              return (List<Gfmis_Staffgroup>) gfmis_staffgroup_Repository.findHead(moduleid);
    }


}