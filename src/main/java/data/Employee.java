package data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee implements Serializable {
	private static final long serialVersionUID = 6832006422622219737L;
	@Id
	@GeneratedValue
	@Column(name = "EMP_ID", nullable = false, unique = true)
	private long emp_id;

	@Column(name = "NAME")
	private String name;

	public Employee() {
	}

	@Override
	public String toString() {
		return "data.Employee{" +
				"emp_id=" + emp_id +
				", name='" + name + '\'' +
				'}';
	}

	public long getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(long emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
