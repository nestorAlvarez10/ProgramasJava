package EjemplosBotones;

import java.util.EventObject;

public class FormEvent extends EventObject {

	private String name;
	private String ocupation;
	private int ageCategory;
	private String empCategory;
	private String gender;
	
	public FormEvent(Object source) {
		super(source);
		
	}
	
	public FormEvent(Object source, String name, String ocupation, int ageCategory, String empCategoy, String gander) {
		super(source);
		this.name=name;
		this.ocupation=ocupation;
		this.ageCategory=ageCategory;
		this.empCategory=empCategoy;
		this.gender=gander;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOcupation() {
		return ocupation;
	}

	public void setOcupation(String ocupation) {
		this.ocupation = ocupation;
	}

	public int getAgeCategory() {
		return ageCategory;
	}

	public void setAgeCategory(int ageCategory) {
		this.ageCategory = ageCategory;
	}

	public String getEmpCategory() {
		return empCategory;
	}

	public void setEmpCategory(String empCategory) {
		this.empCategory = empCategory;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	
	
	
	
	

}
