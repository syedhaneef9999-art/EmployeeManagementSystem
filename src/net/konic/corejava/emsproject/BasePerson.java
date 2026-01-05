package net.konic.corejava.emsproject;

public class BasePerson {

	// protected → accessible in child class (Employee)
    protected int id;
    protected String name;
	
    
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "BasePerson [id=" + id + ", name=" + name + "]";
	}
	
}
