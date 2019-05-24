package calllog.webservices.calllog_ws.excel_transaction;

import lombok.Data;

import java.text.DateFormat;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;


@Data
@Entity
public class Excel_Transaction {
  @Id
private String  row;
private String  callid;
private String  useridupdate;
 private String datetimesend;
 private String usernameupdate;
 private String logprocess;
 private String month;
 private String year;
 private String calldate;
  private String closedate;
  private String chaneldesc;
  private String callchanel;

  public String getCallchanel() {
    return callchanel;
  }

  public String getClosedate() {
	return closedate;
}

public void setClosedate(String closedate) {
	this.closedate = closedate;
}

public String getCalldate() {
    return calldate;
  }

  public void setCalldate(String calldate) {
    this.calldate = calldate;
  }

  public String getDatetimesend() {
	return datetimesend;
}
public void setDatetimesend(String datetimesend) {
	this.datetimesend = datetimesend;
}
public void setCallchanel(String callchanel) {
	this.callchanel = callchanel;
}
public String getChaneldesc() {
	return chaneldesc;
}
public void setChaneldesc(String chaneldesc) {
	this.chaneldesc = chaneldesc;
}
public String getYear() {
	return year;
}
public void setYear(String year) {
	this.year = year;
}
public String getMonth() {
	return month;
}
public void setMonth(String month) {
	this.month = month;
}
public String getLogprocess() {
	return logprocess;
}
public void setLogprocess(String logprocess) {
	this.logprocess = logprocess;
}
public String getUsernameupdate() {
	return usernameupdate;
}
public void setUsernameupdate(String usernameupdate) {
	this.usernameupdate = usernameupdate;
}
public String getUseridupdate() {
	return useridupdate;
}
public void setUseridupdate(String useridupdate) {
	this.useridupdate = useridupdate;
}
public String getCallid() {
	return callid;
}
public void setCallid(String callid) {
	this.callid = callid;
}
	}