package calllog.webservices.calllog_ws.modulerelateion;

import lombok.Data;

import java.text.DateFormat;
import java.util.List;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.annotation.Transient;

@Data
@Entity
public class ModuleRelateion {
  @Id
  private int id;
  private String moduleid;
  private String submoduleid;
  private String modulename;
  private String submodulename;

  /**
   * @return the modulename
   */
  public String getModulename() {
    return modulename;
  }

  /**
   * @return the submoduleid
   */
  public String getSubmoduleid() {
    return submoduleid;
  }

  /**
   * @param submoduleid the submoduleid to set
   */
  public void setSubmoduleid(String submoduleid) {
    this.submoduleid = submoduleid;
  }

  /**
   * @return the moduleid
   */
  public String getModuleid() {
    return moduleid;
  }

  /**
   * @param moduleid the moduleid to set
   */
  public void setModuleid(String moduleid) {
    this.moduleid = moduleid;
  }

  /**
   * @return the submodulename
   */
  public String getSubmodulename() {
    return submodulename;
  }

  /**
   * @param submodulename the submodulename to set
   */
  public void setSubmodulename(String submodulename) {
    this.submodulename = submodulename;
  }

  /**
   * @param modulename the modulename to set
   */
  public void setModulename(String modulename) {
    this.modulename = modulename;
  }

}