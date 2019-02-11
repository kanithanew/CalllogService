package calllog.webservices.calllog_ws.subcall;
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
@RequestMapping("/subcall")
public class Subcall_Controller {

    @Autowired
    Subcall_Service  subcall_Service;

    @GetMapping(params = "callid")
    public List<Subcall> getPayUnit(@RequestParam(value = "callid") Integer callid) {
        return subcall_Service.retrieveSubcall(callid);

    }
    @PostMapping()
    public ResponseEntity<Subcall> postSubcall(@RequestBody Subcall body) {

        Subcall detail_editpage = subcall_Service.postSubcall(body); 
      return ResponseEntity.status(HttpStatus.CREATED).body(detail_editpage);
   
    }
}