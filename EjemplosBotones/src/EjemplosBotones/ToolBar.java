package EjemplosBotones;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;


public class ToolBar extends JPanel  implements ActionListener{
	private JButton helloButton;
	private JButton goodbyeButton;
	private JButton DesplegarButton;
	private StringListener textListener; 
	
	
	private FormArrayListener arrayListener;
	private ArrayList<FormEvent> myList;
	
	
	public ToolBar() {
		helloButton = new JButton("Hello");
		goodbyeButton = new JButton("Goodbye");
		DesplegarButton = new JButton("desplegar lista");
		
		helloButton.addActionListener(this);
		goodbyeButton.addActionListener(this);
		DesplegarButton.addActionListener(this);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(helloButton);
		add(goodbyeButton);
		add(DesplegarButton);
	}
	
	
	public void setFormArrayList(ArrayList<FormEvent> list)
	{
		this.myList=list;
	}
	public void setStringListener(StringListener listener){
		this.textListener=listener;
	}
	public void setFormArrayListener(FormArrayListener listener){
		this.arrayListener=listener;
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		JButton clicked=(JButton)evento.getSource();
		if(clicked == helloButton)
		{
			if(textListener!=null)
			{
			
			textListener.textEmitted("Hello\n");
			}
		}
		else if(clicked == goodbyeButton)
		{
			if(textListener!=null)
			{
				textListener.textEmitted("Good bye\n");
			}
		}
		
		else if(clicked == DesplegarButton)
		{
			if(textListener!=null){
				
			arrayListener.ArrayEmitted(this.myList);
			
			}
		
		}
	}
}
