package calllog.webservices.calllog_ws.update_submodule;
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
@RequestMapping("/update_submodule")
public class Update_SubModule_Controller {

    @Autowired
    Update_SubModule_Service  update_submodule_Service;

      @PostMapping()
    public ResponseEntity<Update_SubModule> postCustomer(@RequestBody Update_SubModule body) {
      Update_SubModule detail_submodule = update_submodule_Service.updateSubModule(body); 
      return ResponseEntity.status(HttpStatus.CREATED).body(detail_submodule);
   
    }
}