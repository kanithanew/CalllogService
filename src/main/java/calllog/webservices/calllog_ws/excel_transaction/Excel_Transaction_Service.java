package calllog.webservices.calllog_ws.excel_transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;
@Service
public class Excel_Transaction_Service {
    private Excel_Transaction_Repository excel_transaction_repository;

    @Autowired
    public Excel_Transaction_Service(Excel_Transaction_Repository repository) {
        this.excel_transaction_repository = repository;
    }
    public List<Excel_Transaction> retrieveData(String month,String year,Integer callchanel) { 
        return (List<Excel_Transaction>) excel_transaction_repository.findTransCall(month, year,callchanel);
    }
}


