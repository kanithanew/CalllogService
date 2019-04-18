package calllog.webservices.calllog_ws.department;

import org.springframework.data.repository.CrudRepository;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

import java.util.List;

public interface Department_Repository
        extends JpaRepository<Department, Long>, JpaSpecificationExecutor<Department> {

    String GET_MINISTRY = "SELECT * FROM gfmis_m_department where status ='1' order by department_name" ;
    @Query(value = GET_MINISTRY, nativeQuery = true)
    Collection<Department> finddepartment();

}