package calllog.webservices.calllog_ws.excel_subcall;

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
@RequestMapping("/excel_subcall")
public class Excel_Subcall_Controller {

    @Autowired
    Excel_Subcall_Service excel_subcall_Service;

    @GetMapping(params = "datefrom")
    public List<Excel_Subcall> getData(@RequestParam(value = "datefrom") String datefrom,
            @RequestParam(value = "dateto") String dateto, @RequestParam(value = "callchanel") Integer callchanel) {
        Integer result = Integer.valueOf(datefrom.substring(0, 4));
        result = result + 543;
        String s = String.valueOf(result);
        datefrom = s.concat(datefrom.substring(4));

        Integer result2 = Integer.valueOf(dateto.substring(0, 4));
        result2 = result2 + 543;
        String s2 = String.valueOf(result2);
        dateto = s2.concat(dateto.substring(4));

        System.out.println("datefrom ---->" + datefrom);
        System.out.println("dateto   ---->" + dateto);
        return excel_subcall_Service.retrieveData(datefrom, dateto, callchanel);

    }

    @GetMapping(params = "dateclosefrom")
    public List<Excel_Subcall> getDatalose(@RequestParam(value = "dateclosefrom") String dateclosefrom,
            @RequestParam(value = "dateto") String dateto, @RequestParam(value = "callchanel") Integer callchanel) {
        Integer result = Integer.valueOf(dateclosefrom.substring(0, 4));
        result = result + 543;
        String s = String.valueOf(result);
        dateclosefrom = s.concat(dateclosefrom.substring(4));

        Integer result2 = Integer.valueOf(dateto.substring(0, 4));
        result2 = result2 + 543;
        String s2 = String.valueOf(result2);
        dateto = s2.concat(dateto.substring(4));

        System.out.println("dateclosefrom ---->" + dateclosefrom);
        System.out.println("dateto   ---->" + dateto);
        return excel_subcall_Service.retrieveDataClose(dateclosefrom, dateto, callchanel);

    }
}