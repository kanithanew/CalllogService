package calllog.webservices.calllog_ws.insert_payunit;

import org.springframework.data.repository.CrudRepository;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

import java.util.List;

public interface Insert_Payunit_Repository
        extends JpaRepository<Insert_Payunit, Long>, JpaSpecificationExecutor<Insert_Payunit> {

}