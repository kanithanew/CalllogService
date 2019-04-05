package calllog.webservices.calllog_ws.search_payunit;

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
@RequestMapping("/search_payunit")
public class SearchPayunit_Controller {

    @Autowired
    SearchPayunit_Service searchpayunit_Service;
    String querydata = null;

    @GetMapping(params = "payunit")
    public List<SearchPayunit> getPayUnit(@RequestParam(value = "payunit") String payunit,
            @RequestParam(value = "payunit_name") String payunit_name,
            @RequestParam(value = "department_name") String department_name,
            @RequestParam(value = "province_name") String province_name,
            @RequestParam(value = "ministry_name") String ministry_name) {

        payunit = "%" + payunit + "%";
        payunit_name = "%" + payunit_name + "%";
        department_name = "%" + department_name + "%";
        province_name = "%" + province_name + "%";
        ministry_name = "%" + ministry_name + "%";

        return searchpayunit_Service.retrieveSearchPayunit(payunit, payunit_name, department_name, province_name,
                ministry_name);
    }

}