package calllog.webservices.calllog_ws.detail_editpage;

import lombok.Data;

import java.security.Timestamp;
import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
//import java.sql.Timestamp;

@Data
@Entity
@Table(name = "gfmis_calllog")
public class Detail_Editpage {
  @Id // บอกว่าจะใช้ ตัวแปรด้านล่างนี้เป็น PK
  // เป็น Auto Increment โดยจะรันเองแบบ Auto ตาม generator

  @GeneratedValue(strategy = GenerationType.AUTO, generator = "id_seqcalllog")
 // @NotNull
  private Integer callid;
  private String payunit;
  private String namecontact;
  private String telcontact;
  private String emailcontact;
  private String problem;
  private Integer force;
  private Integer problemtype;
  private String idopen;
  private String helpdeskowner;
  private String calllogin;
  private String callstatus;
  private String attach;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private java.util.Date calldate;
  private Integer callchanel;
  private Integer callmodule;
  private Integer callsubmodule;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private java.util.Date createdate;// = new Timestamp();

  public void setId(Object object) {
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
	}