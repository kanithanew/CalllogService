package calllog.webservices.calllog_ws.reportcall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;

@Service
public class ReportCall_Service {
    private ReportCall_Repository reportcall_repository;

    @Autowired
    public ReportCall_Service(ReportCall_Repository repository) {
        this.reportcall_repository = repository;
    }

    public List<ReportCall> retrieveStatus_Pendingcall(String fromdate, String todate) {
        Timestamp timesfrom = Timestamp.valueOf(fromdate);
        Timestamp timesto = Timestamp.valueOf(todate);
        return (List<ReportCall>) reportcall_repository.findPendingCall(timesfrom, timesto);
    }

    public List<ReportCall> retrieveStatus_Closecall(String fromdate, String todate) {
        Timestamp timesfrom = Timestamp.valueOf(fromdate);
        Timestamp timesto = Timestamp.valueOf(todate);
        return (List<ReportCall>) reportcall_repository.findCloseCall(timesfrom, timesto);
    }

    // retrieve_Pendingcall
    public List<ReportCall> retrieve_Pendingcall(String date) {
        Timestamp timesdate = Timestamp.valueOf(date);
        return (List<ReportCall>) reportcall_repository.findPending(timesdate);
    }

    public List<ReportCall> retrieve_Payunit(String payunit, String fromdate, String todate) {
        Timestamp timesfrom = Timestamp.valueOf(fromdate);
        Timestamp timesto = Timestamp.valueOf(todate);
        return (List<ReportCall>) reportcall_repository.findbypayunit(payunit, timesfrom, timesto);
    }
    public List<ReportCall> retrieve_Date(String fromdate, String todate) {
        Timestamp timesfrom = Timestamp.valueOf(fromdate);
        Timestamp timesto = Timestamp.valueOf(todate);
        return (List<ReportCall>) reportcall_repository.findbydate(timesfrom, timesto);
    }
}
