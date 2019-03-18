package calllog.webservices.calllog_ws.homepage;

import org.springframework.data.repository.CrudRepository;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

import java.util.List;

public interface HomePage_Repository extends JpaRepository<HomePage, Long>, JpaSpecificationExecutor<HomePage> {
    // Login Check Username and Password

    /**
    *
    */
  /*  String GET_HOMEPAGE3 = "SELECT alldate.* FROM (select d.callid,d.touser,d.fromuser,g.modulename,g.submodulename,d.payunit,d.calldate,e.callusername,d.logprocess,d.status  FROM ( select a.callid,a.callmodule,a.callsubmodule,a.payunit,a.calldate,b.touser,b.FROMuser,b.logprocess , "
            + "c.listcallid,CASE   " + " WHEN  a.callstatus ='CreateCall' THEN'OpenCall' "
            + "WHEN  a.helpdeskOwner is null and (b.touser='Update' or b.touser='Create' or  b.touser='Edit' ) THEN'OpenCall'  "
            + "WHEN  b.touser ='Helpdesk' THEN 'NewCall'   WHEN  b.touser =?1 THEN 'MyInbox'  "
            + "WHEN  b.FROMuser =?1  and (b.touser='Update' or b.touser='Create' or  b.touser='Edit' )  THEN 'MyInbox'  "
            + "ELSE  'Othercalls'  END as status,  CASE    WHEN  a.helpdeskOwner is null THEN b.FROMuser   "
            + "WHEN  b.touser='Update' or b.touser='Create' or  b.touser='Edit'  THEN b.FROMuser   ELSE  b.touser  "
            + "END as reppersON   FROM gfmis_calllog a   LEFT JOIN callpending b ON a.callid=b.callid   "
            + "LEFT JOIN (select DISTINCT(callid) as listcallid,'ListCall' as   "
            + "TempField FROM callpending_process where FROMuser =?1 or touser=?1 )c   ON a.callid=c.listcallid   "
            + ")d LEFT JOIN gfmis_staff e ON d.reppersON=e.calllogin  "
            + "LEFT JOIN module_enable g ON d.callmodule=g.moduleid and d.callsubmodule=g.submoduleid  where d.listcallid is not null or status ='NewCall' order by d.callid DESC )alldate order by alldate.callid  ";
*/
    String GET_HOMEPAGE = "select a.callid,c.touser,c.fromuser,a.modulename,a.submodulename,a.payunit,a.calldate,a.callusername, a.callstatus as logprocess ,CASE    WHEN  a.helpdeskowner is null THEN 'OpenCall' WHEN  a.helpdeskOwner ='Helpdesk' THEN 'NewCall'   WHEN  a.calllogin =?1 THEN 'MyInbox'  ELSE  'ListCall' END as status from all_headercall a INNER JOIN  (select distinct(callid) from callpending_process where touser=?1 or fromuser =?1 order by callid) b ON a.callid=b.callid INNER JOIN lasted_logprocess c on a.callid=c.callid";
    @Query(value = GET_HOMEPAGE, nativeQuery = true)
    Collection<HomePage> findLogin(String calllogin);

}