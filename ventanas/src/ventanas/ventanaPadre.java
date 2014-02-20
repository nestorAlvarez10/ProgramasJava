package ventanas;
import javax.swing.JButton;
import javax.swing.JFrame;
public class VentanaPadre extends JFrame
{
	private int altura=0;
	private int ancho=0;
	private String titulo=" ";
	JButton btn;
	
	public VentanaPadre(int ancho, int altura, String titulo)
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(ancho, altura);
		this.setTitle(titulo);
		btn = new JButton ("hola mundo");
		add(btn);
		this.setVisible(true);
		
	}
	
	public VentanaPadre()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btn = new JButton ("hola mundo");
		add(btn);
		
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


