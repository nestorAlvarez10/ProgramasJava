import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class Logo  extends JPanel 
{
	//private JButton Gps;
	
	public Logo()
	{
		
		
		
		Dimension dim = getPreferredSize();
		dim.height = 100;
		setPreferredSize(dim);
		
		Border innerBorder = BorderFactory.createTitledBorder("LOGO UABCS");			
		Border outerBorder = BorderFactory.createEmptyBorder(2,2,2,2);
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
		
		//Gps= new JButton("lOGO UABCS");
		
		//add(Gps);
		
	}
	
}
