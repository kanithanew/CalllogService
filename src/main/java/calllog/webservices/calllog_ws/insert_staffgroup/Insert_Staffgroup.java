package calllog.webservices.calllog_ws.insert_staffgroup;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "gfmis_staffgroup")
public class Insert_Staffgroup {
@Id
  private int modulecode;
  private String calllogin;

  /**
   * @return the calllogin
   */
  public String getCalllogin() {
    return calllogin;
  }

  /**
   * @param calllogin the calllogin to set
   */
  public void setCalllogin(String calllogin) {
    this.calllogin = calllogin;
  }


}