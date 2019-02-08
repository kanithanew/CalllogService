package calllog.webservices.calllog_ws.subcall;

import org.springframework.data.repository.CrudRepository;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

import java.util.List;

public interface Subcall_Repository
        extends JpaRepository<Subcall, Long>, JpaSpecificationExecutor<Subcall> {
    // Login Check Username and Password
 
    /**
   *
   */

    String GETDATA = "select * from gfmis_subcall where callid=?1 order by subcallid" ;
    @Query(value = GETDATA, nativeQuery = true)
    Collection<Subcall> findsubcall(Integer callid);

}