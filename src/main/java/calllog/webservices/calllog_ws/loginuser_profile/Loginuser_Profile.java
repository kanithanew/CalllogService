package calllog.webservices.calllog_ws.loginuser_profile;

import lombok.Data;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

@Data
@Entity
public class Loginuser_Profile {
  @Id
  private String calllogin;
  private String callusername;
  private String positionid;
  private String positiondesc;
  private String callposition;
  private String callpositiondesc;
  private String callpassword;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private java.util.Date create_date;
  private String callstatus;

  /**
   * @return the callusername
   */
  public String getCallusername() {
    return callusername;
  }

  public String getCallposition() {
    return callposition;
  }

  public void setCallposition(String callposition) {
    this.callposition = callposition;
  }

  /**
   * @return the callstatus
   */
  public String getCallstatus() {
    return callstatus;
  }

  /**
   * @param callstatus the callstatus to set
   */
  public void setCallstatus(String callstatus) {
    this.callstatus = callstatus;
  }

  /**
   * @return the callpassword
   */
  public String getCallpassword() {
    return callpassword;
  }

  /**
   * @param callpassword the callpassword to set
   */
  public void setCallpassword(String callpassword) {
    this.callpassword = callpassword;
  }

  /**
   * @return the positionid
   */
  public String getPositionid() {
    return positionid;
  }

  /**
   * @param positionid the positionid to set
   */
  public void setPositionid(String positionid) {
    this.positionid = positionid;
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