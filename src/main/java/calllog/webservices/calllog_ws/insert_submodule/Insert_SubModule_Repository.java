package calllog.webservices.calllog_ws.insert_submodule;

import org.springframework.data.repository.CrudRepository;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

import java.util.List;

public interface Insert_SubModule_Repository
        extends JpaRepository<Insert_SubModule, Long>, JpaSpecificationExecutor<Insert_SubModule> {

}