package calllog.webservices.calllog_ws.insert_staffgroup;

import org.springframework.data.repository.CrudRepository;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

import java.util.List;

public interface Insert_Staffgroup_Repository
        extends JpaRepository<Insert_Staffgroup, Long>, JpaSpecificationExecutor<Insert_Staffgroup> {

}