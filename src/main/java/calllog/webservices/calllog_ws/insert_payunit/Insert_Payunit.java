package calllog.webservices.calllog_ws.insert_payunit;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "gfmis_m_payunit")
public class Insert_Payunit {
  @Id
  private String payunit;
  private String ministry;
  private String province;
  private String department;
  private String payunit_name;
  private Integer status;

  public void setId(Object object) {
  }

  /**
   * @return the status
   */
  public Integer getStatus() {
    return status;
  }

  /**
   * @param status the status to set
   */
  public void setStatus(Integer status) {
    this.status = status;
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
   * @return the department
   */
  public String getDepartment() {
    return department;
  }

  /**
   * @param department the department to set
   */
  public void setDepartment(String department) {
    this.department = department;
  }

  /**
   * @return the province
   */
  public String getProvince() {
    return province;
  }

  /**
   * @param province the province to set
   */
  public void setProvince(String province) {
    this.province = province;
  }

  /**
   * @return the ministry
   */
  public String getMinistry() {
    return ministry;
  }

  /**
   * @param ministry the ministry to set
   */
  public void setMinistry(String ministry) {
    this.ministry = ministry;
  }
}