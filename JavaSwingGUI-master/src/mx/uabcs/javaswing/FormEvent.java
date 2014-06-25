package mx.uabcs.javaswing;

import java.util.EventObject;
public class FormEvent extends EventObject{
	
	private String name;
	private String occupention;

	public FormEvent(Object source) {
		super(source);
		
	}
	
	public FormEvent(Object source,String name, String occupention){
		super(source);
		this.name=name;
		this.occupention=occupention;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getoccupention() {
		return occupention;
	}

	public void setoccupention(String occupention) {
		this.occupention = occupention;
	}

}
