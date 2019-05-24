package calllog.webservices.calllog_ws.insert_staff;
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
@RequestMapping("/insert_staff")
public class Insert_Staff_Controller {

    @Autowired
    Insert_Staff_Service  insert_staff_Service;

      @PostMapping()
    public ResponseEntity<Insert_Staff> postCustomer(@RequestBody Insert_Staff body) {
      Insert_Staff detail_submodule = insert_staff_Service.updateSubModule(body); 
      return ResponseEntity.status(HttpStatus.CREATED).body(detail_submodule);
   
    }
}