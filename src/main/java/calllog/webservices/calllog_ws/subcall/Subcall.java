package calllog.webservices.calllog_ws.subcall;

import lombok.Data;

import java.text.DateFormat;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Data
@Entity
@Table(name = "gfmis_subcall")
public class Subcall {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "id_subcall")
  private Integer subcallid;
  private Integer callid;
  private String updateproblem;
  private String calllogin;
  private String subcallstatus;
  private String subcallattach;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private java.util.Date create_date;

  /**
   * @return the callid
   */
  public Integer getCallid() {
    return callid;
  }

  /**
   * @return the subcallattach
   */
  public String getSubcallattach() {
    return subcallattach;
  }

  /**
   * @param subcallattach the subcallattach to set
   */
  public void setSubcallattach(String subcallattach) {
    this.subcallattach = subcallattach;
  }

  /**
   * @return the subcallstatus
   */
  public String getSubcallstatus() {
    return subcallstatus;
  }

  /**
   * @param subcallstatus the subcallstatus to set
   */
  public void setSubcallstatus(String subcallstatus) {
    this.subcallstatus = subcallstatus;
  }

  /**
   * @return the calllogin
   */
  public String getCalllogin() {
    return calllogin;
  }

  /**
   * @param calllogin the calllogin to set
   */
  public void setCalllogin(String calllogin) {
    this.calllogin = calllogin;
  }

  /**
   * @return the updateproblem
   */
  public String getUpdateproblem() {
    return updateproblem;
  }

  /**
   * @param updateproblem the updateproblem to set
   */
  public void setUpdateproblem(String updateproblem) {
    this.updateproblem = updateproblem;
  }

  /**
   * @param callid the callid to set
   */
  public void setCallid(Integer callid) {
    this.callid = callid;
  }
}
