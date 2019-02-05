package calllog.webservices.calllog_ws.detail_updatepage;

import org.springframework.data.repository.CrudRepository;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

import java.util.List;

public interface Detail_Updatepage_Repository
        extends JpaRepository<Detail_Updatepage, Long>, JpaSpecificationExecutor<Detail_Updatepage> {
    // Login Check Username and Password
 
    /**
   *
   */

  String GET_SUBMODULE="select callid,payunit,namecontact from gfmis_calllog where callid=?1 order by callid";
    @Query(value = GET_SUBMODULE, nativeQuery = true)
    Collection<Detail_Updatepage> findCallid(Integer callid);

}