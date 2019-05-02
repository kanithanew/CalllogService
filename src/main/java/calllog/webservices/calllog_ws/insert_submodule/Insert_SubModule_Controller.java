package calllog.webservices.calllog_ws.insert_submodule;
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
@RequestMapping("/insert_submodule")
public class Insert_SubModule_Controller {

    @Autowired
    Insert_SubModule_Service  insert_subModulee_Service;

      @PostMapping()
    public ResponseEntity<Insert_SubModule> postCustomer(@RequestBody Insert_SubModule body) {
      Insert_SubModule detail_submodule = insert_subModulee_Service.updateSubModule(body); 
      return ResponseEntity.status(HttpStatus.CREATED).body(detail_submodule);
   
    }
}