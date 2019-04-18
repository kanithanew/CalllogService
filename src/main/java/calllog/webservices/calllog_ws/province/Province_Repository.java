package calllog.webservices.calllog_ws.province;

import org.springframework.data.repository.CrudRepository;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

import java.util.List;

public interface Province_Repository
        extends JpaRepository<Province, Long>, JpaSpecificationExecutor<Province> {

    String GET_MINISTRY = "SELECT * FROM gfmis_m_province where status ='1' order by province_name" ;
    @Query(value = GET_MINISTRY, nativeQuery = true)
    Collection<Province> findprovince();

}