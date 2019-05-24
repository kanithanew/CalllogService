package calllog.webservices.calllog_ws.excel_module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;
@Service
public class Excel_Module_Service {
    private Excel_Module_Repository excel_module_repository;

    @Autowired
    public Excel_Module_Service(Excel_Module_Repository repository) {
        this.excel_module_repository = repository;
    }
    public List<Excel_Module> retrieveData(String datefrom,String dateto,Integer callchanel) { 
        
        return (List<Excel_Module>) excel_module_repository.findModuleCall(datefrom, dateto,callchanel);
    }
}


