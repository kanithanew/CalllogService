package calllog.webservices.calllog_ws.reportcall;

import lombok.Data;

import java.text.DateFormat;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;


@Data
@Entity
public class ReportCall {
  @Id
  private String  namecontact;
  private String payunit_name;
  private String callid;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private java.util.Date calldate;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private java.util.Date  datetimesend;
  private String modulename;
  private String submodulename;
  private String problem;
  private String createname;
  private String forcedesc;
  private String chaneldesc;
  private String statuscall;
  private String repname;
	}