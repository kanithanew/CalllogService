package calllog.webservices.calllog_ws.insert_payunit;
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
@RequestMapping("/insert_payunit")
public class Insert_Payunit_Controller {

    @Autowired
    Insert_Payunit_Service  insert_payunit_Service;

      @PostMapping()
    public ResponseEntity<Insert_Payunit> postCustomer(@RequestBody Insert_Payunit body) {
        Insert_Payunit detail_payunit = insert_payunit_Service.createPayunit(body); 
      return ResponseEntity.status(HttpStatus.CREATED).body(detail_payunit);
   
    }
}