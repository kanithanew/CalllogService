package calllog.webservices.calllog_ws.insert_staff;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Data
@Entity
@Table(name = "gfmis_staff")
public class Insert_Staff {
  @Id
  private String calllogin;
  private String callpassword;
  private String callusername;
  private Integer callposition;
  private Integer callstatus;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private java.util.Date create_date;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private java.util.Date update_date;
  private Integer positionid;

  /**
   * @return the callpassword
   */
  public String getCallpassword() {
    return callpassword;
  }

  /**
   * @return the positionid
   */
  public Integer getPositionid() {
    return positionid;
  }

  /**
   * @param positionid the positionid to set
   */
  public void setPositionid(Integer positionid) {
    this.positionid = positionid;
  }

  /**
   * @return the update_date
   */
  public java.util.Date getUpdate_date() {
    return update_date;
  }

  /**
   * @param update_date the update_date to set
   */
  public void setUpdate_date(java.util.Date update_date) {
    this.update_date = update_date;
  }

  /**
   * @return the create_date
   */
  public java.util.Date getCreate_date() {
    return create_date;
  }

  /**
   * @param create_date the create_date to set
   */
  public void setCreate_date(java.util.Date create_date) {
    this.create_date = create_date;
  }

  /**
   * @return the callstatus
   */
  public Integer getCallstatus() {
    return callstatus;
  }

  /**
   * @param callstatus the callstatus to set
   */
  public void setCallstatus(Integer callstatus) {
    this.callstatus = callstatus;
  }

  /**
   * @return the callposition
   */
  public Integer getCallposition() {
    return callposition;
  }

  /**
   * @param callposition the callposition to set
   */
  public void setCallposition(Integer callposition) {
    this.callposition = callposition;
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