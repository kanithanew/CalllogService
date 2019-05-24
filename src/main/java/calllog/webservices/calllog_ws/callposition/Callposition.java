package calllog.webservices.calllog_ws.callposition;

import lombok.Data;

import java.text.DateFormat;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
public class Callposition {
  @Id
  private String callpositionid;
  private String callpositiondesc;

  /**
   * @return the callpositiondesc
   */
  public String getCallpositiondesc() {
    return callpositiondesc;
  }

  /**
   * @param callpositiondesc the callpositiondesc to set
   */
  public void setCallpositiondesc(String callpositiondesc) {
    this.callpositiondesc = callpositiondesc;
  }

  
}