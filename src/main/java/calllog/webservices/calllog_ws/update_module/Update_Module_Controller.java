package calllog.webservices.calllog_ws.update_module;
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
@RequestMapping("/update_module")
public class Update_Module_Controller {

    @Autowired
    Update_Module_Service  update_module_Service;

      @PostMapping()
    public ResponseEntity<Update_Module> postCustomer(@RequestBody Update_Module body) {
      Update_Module detail_payunit = update_module_Service.updateModule(body); 
      return ResponseEntity.status(HttpStatus.CREATED).body(detail_payunit);
   
    }
}