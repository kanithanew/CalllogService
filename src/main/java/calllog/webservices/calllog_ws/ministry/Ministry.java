package calllog.webservices.calllog_ws.ministry;

import lombok.Data;

import java.text.DateFormat;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
public class Ministry {
  @Id
  private String ministry_id;
  private String ministry_name;

  public void setId(Object object) {
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
}