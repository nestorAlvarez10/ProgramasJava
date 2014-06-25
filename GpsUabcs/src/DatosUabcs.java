import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class DatosUabcs extends JPanel  {
	
//private JButton Datosuabcs;
	
	public DatosUabcs()
	{
		Dimension dim = getPreferredSize();
		dim.height = 60;
		setPreferredSize(dim);
		
		Border innerBorder = BorderFactory.createTitledBorder("DATOS UABCS");			
		Border outerBorder = BorderFactory.createEmptyBorder(2,2,2,2);
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
		
		//Datosuabcs= new JButton("DATOS UABCS");
		//add(Datosuabcs);
		
	}

}
