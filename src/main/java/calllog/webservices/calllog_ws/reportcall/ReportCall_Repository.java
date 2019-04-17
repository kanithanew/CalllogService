package calllog.webservices.calllog_ws.reportcall;

import org.springframework.data.repository.CrudRepository;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

import java.util.List;

public interface ReportCall_Repository extends JpaRepository<ReportCall, Long>, JpaSpecificationExecutor<ReportCall> {

    String GET_REPORT = "SELECT e.* FROM (SELECT a.namecontact,a.payunit_name,a.callid,a.calldate,b.datetimesend,a.modulename,a.submodulename,a.problem,d.callusername as createname,c.callusername as repname,a.forcedesc,a.chaneldesc,null AS updateproblem,a.telcontact,   CASE  WHEN b.touser = 'Close' THEN 'Close'  ELSE 'Pending' END AS statuscall FROM all_headercall a     left join lasted_logprocess b  on a.callid=b.callid left join gfmis_staff c on a.calllogin = c.calllogin left join gfmis_staff d     on a.idopen = d.calllogin ORDER BY a.callid)e  WHERE  calldate  BETWEEN  ?1 AND ?2 AND statuscall='Pending' order by e.callid";

    @Query(value = GET_REPORT, nativeQuery = true)
    Collection<ReportCall> findPendingCall(java.util.Date fromdate, java.util.Date todate);

    String GET_REPORT2 = "SELECT e.* FROM (SELECT a.namecontact,a.payunit_name,a.callid,a.calldate,b.datetimesend,a.modulename,a.submodulename,a.problem,d.callusername as createname,c.callusername as repname,a.forcedesc,a.chaneldesc,null AS updateproblem,a.telcontact,   CASE  WHEN b.touser = 'Close' THEN 'Close'  ELSE 'Pending' END AS statuscall FROM all_headercall a     left join lasted_logprocess b  on a.callid=b.callid left join gfmis_staff c on a.calllogin = c.calllogin left join gfmis_staff d     on a.idopen = d.calllogin ORDER BY a.callid)e  WHERE  datetimesend  BETWEEN  ?1 AND ?2 AND statuscall='Close' order by e.callid";

    @Query(value = GET_REPORT2, nativeQuery = true)
    Collection<ReportCall> findCloseCall(java.util.Date fromdate, java.util.Date todate);

    // findPending
    String GET_REPORT3 = "SELECT e.* FROM ( SELECT a.namecontact,a.payunit_name,a.callid,a.calldate,b.datetimesend,a.modulename,a.submodulename,a.problem,d.callusername as createname,c.callusername as repname,a.forcedesc,a.chaneldesc,a.telcontact,CASE WHEN b.touser = 'Close' THEN 'Close' ELSE 'Pending' END AS statuscall,f.updateproblem  FROM all_headercall a  left join lasted_logprocess b  on a.callid=b.callid  left join gfmis_staff c on a.calllogin = c.calllogin left join gfmis_staff d on a.idopen = d.calllogin left join lasted_subcall f on a.callid=f.callid ORDER BY a.callid)e  WHERE  datetimesend <= ?1 AND statuscall='Pending'";

    @Query(value = GET_REPORT3, nativeQuery = true)
    Collection<ReportCall> findPending(java.util.Date date);

    // findbypayunit
    String GET_REPORT4 = "SELECT e.* FROM (SELECT a.namecontact,a.payunit_name,a.callid,a.calldate,b.datetimesend,a.modulename,a.submodulename,a.problem,d.callusername as createname,c.callusername as repname,a.forcedesc,a.chaneldesc,null AS updateproblem,a.telcontact,   CASE  WHEN b.touser = 'Close' THEN 'Close'  ELSE 'Pending' END AS statuscall FROM all_headercall a     left join lasted_logprocess b  on a.callid=b.callid left join gfmis_staff c on a.calllogin = c.calllogin left join gfmis_staff d     on a.idopen = d.calllogin WHERE a.payunit=?1 ORDER BY a.callid)e  WHERE  calldate  BETWEEN  ?2 AND ?3 ";

    @Query(value = GET_REPORT4, nativeQuery = true)
    Collection<ReportCall> findbypayunit(String payunit, java.util.Date fromdate, java.util.Date todate);

    // findbydate
    String GET_REPORT5 = "SELECT e.* FROM (SELECT a.namecontact,a.payunit_name,a.callid,a.calldate,b.datetimesend,a.modulename,a.submodulename,a.problem,d.callusername as createname,c.callusername as repname,a.forcedesc,a.chaneldesc,null AS updateproblem,a.telcontact,   CASE  WHEN b.touser = 'Close' THEN 'Close'  ELSE 'Pending' END AS statuscall FROM all_headercall a     left join lasted_logprocess b  on a.callid=b.callid left join gfmis_staff c on a.calllogin = c.calllogin left join gfmis_staff d     on a.idopen = d.calllogin ORDER BY a.callid)e  WHERE  calldate  BETWEEN  ?1 AND ?2 ";

    @Query(value = GET_REPORT5, nativeQuery = true)
    Collection<ReportCall> findbydate(java.util.Date fromdate, java.util.Date todate);
}