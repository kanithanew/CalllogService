package calllog.webservices.calllog_ws.detail_updatepage;

import org.springframework.data.repository.CrudRepository;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.List;

public interface Detail_Updatepage_Repository
        extends JpaRepository<Detail_Updatepage, Integer>, JpaSpecificationExecutor<Detail_Updatepage> {
  String GET_DATA="SELECT *  FROM gfmis_calllog where callid=?1 ";
    @Query(value = GET_DATA, nativeQuery = true)
    Optional<Detail_Updatepage> findCallid(Integer callid);

}