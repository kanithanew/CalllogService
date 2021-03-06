package calllog.webservices.calllog_ws.payunit;

import org.springframework.data.repository.CrudRepository;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

import java.util.List;

public interface Payunit_Repository
        extends JpaRepository<Payunit, Long>, JpaSpecificationExecutor<Payunit> {

    String GET_PAYUNIT = "select payunit,payunit_name,department_id,department_name,ministry_id,ministry_name,province_id,province_name  from province_relations where payunit=?1" ;
    @Query(value = GET_PAYUNIT, nativeQuery = true)
    Collection<Payunit> findpayunit(String payunit);

}