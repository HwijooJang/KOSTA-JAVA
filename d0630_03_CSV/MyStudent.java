package d0630_03_CSV;

import java.util.Objects;

import com.opencsv.bean.CsvBindByName;

public class MyStudent {

	@CsvBindByName
	private int id;
	@CsvBindByName
	private String name;
	@CsvBindByName
	private int year;
	@CsvBindByName
	private String address;
	@CsvBindByName
	private String department;

	public MyStudent() {
	}

	public MyStudent(int id, String name, int year, String address, String department) {
		this.id = id;
		this.name = name;
		this.year = year;
		this.address = address;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, department, id, name, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyStudent other = (MyStudent) obj;
		return Objects.equals(address, other.address) && Objects.equals(department, other.department) && id == other.id
				&& Objects.equals(name, other.name) && year == other.year;
	}

	@Override
	public String toString() {
		return "MyStudent [name=" + name + ", id=" + id + ", year=" + year + ", address=" + address + ", department="
				+ department + "]";
	}

}
