package calllog.webservices.calllog_ws.modulerelateion;

import org.springframework.data.repository.CrudRepository;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

import java.util.List;

public interface ModuleRelateion_Repository
    extends JpaRepository<ModuleRelateion, Long>, JpaSpecificationExecutor<ModuleRelateion> {
  // Login Check Username and Password

  /**
  *
  */

  // String GET_MODULE ="select rank() OVER (ORDER BY a.moduleid, b.submoduleid)
  // as id, a.moduleid,b.submoduleid,a.modulename,b.submodulename from
  // gfmis_m_module a left join gfmis_m_submodule b on a.moduleid=b.moduleid where
  // a.status=1 and b.status=1 order by id, a.moduleid,b.submoduleid";
  String GET_MODULE = "select rank() OVER (ORDER BY a.moduleid, b.submoduleid) as id,a.moduleid,b.submoduleid,a.modulename,b.submodulename from gfmis_m_module a left join gfmis_m_submodule b on a.moduleid=b.moduleid where a.status=1 and b.status=1  and (a.moduleid=?1 and b.submoduleid=?2) order by a.moduleid,b.submoduleid";

  @Query(value = GET_MODULE, nativeQuery = true)
  Collection<ModuleRelateion> findmodulerelation(Integer module,Integer submodule);

  String GET_MODULE2 = "select rank() OVER (ORDER BY a.moduleid, b.submoduleid) as id,a.moduleid,b.submoduleid,a.modulename,b.submodulename from gfmis_m_module a left join gfmis_m_submodule b on a.moduleid=b.moduleid where a.status=1 and b.status=1  and a.moduleid=?1  order by a.moduleid,b.submoduleid";

  @Query(value = GET_MODULE2, nativeQuery = true)
  Collection<ModuleRelateion> findmodulerelation2(Integer module);

}