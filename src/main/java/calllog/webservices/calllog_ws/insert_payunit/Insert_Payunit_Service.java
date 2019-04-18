package calllog.webservices.calllog_ws.insert_payunit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;
@Service
public class Insert_Payunit_Service {
    private Insert_Payunit_Repository insert_payunit_repository;

    @Autowired
    public Insert_Payunit_Service(Insert_Payunit_Repository repository) {
        this.insert_payunit_repository = repository;
    }
    public Insert_Payunit createPayunit(Insert_Payunit detail) {
        detail.setId(null);
       return insert_payunit_repository.save(detail);
   }
}