package calllog.webservices.calllog_ws.loginuser_profile;

import lombok.Data;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Loginuser_Profile {
  @Id
  private String calllogin;
  private String callusername;
  private String positiondesc;
  private String callpositionid;
  private String callpositiondesc;

  /**
   * @return the callusername
   */
  public String getCallusername() {
    return callusername;
  }

  /**
   * @return the callpositiondesc
   */
  public String getCallpositiondesc() {
    return callpositiondesc;
  }

  /**
   * @param callpositiondesc the callpositiondesc to set
   */
  public void setCallpositiondesc(String callpositiondesc) {
    this.callpositiondesc = callpositiondesc;
  }

  /**
   * @return the callpositionid
   */
  public String getCallpositionid() {
    return callpositionid;
  }

  /**
   * @param callpositionid the callpositionid to set
   */
  public void setCallpositionid(String callpositionid) {
    this.callpositionid = callpositionid;
  }

  /**
   * @return the positiondesc
   */
  public String getPositiondesc() {
    return positiondesc;
  }

  /**
   * @param positiondesc the positiondesc to set
   */
  public void setPositiondesc(String positiondesc) {
    this.positiondesc = positiondesc;
  }

  /**
   * @param callusername the callusername to set
   */
  public void setCallusername(String callusername) {
    this.callusername = callusername;
  }


}