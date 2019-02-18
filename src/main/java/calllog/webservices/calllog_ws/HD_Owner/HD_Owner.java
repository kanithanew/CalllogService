package calllog.webservices.calllog_ws.HD_Owner;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class HD_Owner {
  @Id
  private String helpdeskowner;
}