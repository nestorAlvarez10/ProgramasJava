import java.util.ArrayList;


public class Nodo {

	private int id;
	private String dato;
	private int lugar_id;
	private double x;
	private double y;
	
	
	public Nodo()
	{
		ligas = new ArrayList<Nodo>();
	}
	
	private ArrayList<Nodo> ligas;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getLugar_id() {
		return lugar_id;
	}

	public void setLugar_id(int lugar_id) {
		this.lugar_id = lugar_id;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public ArrayList<Nodo> getLigas() {
		return ligas;
	}

	public void setLigas(ArrayList<Nodo> ligas) {
		this.ligas = ligas;
	}
	//
	public void addLiga(Nodo n){
		ligas.add(n);
	}
	
	
	
	
}
