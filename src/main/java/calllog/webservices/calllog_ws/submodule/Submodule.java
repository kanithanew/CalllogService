package calllog.webservices.calllog_ws.submodule;
import lombok.Data;

import java.text.DateFormat;
import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
public class Submodule {
  @Id
 //submoduleid
  private String submoduleid;
  private String submodulename;

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
	}