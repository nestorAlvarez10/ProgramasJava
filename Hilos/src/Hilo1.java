import java.awt.Graphics;


public class Hilo1 extends Thread {
	
	Graphics g;
	
	
	public Hilo1(Graphics g){
		this.g = g;
		this.start();
	}

	
	public void run()
	{
		this.paint();
	}
	
	
	public void paint(){
		
	}
}
