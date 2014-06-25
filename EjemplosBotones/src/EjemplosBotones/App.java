package EjemplosBotones;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {
		DatabaseLayer dbl = new DatabaseLayer();
		/*if(dbl.isConnnected()){
			String sql = "inser into trabajador"+
					"(tipo_empleado, nombre,ocupacion,edad,genero,pais)"+
					"values ('fijo','Kalel Kent','Quality','21','masculino','Kripton')";
			//dbl.queryEcex(sql);
			ResultSet rs= dbl.resultQueryExec("select * from trabajador");
			
			
			
				
		
				
			
				
			}
		
		*/
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MainFrame();
				
				
				
				
			}
			
		});	
	}

}
