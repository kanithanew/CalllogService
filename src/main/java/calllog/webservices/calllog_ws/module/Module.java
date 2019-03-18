package calllog.webservices.calllog_ws.module;
import lombok.Data;

import java.text.DateFormat;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
public class Module {
  @Id
 
  private String moduleid;
  private String modulename;

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
	}