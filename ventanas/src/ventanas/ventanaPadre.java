package ventanas;
import javax.swing.JFrame;
public class ventanaPadre extends JFrame
{
	private int altura=0;
	private int ancho=0;
	private String titulo=" ";
	
	public void ventanaNew(int ancho, int altura, String titulo)
	{
		this.setSize(ancho, altura);
		this.setTitle(titulo);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void ventanaNew()
	{
		this.setSize(ancho, altura);
		this.setTitle(titulo);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void setAltura(int altura)
	{
		this.altura=altura;
	}
	public void setAncho(int ancho)
	{
		this.ancho=ancho;
	}
	public void setTitulo(String titulo)
	{
		this.titulo=titulo;
	}
	
	public void mostrar()
	{
		this.setSize(this.altura, this.ancho);
		this.setTitle(this.titulo);
		this.setVisible(true);
	}
	
}


