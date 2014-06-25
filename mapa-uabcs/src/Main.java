
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Grafo mapa = new Grafo();
		
		Nodo n1= new Nodo();
		n1.setDato("Nodo 1");
		Nodo n11 = new Nodo();
		n11.setDato("Nodo 1.1");
		n1.addNodoLiga(n11);
		Nodo n2 = new Nodo();
		n2.setDato("Nodo 2");
		
		
		Nodo n21= new Nodo();
		
		
		mapa.dibujar();
		
		
		Liga link1 = new Liga( );
		
		link1.setOrigen(n1);
		link1.setOrigen(n11);
		link1.setPeso(1);
		
		Liga link2 = new Liga( );
		
		link2.setOrigen(n1);
		link2.setOrigen(n11);
		link2.setPeso(4);
		
		
		mapa.addLiga(link1);
		mapa.addLiga(link2);
		
	}

}
