import java.util.ArrayList;


public class Nodo {
	private int id;
	private String dato;
	private int lugar_id;
	private double x,y;
	private ArrayList<Nodo> Ligas;
	private boolean visitado;
	
	public Nodo(){
		Ligas = new ArrayList<Nodo>();
		
	}
	
	public Nodo(int id, String dato, int lugar_id, double x, double y,
			ArrayList<Nodo> ligas) {
		
		this.id = id;
		this.dato = dato;
		this.lugar_id = lugar_id;
		this.x = x;
		this.y = y;
		Ligas = ligas;
	}
	
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
		return Ligas;
	}
	public void setLigas(ArrayList<Nodo> ligas) {
		Ligas = ligas;
	}
	
	public void addNodoLiga(Nodo n){
		Ligas.add(n);
	}
	

}
