package net.konic.corejava.emsproject;

import java.util.Objects;

public class Employee extends BasePerson implements Comparable<Employee>  {
	
	private String department;   // Encapsulation

    private static final String COMPANY_NAME = "Konic Technologies";

    // Constructor
    public Employee(int id, String name, String department) {
    	super(id, name);  
        this.department = department;
    }

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public static String getCompanyName() {
		return COMPANY_NAME;
	}

	@Override
	public int compareTo(Employee o) {
		if (this.id > o.id) {
	        return 1;
	    } else if (this.id < o.id) {
	        return -1;
	    } else {
	        return 0;
	    }
	}

	@Override
	public int hashCode() {
		return Objects.hash(department, id,name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
	return	
			this.id == other.id
				&& Objects.equals(this.name, other.name)
				&& Objects.equals(this.department, other.department);

	}

	@Override
	public String toString() {
		return "Employee [department=" + department + ", id=" + id + ", name=" + name + "]";
	}

	
}
