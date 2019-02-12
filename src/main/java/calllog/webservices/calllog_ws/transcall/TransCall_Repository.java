package calllog.webservices.calllog_ws.transcall;

import org.springframework.data.repository.CrudRepository;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

import java.util.List;

public interface TransCall_Repository extends JpaRepository<TransCall, Long>, JpaSpecificationExecutor<TransCall> {

    String GET_REPORT = "select d.datetimesend,d.namerecord,d.logprocess,e.callusername as repname from ( select a.* ,CASE WHEN touser  = 'Update' OR touser  = 'Create' OR touser  = 'Edit' OR touser  = 'Close' THEN fromuser  ELSE touser END AS repperson,b.callusername as namerecord from gfmis_logprocess a inner join gfmis_staff b on a.fromuser=b.calllogin )d inner join gfmis_staff e on d.repperson=e.calllogin where d.callid =?1 ORDER BY d.idlogprocess ";
    @Query(value = GET_REPORT, nativeQuery = true)
    Collection<TransCall> findTransCall(Integer callid);
}