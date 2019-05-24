package calllog.webservices.calllog_ws.excel_transaction;

import org.springframework.data.repository.CrudRepository;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

import java.util.List;

public interface Excel_Transaction_Repository
        extends JpaRepository<Excel_Transaction, Long>, JpaSpecificationExecutor<Excel_Transaction> {

    String GET_REPORT = " SELECT * FROM report_transaction where  month=?1 AND  year =?2 AND callchanel =?3 ";
    @Query(value = GET_REPORT, nativeQuery = true)
    Collection<Excel_Transaction> findTransCall(String month,String year,Integer callchanel);
}