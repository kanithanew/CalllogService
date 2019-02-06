package calllog.webservices.calllog_ws.detail_updatepage;

import lombok.Data;

import java.text.DateFormat;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


@Data
@Entity
@Table(name = "gfmis_calllog")
public class Detail_Updatepage {
  //@Id

  //private Integer callid;
  //private String payunit;
      
  @Id
  private Integer callid;
  private String payunit;
  private String namecontact;
  private String telcontact;
  private String emailcontact;
  private String problem;
  private Integer force;
  private Integer problemtype;
  private String idopen;
  private String helpdeskowner;
  private String calllogin;
  private String callstatus;
  private String attach;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private java.util.Date calldate;
  private Integer callchanel;
  private Integer callmodule;
  private Integer callsubmodule;
  @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
  private java.util.Date  cretaedate ;//=  new Timestamp();


  
  public Integer isCallid() {
    return callid;
}
public void setId(Integer callid) {
    this.callid = callid;
}
	}