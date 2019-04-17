package calllog.webservices.calllog_ws.search_payunit;

import org.springframework.data.repository.CrudRepository;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

import java.util.List;

public interface SearchPayunit_Repository
        extends JpaRepository<SearchPayunit, Long>, JpaSpecificationExecutor<SearchPayunit> {

 //   String GETDATA = "select * from province_relations where payunit like ";
   
    String GETDATA = "select * from province_relations where payunit like ?1 and payunit_name like ?2 and department_name like ?3  and province_name like ?4  and ministry_name like ?5 order by payunit";
    
    @Query(value = GETDATA, nativeQuery = true)
    Collection<SearchPayunit> findsearchpayunit(String payunit,String payunit_name,String department_name,String province_name,String ministry_name);
    

}