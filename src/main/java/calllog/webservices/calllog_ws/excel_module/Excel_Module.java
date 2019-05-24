package calllog.webservices.calllog_ws.excel_module;

import lombok.Data;

import java.text.DateFormat;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Data
@Entity
public class Excel_Module {
	@Id
	private String row;
	private String callid;
	private String payunit;
	private String ministry_name;
	private String department_name;
	private String payunit_name;
	private String province_name;
	private String calldate;
	private String closedate;
	private String submodulename;
	private String modulename;
	private String problem;
	private String chaneldesc;
	private String callchanel;

	public String getCallid() {
		return callid;
	}

	public String getCallchanel() {
		return callchanel;
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

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public String getModulename() {
		return modulename;
	}

	public void setModulename(String modulename) {
		this.modulename = modulename;
	}

	public String getSubmodulename() {
		return submodulename;
	}

	public void setSubmodulename(String submodulename) {
		this.submodulename = submodulename;
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

	public String getProvince_name() {
		return province_name;
	}

	public void setProvince_name(String province_name) {
		this.province_name = province_name;
	}

	public String getPayunit_name() {
		return payunit_name;
	}

	public void setPayunit_name(String payunit_name) {
		this.payunit_name = payunit_name;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public String getMinistry_name() {
		return ministry_name;
	}

	public void setMinistry_name(String ministry_name) {
		this.ministry_name = ministry_name;
	}

	public String getPayunit() {
		return payunit;
	}

	public void setPayunit(String payunit) {
		this.payunit = payunit;
	}

	public void setCallid(String callid) {
		this.callid = callid;
	}
}