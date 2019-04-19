package calllog.webservices.calllog_ws.insert_module;
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
@RequestMapping("/insert_module")
public class Insert_Module_Controller {

    @Autowired
    Insert_Module_Service insert_module_Service;

      @PostMapping()
    public ResponseEntity<Insert_Module> postCustomer(@RequestBody Insert_Module body) {
      Insert_Module detail_module = insert_module_Service.createModule(body); 
      return ResponseEntity.status(HttpStatus.CREATED).body(detail_module);
   
    }
}