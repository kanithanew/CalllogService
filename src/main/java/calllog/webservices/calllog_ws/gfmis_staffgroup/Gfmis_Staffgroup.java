package calllog.webservices.calllog_ws.gfmis_staffgroup;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Gfmis_Staffgroup {
  @Id
  private Integer modulecode;
  private String calllogin;
  private String callusername;

  /**
   * @return the calllogin
   */
  public String getCalllogin() {
    return calllogin;
  }

  /**
   * @return the callusername
   */
  public String getCallusername() {
    return callusername;
  }

  /**
   * @param callusername the callusername to set
   */
  public void setCallusername(String callusername) {
    this.callusername = callusername;
  }

  /**
   * @param calllogin the calllogin to set
   */
  public void setCalllogin(String calllogin) {
    this.calllogin = calllogin;
  }



}