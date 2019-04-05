package calllog.webservices.calllog_ws.search_payunit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;

@Service
public class SearchPayunit_Service {
    /**
     *
     */

    private SearchPayunit_Repository searchpayunit_repository;

    @Autowired
    public SearchPayunit_Service(SearchPayunit_Repository repository) {
        this.searchpayunit_repository = repository;
    }

    public List<SearchPayunit> retrieveSearchPayunit(String payunit, String payunit_name, String department_name,
            String province_name, String ministry_name) {

        return (List<SearchPayunit>) searchpayunit_repository.findsearchpayunit(payunit, payunit_name, department_name,
                province_name, ministry_name);

    }

}