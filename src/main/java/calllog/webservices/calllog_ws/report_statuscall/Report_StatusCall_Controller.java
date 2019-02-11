package calllog.webservices.calllog_ws.report_statuscall;
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
@RequestMapping("/report_statuscall")
public class Report_StatusCall_Controller {

    @Autowired
    Report_StatusCall_Service  report_statusCall_Service;

    @GetMapping(params = "pendingcall")
    public List<Report_StatusCall> getLoginuser_Pendingcall(@RequestParam(value = "pendingcall") String fromdate,
            @RequestParam(value = "todate") String todate) {
        return report_statusCall_Service.retrieveStatus_Pendingcall(fromdate, todate);
    }
    @GetMapping(params = "closecall")
    public List<Report_StatusCall> getLoginuser_Closecall(@RequestParam(value = "closecall") String fromdate,
            @RequestParam(value = "todate") String todate) {
        return report_statusCall_Service.retrieveStatus_Closecall(fromdate, todate);
    }


}