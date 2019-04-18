package calllog.webservices.calllog_ws.province;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;
@Service
public class Province_Service {
    private Province_Repository province_repository;

    @Autowired
    public Province_Service(Province_Repository repository) {
        this.province_repository = repository;
    }
    public List<Province> retrieveProvince() { 
        return (List<Province>) province_repository.findprovince();
    }
}