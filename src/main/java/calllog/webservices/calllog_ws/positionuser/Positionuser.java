package calllog.webservices.calllog_ws.positionuser;
import lombok.Data;

import java.text.DateFormat;
import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
public class Positionuser {
  @Id
 
  private String positionid;
  private String positiondesc;

  /**
   * @return the positiondesc
   */
  public String getPositiondesc() {
    return positiondesc;
  }

  /**
   * @param positiondesc the positiondesc to set
   */
  public void setPositiondesc(String positiondesc) {
    this.positiondesc = positiondesc;
  }

	}