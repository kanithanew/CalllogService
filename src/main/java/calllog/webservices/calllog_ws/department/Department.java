package calllog.webservices.calllog_ws.department;

import lombok.Data;

import java.text.DateFormat;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
public class Department {
  @Id
  private String department_id;
  private String department_name;

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

}