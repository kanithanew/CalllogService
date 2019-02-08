package calllog.webservices.calllog_ws.subcall;

import lombok.Data;

import java.text.DateFormat;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;


@Data
@Entity
public class Subcall {
  @Id
  private Integer subcallid;
  private Integer callid;
  private String updateproblem ;
  private String calllogin ;
  private String subcallstatus;
  private String subcallattach ;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private java.util.Date create_date; 
	}