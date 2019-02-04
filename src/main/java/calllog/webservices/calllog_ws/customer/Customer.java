package calllog.webservices.calllog_ws.customer;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "customers")
public class Customer {
    
    @Id//บอกว่าจะใช้ ตัวแปรด้านล่างนี้เป็น PK
    //เป็น Auto Increment โดยจะรันเองแบบ Auto ตาม generator

    @GeneratedValue(strategy = GenerationType.AUTO, generator="id_seq")
    @NotNull
    private int id;

    @NotNull
    @Size(min = 2, max = 50, message = "Please provide first size between 2 - 100")
    private String firstName;

    @NotNull
    @Size(min = 2, max = 100, message = "Please provide lastName size between 2 - 100")
    private String lastName;

    @NotNull
    @Min(value = 18, message = "Please provide age >18")
    private Integer age;

    @Email(message = "Please provide valid email address")
    private String email;

	public void setId(Object object) {
	}
}
