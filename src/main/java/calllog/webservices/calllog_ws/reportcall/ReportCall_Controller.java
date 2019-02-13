package calllog.webservices.calllog_ws.reportcall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/report")
public class ReportCall_Controller {

    @Autowired
    ReportCall_Service reportcall_Service;

    @GetMapping(params = "statuspendingcall")
    public List<ReportCall> getLoginuser_Pendingcall(@RequestParam(value = "statuspendingcall") String fromdate,
            @RequestParam(value = "todate") String todate) {
        return reportcall_Service.retrieveStatus_Pendingcall(fromdate, todate);
    }

    @GetMapping(params = "closecall")
    public List<ReportCall> getLoginuser_Closecall(@RequestParam(value = "closecall") String fromdate,
            @RequestParam(value = "todate") String todate) {
        return reportcall_Service.retrieveStatus_Closecall(fromdate, todate);
    }

    @GetMapping(params = "pengding")
    public List<ReportCall> getLoginuser_Closecall(@RequestParam(value = "pengding") String date) {
        return reportcall_Service.retrieve_Pendingcall(date);
    }

    @GetMapping(params = "payunit")
    public List<ReportCall> getLoginuser_Payunit(@RequestParam(value = "payunit") String payunit,
            @RequestParam(value = "fromdate") String fromdate, @RequestParam(value = "todate") String todate) {
        return reportcall_Service.retrieve_Payunit(payunit, fromdate, todate);
    }

    @GetMapping(params = "bydate")
    public List<ReportCall> getLoginuser_Date(@RequestParam(value = "bydate") String fromdate,
            @RequestParam(value = "todate") String todate) {
        return reportcall_Service.retrieve_Date(fromdate, todate);
    }

}