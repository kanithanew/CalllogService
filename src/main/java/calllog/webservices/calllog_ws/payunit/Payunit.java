package calllog.webservices.calllog_ws.payunit;

import lombok.Data;

import java.text.DateFormat;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
public class Payunit {
  @Id
  private String payunit;
  private String payunit_name;
  private String department_id;
  private String department_name;
  private String ministry_id;
  private String ministry_name;
  private String province_id;
  private String province_name;

  /**
   * @return the payunit_name
   */
  public String getPayunit_name() {
    return payunit_name;
  }

  /**
   * @return the province_id
   */
  public String getProvince_id() {
    return province_id;
  }

  /**
   * @param province_id the province_id to set
   */
  public void setProvince_id(String province_id) {
    this.province_id = province_id;
  }

  /**
   * @return the ministry_id
   */
  public String getMinistry_id() {
    return ministry_id;
  }

  /**
   * @param ministry_id the ministry_id to set
   */
  public void setMinistry_id(String ministry_id) {
    this.ministry_id = ministry_id;
  }

  /**
   * @return the department_id
   */
  public String getDepartment_id() {
    return department_id;
  }

  /**
   * @param department_id the department_id to set
   */
  public void setDepartment_id(String department_id) {
    this.department_id = department_id;
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
   * @param payunit_name the payunit_name to set
   */
  public void setPayunit_name(String payunit_name) {
    this.payunit_name = payunit_name;
  }

  public void setId(Object object) {
  }
}