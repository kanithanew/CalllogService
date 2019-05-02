package calllog.webservices.calllog_ws.insert_submodule;

import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "gfmis_m_submodule")
public class Insert_SubModule {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "id_submodule")
  private int submoduleid;
  private int moduleid;
  private String submodulename;
  private int status;

  /**
   * @return the moduleid
   */
  public int getModuleid() {
    return moduleid;
  }

  /**
   * @return the status
   */
  public int getStatus() {
    return status;
  }

  /**
   * @param status the status to set
   */
  public void setStatus(int status) {
    this.status = status;
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
   * @param moduleid the moduleid to set
   */
  public void setModuleid(int moduleid) {
    this.moduleid = moduleid;
  }

}