package calllog.webservices.calllog_ws.insert_logprocess;
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
@RequestMapping("/insert_logprocess")
public class Insert_Logprocess_Controller {

    @Autowired
    Insert_Logprocess_Service  insert_logprocess_Service;

    @PostMapping()
    public ResponseEntity<Insert_Logprocess> postLogprocess(@RequestBody Insert_Logprocess body) {

      Insert_Logprocess detail_editpage = insert_logprocess_Service.createLogprocess(body); 
      return ResponseEntity.status(HttpStatus.CREATED).body(detail_editpage);
   
    }
     
 
}