import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;



public class Frame extends JFrame implements Runnable {
	public static Graphics g2;
	public int x,y;
	public Frame()
	{
		this.setSize(400,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Thread h = new Thread(this);
		
	}
	
	public void paint(Graphics g)
	{
		g.drawLine(50, 50, x, y);
	}
	
	public void run(){
		try{
			for(int p=50;p<=200;p+=1)
			{
				x=p;
				y=p;
				repaint();
				
			}
		}
	}
	
}
	



