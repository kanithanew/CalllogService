package calllog.webservices.calllog_ws.reportcall;

import lombok.Data;

import java.text.DateFormat;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.springframework.beans.factory.annotation.Value;


@Data
@Entity
public class ReportCall {

  @Id
  private String callid;
  private String namecontact;
  private String payunit_name;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private java.util.Date calldate;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private java.util.Date datetimesend;
  private String modulename;
  private String submodulename;
  private String problem;
  private String createname;
  private String forcedesc;
  private String chaneldesc;
  private String statuscall;
  private String repname;
  private String updateproblem;
  private String telcontact;

  /**
   * @return the payunit_name
   */
  public String getPayunit_name() {
    return payunit_name;
  }
  /**
   * @return the namecontact
   */
  public String getNamecontact() {
    return namecontact;
  }

  /**
   * @param namecontact the namecontact to set
   */
  public void setNamecontact(String namecontact) {
    this.namecontact = namecontact;
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
   * @return the repname
   */
  public String getRepname() {
    return repname;
  }

  /**
   * @param repname the repname to set
   */
  public void setRepname(String repname) {
    this.repname = repname;
  }

  /**
   * @return the statuscall
   */
  public String getStatuscall() {
    return statuscall;
  }

  /**
   * @param statuscall the statuscall to set
   */
  public void setStatuscall(String statuscall) {
    this.statuscall = statuscall;
  }

  /**
   * @return the chaneldesc
   */
  public String getChaneldesc() {
    return chaneldesc;
  }

  /**
   * @param chaneldesc the chaneldesc to set
   */
  public void setChaneldesc(String chaneldesc) {
    this.chaneldesc = chaneldesc;
  }

  /**
   * @return the forcedesc
   */
  public String getForcedesc() {
    return forcedesc;
  }

  /**
   * @param forcedesc the forcedesc to set
   */
  public void setForcedesc(String forcedesc) {
    this.forcedesc = forcedesc;
  }

  /**
   * @return the createname
   */
  public String getCreatename() {
    return createname;
  }

  /**
   * @param createname the createname to set
   */
  public void setCreatename(String createname) {
    this.createname = createname;
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
   * @return the callid
   */
  public String getCallid() {
    return callid;
  }

  /**
   * @param callid the callid to set
   */
  public void setCallid(String callid) {
    this.callid = callid;
  }

  /**
   * @param payunit_name the payunit_name to set
   */
  public void setPayunit_name(String payunit_name) {
    this.payunit_name = payunit_name;
  }
	}