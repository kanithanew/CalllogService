package calllog.webservices.calllog_ws.excel_module;

import org.springframework.data.repository.CrudRepository;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

import java.util.List;

public interface Excel_Module_Repository
        extends JpaRepository<Excel_Module, Long>, JpaSpecificationExecutor<Excel_Module> {

    String GET_REPORT = " SELECT * FROM report_module  WHERE ( report_module.calldate BETWEEN ?1 AND ?2 )     AND report_module.callchanel = ?3";

    @Query(value = GET_REPORT, nativeQuery = true)
    Collection<Excel_Module> findModuleCall(String datefrom, String dateto, Integer callchanel);
}