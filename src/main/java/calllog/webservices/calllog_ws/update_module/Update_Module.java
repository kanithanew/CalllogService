package calllog.webservices.calllog_ws.update_module;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "gfmis_m_module")
public class Update_Module {
  @Id
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