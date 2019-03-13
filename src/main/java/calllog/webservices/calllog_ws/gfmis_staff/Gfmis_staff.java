package calllog.webservices.calllog_ws.gfmis_staff;



import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
public class Gfmis_staff{
  @Id
   private String calllogin;
   private String callpassword;
  private String callusername;

  /**
   * @return the callpassword
   */
  public String getCallpassword() {
    return callpassword;
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
   * @param callpassword the callpassword to set
   */
  public void setCallpassword(String callpassword) {
    this.callpassword = callpassword;
  }
	}