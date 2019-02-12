package calllog.webservices.calllog_ws.detail_updatepage;
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
@RequestMapping("/detail_updatepage")
public class Detail_Updatepage_Controller {

    @Autowired
    Detail_Updatepage_Service  setail_updatepage_Service;

 /*   @GetMapping(params = "callid")
    public List<Detail_Updatepage> getCallid(@RequestParam(value = "callid") Integer callid) {
        return setail_updatepage_Service.retrieveCallid(callid);

    }*/
    @PutMapping("/{callid}")
    public ResponseEntity<?> putCustomer(@PathVariable  Integer callid, @Valid @RequestBody Detail_Updatepage body) {
    
        Optional<Detail_Updatepage> customer = setail_updatepage_Service.updateData(callid, body);
        if (!customer.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().build();
    }

 
}