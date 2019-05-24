package calllog.webservices.calllog_ws.positionuser;

import org.springframework.data.repository.CrudRepository;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

import java.util.List;

public interface Positionuser_Repository
        extends JpaRepository<Positionuser, Long>, JpaSpecificationExecutor<Positionuser> {
  String GET_PROBLEMTYPE = "SELECT * FROM gfmis_m_positionuser  order by positionid" ;
   @Query(value = GET_PROBLEMTYPE, nativeQuery = true)
    Collection<Positionuser> findPositionuser();

}