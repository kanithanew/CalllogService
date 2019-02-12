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
  
	}