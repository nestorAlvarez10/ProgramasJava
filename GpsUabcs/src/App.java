import javax.swing.SwingUtilities;


public class App 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() 
			{
				new Main();
				
				Grafo mapa = new Grafo();
				
				Nodo n1 = new Nodo();
				n1.setDato("Nodo 1");
				Nodo n11 = new Nodo();
				n11.setDato("Nodo 1.1");
				n1.addLiga(n11);
				
				Nodo n2 = new Nodo();
				n2.setDato("Nodo 2");
				
				Nodo n21 = new Nodo();
				n21.setDato("Nodo 2.1");
				
				Nodo n22 = new Nodo();
				n22.setDato("Nodo 2.2");
				

				
				n2.addLiga(n21);
				n2.addLiga(n22);
				
				n22.addLiga(n11);
				
				mapa.add(n1);
				mapa.add(n2);
				mapa.dibujar();
				
			}
		});	
	}

}
