package calllog.webservices.calllog_ws.province;

import lombok.Data;

import java.text.DateFormat;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
public class Province {
  @Id
  private String province_id;
  private String province_name;

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



}