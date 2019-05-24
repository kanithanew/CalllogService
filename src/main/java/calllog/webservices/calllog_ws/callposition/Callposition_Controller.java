package calllog.webservices.calllog_ws.callposition;
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
@RequestMapping("/callposition")
public class Callposition_Controller {

    @Autowired
    Callposition_Service  callposition_Service;

    @GetMapping()
    public List<Callposition> getCallposition() {
        return callposition_Service.retrieveCallposition();
    }
}