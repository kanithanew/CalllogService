package calllog.webservices.calllog_ws.submodule;
import lombok.Data;

import java.text.DateFormat;
import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
public class Submodule {
  @Id
 //submoduleid
  private String submoduleid;
  private String submodulename;
	}