package calllog.webservices.calllog_ws.insert_staffgroup;
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
@RequestMapping("/insert_staffgroup")
public class Insert_Staffgroup_Controller {

    @Autowired
    Insert_Staffgroup_Service insert_staffgroup_Service;

      @PostMapping()
    public ResponseEntity<Insert_Staffgroup> postCustomer(@RequestBody Insert_Staffgroup body) {
      Insert_Staffgroup detail_module = insert_staffgroup_Service.createStaffgroup(body); 
      return ResponseEntity.status(HttpStatus.CREATED).body(detail_module);
    }
}