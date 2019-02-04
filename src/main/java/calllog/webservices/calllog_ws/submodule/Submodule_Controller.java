package calllog.webservices.calllog_ws.submodule;
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
@RequestMapping("/submodule")
public class Submodule_Controller {

    @Autowired
    Submodule_Service  submodule_Service;

    @GetMapping(params = "moduleid")
    public List<Submodule> getSubmodule(@RequestParam(value = "moduleid") Integer submodule) {
        return submodule_Service.retrieveSubmodul(submodule);

    }
}