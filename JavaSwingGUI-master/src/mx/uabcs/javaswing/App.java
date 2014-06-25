package mx.uabcs.javaswing;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MainFrame();
				
				ArrayList<Persona> lista = new ArrayList<Persona>();
				
				lista.add(new Persona(18,"PUYOL","ruiz"));
				lista.add(new Persona(18,"INIESTA","ruiz"));
				lista.add(new Persona(18,"PEDRO","ruiz"));
				lista.add(new Persona(18,"MESSI","ruiz"));
				lista.add(new Persona(18,"NEYMAR","ruiz"));
				
			/*for(int indice=0;indice<lista.size();indice++){
					System.out.println(lista.get(indice).getNombre());
			
				}*/
				
				//Iterator it = lista.iterator();//RECORRIDO DE UNA LISTA
				
				/*while(it.hasNext()){
					
					Persona p =((Persona)it.next());
					System.out.println(p.getNombre());
					
					System.out.println(((Persona)it.next()).getApellidos());
				}*/
				
				/*for(Persona p: lista){
					System.out.println(p.getNombre());
				}*/
				
				
		}
		});	
	}

}
