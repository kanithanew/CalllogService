package calllog.webservices.calllog_ws.department;
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
@RequestMapping("/department")
public class Department_Controller {

    @Autowired
    Department_Service  department_Service;

    @GetMapping(params = "department")
    public List<Department> getDepartment() {
        return department_Service.retrieveDepartment();
    }
}