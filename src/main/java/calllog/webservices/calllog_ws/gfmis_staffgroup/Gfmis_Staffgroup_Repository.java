package calllog.webservices.calllog_ws.gfmis_staffgroup;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

public interface Gfmis_Staffgroup_Repository extends CrudRepository<Gfmis_Staffgroup, Long> {
   

    String GET_HDUSER = "select calllogin,modulecode from gfmis_staffgroup where modulecode=?1 order by modulecode " ;
    @Query(value = GET_HDUSER, nativeQuery = true)
    Collection<Gfmis_Staffgroup> findHead(Integer moduleid);

}