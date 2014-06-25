import java.util.ArrayList;


public class Grafo {

	ArrayList<Liga> ligas;
	Nodo n;
	
	
	public Grafo()
	{
		ligas= new ArrayList<Liga>();
	}

	
	public void addLiga(Liga n){
		ligas.add(n);
	}
	
	public void dibujar(){
		for(Liga l:ligas){
			dibujarLiga(l);
			if(l.getOrigen() != null)
			{
				if(l.getOrigen().getDato() == "2"){
					n = l.getOrigen();
				}
				
			}
			if(l.getDestino() != null)
			{
				
			}
		}
	}
	public void dibujarLiga(Liga l){
		if(n.getLigas().size()>0){
			for(Nodo n2: n.getLigas()){
				dibujarLiga(n2);
			}
			System.out.println(n.getDato());
		}
	}
}
