package calllog.webservices.calllog_ws.detail_updatepage;

import lombok.Data;

import java.text.DateFormat;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Entity
@Table(name = "gfmis_calllog")
public class Detail_Updatepage {
  @Id
 //submoduleid
  private Integer callid;
  private String payunit;
	}