package calllog.webservices.calllog_ws.transcall;

import lombok.Data;

import java.text.DateFormat;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;


@Data
@Entity
public class TransCall {
  @Id
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private java.util.Date  datetimesend;
  private String namerecord;
  private String logprocess;
  private String repname;

  /**
   * @return the namerecord
   */
  public String getNamerecord() {
    return namerecord;
  }

  /**
   * @return the repname
   */
  public String getRepname() {
    return repname;
  }

  /**
   * @param repname the repname to set
   */
  public void setRepname(String repname) {
    this.repname = repname;
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
   * @param namerecord the namerecord to set
   */
  public void setNamerecord(String namerecord) {
    this.namerecord = namerecord;
  }
  
	}