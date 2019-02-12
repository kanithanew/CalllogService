package calllog.webservices.calllog_ws.subcall;

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
@Table(name = "gfmis_subcall")
public class Subcall {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "id_subcall")
  private Integer subcallid;
  private Integer callid;
  private String updateproblem ;
  private String calllogin ;
  private String subcallstatus;
  private String subcallattach ;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private java.util.Date create_date; 
  private String callusername;
  
  public String callusername() {
    return null;
}
public void setcallusername(String callusername) {
    this.callusername = callusername;
}
	}