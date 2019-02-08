package calllog.webservices.calllog_ws.head_page;
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
@RequestMapping("/headpage")
public class HeadPage_Controller {

    @Autowired
    HeadPage_Service headpage_Service;

    @GetMapping(params = "callid")
    public List<HeadPage> getHomePage(@RequestParam(value = "callid") Integer callid) {
       System.out.print("aaaaaaaaaaaaaaa");
        return headpage_Service.retrieveData(callid);

    }
}