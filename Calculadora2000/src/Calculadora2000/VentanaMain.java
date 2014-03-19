package Calculadora2000;

import javax.swing.SwingUtilities;

public class VentanaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MainFrame();
			}
		});	
	}

}


	
