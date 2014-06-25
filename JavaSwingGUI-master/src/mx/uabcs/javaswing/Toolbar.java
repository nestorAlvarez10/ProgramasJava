package mx.uabcs.javaswing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;


public class Toolbar extends JPanel implements ActionListener {
	private JButton siete;
	private JButton ocho;
	private JButton desplegar;
	//private TextPanel textPanel;
	
	private StringListener textListener;
	private FormArrayListener arrayListener;
	private ArrayList<FormEvent>mylist;
	
	
	
	
	
	public Toolbar() {
		siete = new JButton("HELLO");
		ocho = new JButton("GOODBYE");
		desplegar= new JButton("DESPLEGAR");
		
		siete.addActionListener(this);
		ocho.addActionListener(this);
		desplegar.addActionListener(this);
		
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(siete);
		add(ocho);
		add(desplegar);
	}
	/*public void setTextPanel(TextPanel textPanel)
	{
		this.textPanel= textPanel;
	}*/
	
	public void setArrayList(ArrayList<FormEvent> list){
		this.mylist=list;
	}
	
	public void setStringListener(StringListener listener){
		this.textListener= listener;
	}
	public void setFormArrayListener(FormArrayListener listener){
		this.arrayListener=listener;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton clicked = (JButton) e.getSource();// accion de conversion
	
		if(clicked == siete){
		//textPanel.appendText("Hello\n");
			if(textListener!= null){
				textListener.textEmitted("HELLO\n");// lo que pasamos a la caja de texto
			}
		
		}else if(clicked == ocho){
			//textPanel.appendText("goodbye\n");
			if(textListener!=null){
				textListener.textEmitted("GOODBYE\n");
			}
			else if(clicked==desplegar){
				if(arrayListener!=null){
					arrayListener.ArrayEmitted(this.mylist);
					
				}
			}
		}
	}
}
