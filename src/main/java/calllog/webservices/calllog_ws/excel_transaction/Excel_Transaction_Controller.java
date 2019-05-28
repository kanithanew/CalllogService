package calllog.webservices.calllog_ws.excel_transaction;
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
@RequestMapping("/excel_transcall")
public class Excel_Transaction_Controller {

    @Autowired
    Excel_Transaction_Service  excel_transaction_Service;


    @GetMapping(params = "month")
    public List<Excel_Transaction> getLoginuser_Profile(@RequestParam(value = "month") String month,
            @RequestParam(value = "year") String year, @RequestParam(value = "callchanel") Integer callchanel) {
                Integer result = Integer.valueOf(year.substring(0, 4));
                result = result + 543;
                String s = String.valueOf(result);
                year = s.concat(year.substring(4));
                System.out.println("year ---->" + year);
        return excel_transaction_Service.retrieveData(month, year,callchanel);

    }

}