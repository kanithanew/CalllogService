package calllog.webservices.calllog_ws.modulerelateion;
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
@RequestMapping("/modulerelation")
public class ModuleRelateion_Controller {

    @Autowired
    ModuleRelateion_Service  moduleRelateion_Service;

    @GetMapping(params = "modules")
    public List<ModuleRelateion> getModuleandSubmodule(@RequestParam(value = "modules") Integer module,@RequestParam(value = "submodule") Integer submodule) {
        return moduleRelateion_Service.retrieveModuleRelateion(module,submodule);
    }
    @GetMapping(params = "module")
    public List<ModuleRelateion> getModule(@RequestParam(value = "module") Integer module) {
        return moduleRelateion_Service.retrieveModuleRelateion2(module);
    }
}