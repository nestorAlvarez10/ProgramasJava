import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Panel extends JPanel 
{
	private JTextArea textArea;
	private JButton suma;
	
	public Panel ()
	{
		setLayout (new BorderLayout());
		suma=new JButton("Presione Aqui");
		suma.addActionListener(new ActionListener()
		{
			

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}	
		});
		
		textArea=new JTextArea();
		add(suma,BorderLayout.SOUTH);
		add(new JScrollPane(textArea),BorderLayout.CENTER);
	}
	

}