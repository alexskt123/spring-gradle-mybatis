package hk.org.test.entity;

public class Person {
	private Integer id;
	private String name;
	private String hkid;

	
	public String getName () {
		return this.name;
	}
	
	public Integer getID () {
		return this.id;
	}
	public String getHKID () {
		return this.hkid;
	}
	
	public void setName (String inputName) {
		this.name = inputName;
	}
	
	public void setID (Integer inputID) {
		this.id = inputID;
	}
	
	public void setHKID (String inputHKID) {
		this.hkid = inputHKID;
	}
}
