package calllog.webservices.calllog_ws.head_page;

import org.springframework.data.repository.CrudRepository;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

import java.util.List;

public interface HeadPage_Repository
        extends JpaRepository<HeadPage, Long>, JpaSpecificationExecutor<HeadPage> {
    // Login Check Username and Password
 
    /**
   *
   */

  String GET_DATA = "SELECT a.callid,a.idopen,b.repperson,a.payunit,a.payunit_name,a.ministry_name,a.province_name,a.department_name,a.namecontact,a.telcontact,a.emailcontact,a.calldate,a.helpdeskowner,a.createdate,a.callmodule,a.modulename,a.callsubmodule,a.submodulename,a.force,a.forcedesc,a.problemtype,a.problemdesc,a.problem,a.callchanel,a.attach, CASE WHEN a.callstatus like 'Close%'	THEN b.datetimesend ELSE null END AS closedate,c.callusername as repname FROM all_headercall a LEFT JOIN lasted_logprocess b on a.callid = b.callid inner join gfmis_staff c on b.repperson=c.calllogin where a.callid =?1";
    @Query(value = GET_DATA, nativeQuery = true)
    Collection<HeadPage> findData(Integer callid);

}