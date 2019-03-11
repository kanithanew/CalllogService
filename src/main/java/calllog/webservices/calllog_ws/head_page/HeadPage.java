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
  private String idopen;
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
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private java.util.Date createdate;
  private String helpdeskowner;
  private Integer callmodule;
  private String modulename;
  private Integer callsubmodule;
  private String submodulename;
  private Integer force;
  private String forcedesc;
  private Integer problemtype;
  private String problemdesc;
  private String problem;
  private Integer callchanel;
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
   * @return the idopen
   */
  public String getIdopen() {
    return idopen;
  }

  /**
   * @param idopen the idopen to set
   */
  public void setIdopen(String idopen) {
    this.idopen = idopen;
  }

  /**
   * @return the helpdeskowner
   */
  public String getHelpdeskowner() {
    return helpdeskowner;
  }

  /**
   * @param helpdeskowner the helpdeskowner to set
   */
  public void setHelpdeskowner(String helpdeskowner) {
    this.helpdeskowner = helpdeskowner;
  }

  /**
   * @return the callchanel
   */
  public Integer getCallchanel() {
    return callchanel;
  }

  /**
   * @param callchanel the callchanel to set
   */
  public void setCallchanel(Integer callchanel) {
    this.callchanel = callchanel;
  }

  /**
   * @return the problemtype
   */
  public Integer getProblemtype() {
    return problemtype;
  }

  /**
   * @param problemtype the problemtype to set
   */
  public void setProblemtype(Integer problemtype) {
    this.problemtype = problemtype;
  }

  /**
   * @return the force
   */
  public Integer getForce() {
    return force;
  }

  /**
   * @param force the force to set
   */
  public void setForce(Integer force) {
    this.force = force;
  }

  /**
   * @return the callsubmodule
   */
  public Integer getCallsubmodule() {
    return callsubmodule;
  }

  /**
   * @param callsubmodule the callsubmodule to set
   */
  public void setCallsubmodule(Integer callsubmodule) {
    this.callsubmodule = callsubmodule;
  }

  /**
   * @return the callmodule
   */
  public Integer getCallmodule() {
    return callmodule;
  }

  /**
   * @param callmodule the callmodule to set
   */
  public void setCallmodule(Integer callmodule) {
    this.callmodule = callmodule;
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