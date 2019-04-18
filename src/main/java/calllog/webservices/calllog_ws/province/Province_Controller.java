package calllog.webservices.calllog_ws.province;
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
@RequestMapping("/province")
public class Province_Controller {

    @Autowired
    Province_Service  province_Service;

    @GetMapping(params = "province")
    public List<Province> getProvince() {
        return province_Service.retrieveProvince();
    }
}