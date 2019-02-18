package calllog.webservices.calllog_ws.HD_Owner;
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
@RequestMapping("/hd_owner")
public class HD_Owner_Controller {

    @Autowired
    HD_Owner_Service  hd_owner_Service;

    @GetMapping(params = "callid")
    public List<HD_Owner> getHeaduser(@RequestParam(value = "callid") Integer callid) {
        return hd_owner_Service.retrieveHD_Owner(callid);
    }
  
}