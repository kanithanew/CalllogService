package calllog.webservices.calllog_ws.problemtype;
import lombok.Data;

import java.text.DateFormat;
import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
public class Problemtype {
  @Id
 
  private String problemid;
  private String problemdesc;

  /**
   * @return the problemdesc
   */
  public String getProblemdesc() {
    return problemdesc;
  }

  /**
   * @param problemdesc the problemdesc to set
   */
  public void setProblemdesc(String problemdesc) {
    this.problemdesc = problemdesc;
  }
	}