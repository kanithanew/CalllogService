package calllog.webservices.calllog_ws.payunit;
import lombok.Data;

import java.text.DateFormat;
import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
public class Payunit {
  @Id
  private String payunit;
  private String payunit_name;
  private String department_name;
  private String ministry_name;
  private String province_name;

  /**
   * @return the payunit_name
   */
  public String getPayunit_name() {
    return payunit_name;
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
	}