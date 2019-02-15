package calllog.webservices.calllog_ws.gfmis_staff;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

public interface Gfmis_staffRepository extends CrudRepository<Gfmis_staff, Long> {
    List<Gfmis_staff> findBycalllogin(String calllogin);

    String GET_HDUSER = "select calllogin,null as callpassword,callusername,positionuser from gfmis_staff where positionuser ='HD' order by calllogin" ;
    @Query(value = GET_HDUSER, nativeQuery = true)
    Collection<Gfmis_staff> findHD();

}