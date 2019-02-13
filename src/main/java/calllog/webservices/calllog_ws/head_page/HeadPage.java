package calllog.webservices.calllog_ws.head_page;

import lombok.Data;

import java.text.DateFormat;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;


@Data
@Entity
public class HeadPage {
  @Id
  private Integer callid;
  private String repperson;
  private String payunit;
  private String payunit_name;
  private String department_name;
  private String ministry_name;
  private String province_name;
  private String namecontact;
  private String telcontact;
  private String emailcontact;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private java.util.Date calldate;
  private String modulename;
  private String submodulename;
  private String forcedesc;
  private String problemdesc;
  private String problem;
  private String attach;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private java.util.Date closedate;
  private String repname;

  /**
   * @return the repperson
   */
  public String getRepperson() {
    return repperson;
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
   * @return the attach
   */
  public String getAttach() {
    return attach;
  }

  /**
   * @param attach the attach to set
   */
  public void setAttach(String attach) {
    this.attach = attach;
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
   * @return the problemdesc
   */
  public String getProblemdesc() {
    return problemdesc;
  }

  /**
   * @param problemdesc the problemdesc to set
   */
  public void setProblemdesc(String problemdesc) {
    this.problemdesc = problemdesc;
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
   * @return the emailcontact
   */
  public String getEmailcontact() {
    return emailcontact;
  }

  /**
   * @param emailcontact the emailcontact to set
   */
  public void setEmailcontact(String emailcontact) {
    this.emailcontact = emailcontact;
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
   * @return the province_name
   */
  public String getProvince_name() {
    return province_name;
  }

  /**
   * @param province_name the province_name to set
   */
  public void setProvince_name(String province_name) {
    this.province_name = province_name;
  }

  /**
   * @return the ministry_name
   */
  public String getMinistry_name() {
    return ministry_name;
  }

  /**
   * @param ministry_name the ministry_name to set
   */
  public void setMinistry_name(String ministry_name) {
    this.ministry_name = ministry_name;
  }

  /**
   * @return the department_name
   */
  public String getDepartment_name() {
    return department_name;
  }

  /**
   * @param department_name the department_name to set
   */
  public void setDepartment_name(String department_name) {
    this.department_name = department_name;
  }

  /**
   * @return the payunit_name
   */
  public String getPayunit_name() {
    return payunit_name;
  }

  /**
   * @param payunit_name the payunit_name to set
   */
  public void setPayunit_name(String payunit_name) {
    this.payunit_name = payunit_name;
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
   * @param repperson the repperson to set
   */
  public void setRepperson(String repperson) {
    this.repperson = repperson;
  }
  
	}