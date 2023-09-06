package com.pt.demo.beans;





import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "AzureEmployee")
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	@Column(name = "emp_id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empid;
	@Column(name = "emp_name")
	private String empName;
	@Column(name = "address")
	private String address;
	@Column(name = "phone_number")
	private long phonenumber;

}
