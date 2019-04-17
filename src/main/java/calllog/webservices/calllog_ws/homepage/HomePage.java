package calllog.webservices.calllog_ws.homepage;

import lombok.Data;

import java.text.DateFormat;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;


@Data
@Entity
public class HomePage {
  @Id
   private String callid;
   private String touser;
  private String fromuser;
  private String modulename;
  private String submodulename;
  private String payunit;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private java.util.Date calldate;
  private String callusername;
  private String logprocess;
  private String status;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private java.util.Date datetimesend;

  /**
   * @return the touser
   */
  public String getTouser() {
    return touser;
  }

  /**
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * @param status the status to set
   */
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * @return the logprocess
   */
  public String getLogprocess() {
    return logprocess;
  }

  /**
   * @param logprocess the logprocess to set
   */
  public void setLogprocess(String logprocess) {
    this.logprocess = logprocess;
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
   * @return the payunit
   */
  public String getPayunit() {
    return payunit;
  }

  /**
   * @param payunit the payunit to set
   */
  public void setPayunit(String payunit) {
    this.payunit = payunit;
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
   * @return the modulename
   */
  public String getModulename() {
    return modulename;
  }

  /**
   * @param modulename the modulename to set
   */
  public void setModulename(String modulename) {
    this.modulename = modulename;
  }

  /**
   * @return the fromuser
   */
  public String getFromuser() {
    return fromuser;
  }

  /**
   * @param fromuser the fromuser to set
   */
  public void setFromuser(String fromuser) {
    this.fromuser = fromuser;
  }

  /**
   * @param touser the touser to set
   */
  public void setTouser(String touser) {
    this.touser = touser;
  }

	}