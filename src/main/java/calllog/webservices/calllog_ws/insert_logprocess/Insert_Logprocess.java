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


	}