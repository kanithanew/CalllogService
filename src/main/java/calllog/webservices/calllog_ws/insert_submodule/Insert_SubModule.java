package calllog.webservices.calllog_ws.insert_submodule;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "gfmis_m_submodule")
public class Insert_SubModule {
  @Id
  private int moduleid;
  private int submoduleid;
  private String submodulename;
  private int status;

  /**
   * @return the submoduleid
   */
  public int getSubmoduleid() {
    return submoduleid;
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
   * @param submoduleid the submoduleid to set
   */
  public void setSubmoduleid(int submoduleid) {
    this.submoduleid = submoduleid;
  }


}