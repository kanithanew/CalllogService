package calllog.webservices.calllog_ws.detail_updatepage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;

@Service
public class Detail_Updatepage_Service {
    private Detail_Updatepage_Repository detail_updatepage_repository;

    @Autowired
    public Detail_Updatepage_Service(Detail_Updatepage_Repository repository) {
        this.detail_updatepage_repository = repository;
    }

    public Optional<Detail_Updatepage> updateData(Integer callid, Detail_Updatepage body) {

        Optional<Detail_Updatepage> customerOptional = detail_updatepage_repository.findCallid(callid);

        if (!customerOptional.isPresent()) {
            return null;
        }
        body.setId(callid);
        return Optional.of(detail_updatepage_repository.save(body));

    }
}