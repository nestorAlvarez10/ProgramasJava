import java.util.EventObject;

public class FormEvent extends EventObject {//evento que va a suceder dentro del formulario

	private String name;
	private String occupation;
	private String ageCategory; 
	private int tipo_empleado;
	private String genero;
	private int nacion_id;//pais
	private int edad;
	private int id;
	
	
	public FormEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
		
	}
	public FormEvent(Object source,String name, String occupation,String ageCategory,int employeeCategory,String genero ,int nacion,int edad  )
	{
		super(source);
		
		this.name=name;
		this.occupation=occupation;
		this.ageCategory=ageCategory;
		this.tipo_empleado=tipo_empleado;
		this.genero=genero;
		this.nacion_id=nacion;
		this.edad=edad;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getAgeCategory() {
		return ageCategory;
	}
	public void setAgeCategory(String ageCategory) {
		this.ageCategory = ageCategory;
	}
	public int getTipo_empleado() {
		return tipo_empleado;
	}
	public void setTipo_empleado(int tipo_empleado) {
		this.tipo_empleado = tipo_empleado;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getNacion_id() {
		return nacion_id;
	}
	public void setNacion_id(int nacion_id) {
		this.nacion_id = nacion_id;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;

	}
}
	