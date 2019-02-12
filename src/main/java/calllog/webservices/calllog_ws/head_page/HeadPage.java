package calllog.webservices.calllog_ws.head_page;

import lombok.Data;

import java.text.DateFormat;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;


@Data
@Entity
public class HeadPage {
  @Id
  private Integer callid;
  private String repperson;
  private String payunit;
  private String payunit_name;
  private String department_name;
  private String ministry_name;
  private String province_name;
  private String namecontact;
  private String telcontact;
  private String emailcontact;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private java.util.Date calldate;
  private String modulename;
  private String submodulename;
  private String forcedesc;
  private String problemdesc;
  private String problem;
  private String attach;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private java.util.Date closedate;
  private String repname;
  
	}