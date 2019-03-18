package calllog.webservices.calllog_ws.insert_logprocess;

import lombok.Data;

import java.text.DateFormat;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


@Data
@Entity
@Table(name = "gfmis_logprocess")
public class Insert_Logprocess {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "id_logprocess")
  private Integer idlogprocess;
  private Integer callid;
  private String logprocess;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private java.util.Date datetimesend;
  private String fromuser;
  private String touser;

  /**
   * @return the callid
   */
  public Integer getCallid() {
    return callid;
  }

  /**
   * @return the touser
   */
  public String getTouser() {
    return touser;
  }

  /**
   * @param touser the touser to set
   */
  public void setTouser(String touser) {
    this.touser = touser;
  }

  /**
   * @return the fromuser
   */
  public String getFromuser() {
    return fromuser;
  }

  /**
   * @param fromuser the fromuser to set
   */
  public void setFromuser(String fromuser) {
    this.fromuser = fromuser;
  }

  /**
   * @return the logprocess
   */
  public String getLogprocess() {
    return logprocess;
  }

  /**
   * @param logprocess the logprocess to set
   */
  public void setLogprocess(String logprocess) {
    this.logprocess = logprocess;
  }

  /**
   * @param callid the callid to set
   */
  public void setCallid(Integer callid) {
    this.callid = callid;
  }


	}