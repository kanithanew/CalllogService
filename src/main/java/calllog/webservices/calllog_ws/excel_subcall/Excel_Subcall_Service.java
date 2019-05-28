package calllog.webservices.calllog_ws.excel_subcall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;
@Service
public class Excel_Subcall_Service {
    private Excel_Subcall_Repository excel_subcall_repository;

    @Autowired
    public Excel_Subcall_Service(Excel_Subcall_Repository repository) {
        this.excel_subcall_repository = repository;
    }
    public List<Excel_Subcall> retrieveData(String datefrom,String dateto,Integer callchanel) { 
                return (List<Excel_Subcall>) excel_subcall_repository.findSubCall(datefrom, dateto,callchanel);
    }
    public List<Excel_Subcall> retrieveDataClose(String dateclosefrom,String dateto,Integer callchanel) { 
        return (List<Excel_Subcall>) excel_subcall_repository.findSubCloseCall(dateclosefrom, dateto,callchanel);
}
}


