package Calculadora2000;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

////


public class MainFrame extends JFrame {
	private TextPanel textPanel;
	private TollBar toolbar;

	public MainFrame() 
	{
		super("Calculadora 2000");		
		setLayout(new BorderLayout());
		
		
		toolbar = new TollBar();		
		textPanel = new TextPanel();	
		
		
		
		
		

		toolbar.setStringListener(new StringListener(){

			public void textEmitted(String text) {
				// TODO Auto-generated method stub
				//aqui se agrega el texto al panel :D
				textPanel.appendText(text);
				
				
			}			
		});				
		add(textPanel, BorderLayout.NORTH);		
		add(toolbar, BorderLayout.CENTER);	
		setLocation(300, 100);
		setSize(300,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		this.setResizable(false);
		

	}

}
