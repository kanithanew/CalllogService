package calllog.webservices.calllog_ws.excel_subcall;

import org.springframework.data.repository.CrudRepository;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

import java.util.List;

public interface Excel_Subcall_Repository
        extends JpaRepository<Excel_Subcall, Long>, JpaSpecificationExecutor<Excel_Subcall> {

    String GET_REPORT = " SELECT * FROM report_subcall WHERE  (  report_subcall.calldate BETWEEN ?1 AND ?2 ) AND report_subcall.callchanel =?3 order by callid,create_date";

    @Query(value = GET_REPORT, nativeQuery = true)
    Collection<Excel_Subcall> findSubCall(String datefrom, String dateto, Integer callchanel);

   // String GET_REPORT2 = " SELECT * FROM report_subcall WHERE  (  report_subcall.calldate BETWEEN ?1 AND ?2 ) AND report_subcall.callchanel =?3 order by callid,create_date";
   String GET_REPORT2 = "SELECT * FROM report_subcall WHERE   (  report_subcall.closedate BETWEEN ?1 AND ?2 )   AND report_subcall.callchanel = ?3 AND report_subcall.callstatus like 'Close%' order by callid,create_date";
     

    @Query(value = GET_REPORT2, nativeQuery = true)
    Collection<Excel_Subcall> findSubCloseCall(String dateclosefrom, String dateto, Integer callchanel);
}