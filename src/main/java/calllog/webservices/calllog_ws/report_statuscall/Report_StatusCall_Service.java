package calllog.webservices.calllog_ws.report_statuscall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;
@Service
public class Report_StatusCall_Service {
    private Report_StatusCall_Repository report_statuscall_repository;

    @Autowired
    public Report_StatusCall_Service(Report_StatusCall_Repository repository) {
        this.report_statuscall_repository = repository;
    }
    public List<Report_StatusCall> retrieveStatus_Pendingcall(String fromdate,String todate) { 
        Timestamp timesfrom= Timestamp.valueOf(fromdate);
        Timestamp timesto = Timestamp.valueOf(todate);
        return (List<Report_StatusCall>) report_statuscall_repository.findPendingCall(timesfrom,timesto);
    }
    public List<Report_StatusCall> retrieveStatus_Closecall(String fromdate,String todate) { 
        Timestamp timesfrom= Timestamp.valueOf(fromdate);
        Timestamp timesto = Timestamp.valueOf(todate);
        return (List<Report_StatusCall>) report_statuscall_repository.findCloseCall(timesfrom,timesto);
    }

}


