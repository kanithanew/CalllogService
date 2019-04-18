package calllog.webservices.calllog_ws.ministry;

import org.springframework.data.repository.CrudRepository;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

import java.util.List;

public interface Ministry_Repository
        extends JpaRepository<Ministry, Long>, JpaSpecificationExecutor<Ministry> {

    String GET_MINISTRY = "SELECT * FROM gfmis_m_ministry where status ='1' order by ministry_name" ;
    @Query(value = GET_MINISTRY, nativeQuery = true)
    Collection<Ministry> findministry();

}