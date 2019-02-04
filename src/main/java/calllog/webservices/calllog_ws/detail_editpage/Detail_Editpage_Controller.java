package calllog.webservices.calllog_ws.detail_editpage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/detail_editpage")
public class Detail_Editpage_Controller {

    @Autowired
    Detail_Editpage_Service  detail_editpage_Service;
     
    @PostMapping()
    public ResponseEntity<Detail_Editpage> postCustomer(@RequestBody Detail_Editpage body) {

        Detail_Editpage detail_editpage = detail_editpage_Service.createDetailEditpage(body); 
      return ResponseEntity.status(HttpStatus.CREATED).body(detail_editpage);
   
    }
      /**
     *    @PutMapping("/{id}")
    public ResponseEntity<?> putCustomer(@PathVariable Long id, @Valid @RequestBody Customer body) {
        Optional<Customer> customer = customerService.updateCustomer(id, body);
        if(!customer.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().build();
    }

     * 
     */


}