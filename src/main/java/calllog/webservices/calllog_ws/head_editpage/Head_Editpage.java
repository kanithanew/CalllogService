package calllog.webservices.calllog_ws.head_editpage;
import lombok.Data;

import java.text.DateFormat;
import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
public class Head_Editpage {
  @Id
  private String callid;
  private String namecontact;
  private String telcontact;
  private String calldate;
  private String problem;
  private String modulename;
  private String submodulename;
  private String callstatus;

  /**
   * @return the namecontact
   */
  public String getNamecontact() {
    return namecontact;
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
   * @return the problem
   */
  public String getProblem() {
    return problem;
  }

  /**
   * @param problem the problem to set
   */
  public void setProblem(String problem) {
    this.problem = problem;
  }

  /**
   * @return the calldate
   */
  public String getCalldate() {
    return calldate;
  }

  /**
   * @param calldate the calldate to set
   */
  public void setCalldate(String calldate) {
    this.calldate = calldate;
  }

  /**
   * @return the telcontact
   */
  public String getTelcontact() {
    return telcontact;
  }

  /**
   * @param telcontact the telcontact to set
   */
  public void setTelcontact(String telcontact) {
    this.telcontact = telcontact;
  }

  /**
   * @param namecontact the namecontact to set
   */
  public void setNamecontact(String namecontact) {
    this.namecontact = namecontact;
  }
	}