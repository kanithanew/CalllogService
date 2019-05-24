package calllog.webservices.calllog_ws.positionuser;
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
@RequestMapping("/positionuser")
public class Positionuser_Controller {

    @Autowired
    Positionuser_Service  positionuser_Service;

    @GetMapping()
    public List<Positionuser> getPositionuser() {
        return positionuser_Service.retrievePositionuser();

    }
}