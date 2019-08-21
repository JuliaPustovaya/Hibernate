import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Entity;

@Entity
@Table(name = "myScheme.Employee")
public class Employee  implements Serializable{
	@Id
	@Column(name = "EMP_ID")
	@GeneratedValue
	private int emp_id;
	@Column(name = "EMP_NAME", length = 50)
	private String name;
	@Column(name = "EMP_AGE")
	private int age;

	public Employee() {
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"emp_id=" + emp_id +
				", name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}

