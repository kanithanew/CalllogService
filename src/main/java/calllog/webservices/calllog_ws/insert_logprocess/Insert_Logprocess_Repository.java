package calllog.webservices.calllog_ws.insert_logprocess;

import org.springframework.data.repository.CrudRepository;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.List;

public interface Insert_Logprocess_Repository
        extends JpaRepository<Insert_Logprocess, Integer>, JpaSpecificationExecutor<Insert_Logprocess> {
        }
