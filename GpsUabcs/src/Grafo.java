import java.util.ArrayList;


public class Grafo {

	ArrayList<Nodo> ligas; 
	
	
	public Grafo (){
		ligas = new ArrayList<Nodo>();
	}
	
	public void add(Nodo n){
		ligas.add(n);
	}
	
	
	public void dibujar()
	{
		for(Nodo n:ligas ){
			//System.out.println(n.getDato());
			dibujarNodo(n);
		}
	}
	
	public void dibujarNodo(Nodo n){
		if(n.getLigas().size() > 0)
		{
			for(Nodo n2: n.getLigas()){
				dibujarNodo(n2);
			}
		}
		System.out.println(n.getDato());
	}
	
}
