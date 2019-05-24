package calllog.webservices.calllog_ws.callposition;

import org.springframework.data.repository.CrudRepository;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

import java.util.List;

public interface Callposition_Repository
        extends JpaRepository<Callposition, Long>, JpaSpecificationExecutor<Callposition> {

    String GET_CALLPOSITION = "SELECT * FROM gfmis_m_callposition  order by callpositionid" ;
    @Query(value = GET_CALLPOSITION, nativeQuery = true)
    Collection<Callposition> findcallposition();

}