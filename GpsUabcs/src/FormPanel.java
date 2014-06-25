import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class FormPanel extends JPanel 
{

	public FormPanel()
	{
		Dimension dim=getPreferredSize();
		dim.width = 300;
		setPreferredSize(dim);
		
		Border innerBorder = BorderFactory.createTitledBorder("Gps Ubicacion");			
		Border outerBorder = BorderFactory.createEmptyBorder(8,8,8,8);
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
		
		
		
	}
	
}
