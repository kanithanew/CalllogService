package calllog.webservices.calllog_ws.HD_Owner;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

public interface HD_Owner_Repository extends CrudRepository<HD_Owner, Long> {
   

    String GET_HDUSER = "select helpdeskowner from gfmis_calllog where callid=?1" ;
    @Query(value = GET_HDUSER, nativeQuery = true)
    Collection<HD_Owner> findHD_Owner(Integer callid);

}