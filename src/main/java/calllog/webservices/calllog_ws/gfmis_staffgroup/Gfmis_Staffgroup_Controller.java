package calllog.webservices.calllog_ws.gfmis_staffgroup;
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
@RequestMapping("/gfmis_staffgroup")
public class Gfmis_Staffgroup_Controller {

    @Autowired
    Gfmis_Staffgroup_Service  gfmis_staffgroup_Service;

    @GetMapping(params = "moduleid")
    public List<Gfmis_Staffgroup> getHeaduser(@RequestParam(value = "moduleid") Integer moduleid) {
        return gfmis_staffgroup_Service.retrieveGfmis_staffhead(moduleid);
    }
  
}