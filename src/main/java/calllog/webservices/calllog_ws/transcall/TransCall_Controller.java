package calllog.webservices.calllog_ws.transcall;
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
@RequestMapping("/transcall")
public class TransCall_Controller {

    @Autowired
    TransCall_Service  reportcall_Service;

    @GetMapping(params = "callid")
    public List<TransCall> getLoginuser_TransCall(@RequestParam(value = "callid") Integer callid) {
        return reportcall_Service.retrieveStatus_TransCall(callid);
    }

}