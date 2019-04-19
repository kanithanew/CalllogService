package calllog.webservices.calllog_ws.ministry;
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
@RequestMapping("/ministry")
public class Ministry_Controller {

    @Autowired
    Ministry_Service  ministry_Service;

    @GetMapping()
    public List<Ministry> getMinistry() {
        return ministry_Service.retrieveMinistry();
    }
}