package calllog.webservices.calllog_ws.force;
import lombok.Data;

import java.text.DateFormat;
import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
public class Force {
  @Id
 
  private String forceid;
  private String forcedesc;

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
	}