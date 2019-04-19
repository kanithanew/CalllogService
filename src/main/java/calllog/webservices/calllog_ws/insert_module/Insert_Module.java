package calllog.webservices.calllog_ws.insert_module;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "gfmis_m_module")
public class Insert_Module {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "id_module")
  private int moduleid;
  private String modulename;
  private int status;

  /**
   * @return the modulename
   */
  public String getModulename() {
    return modulename;
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
   * @param modulename the modulename to set
   */
  public void setModulename(String modulename) {
    this.modulename = modulename;
  }
}