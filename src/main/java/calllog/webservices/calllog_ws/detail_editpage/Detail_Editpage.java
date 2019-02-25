package calllog.webservices.calllog_ws.detail_editpage;

import lombok.Data;

import java.security.Timestamp;
import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
//import java.sql.Timestamp;

@Data
@Entity
@Table(name = "gfmis_calllog")
public class Detail_Editpage {
  @Id // บอกว่าจะใช้ ตัวแปรด้านล่างนี้เป็น PK
  // เป็น Auto Increment โดยจะรันเองแบบ Auto ตาม generator

  @GeneratedValue(strategy = GenerationType.AUTO, generator = "id_seqcalllog")
 // @NotNull
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
  private java.util.Date  createdate ;//=  new Timestamp();
public void setId(Object object) {
}
	}