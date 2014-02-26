package ventanas;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
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
		
		btn = new JButton ("hola mundo grafico");
		setLayout(new BorderLayout());
		add(btn, BorderLayout.NORTH);
		add(new JButton("sur"), BorderLayout.SOUTH);
		add(new TextPanel(), BorderLayout.CENTER);
		add(new JButton("este"), BorderLayout.EAST);
		add(new JButton("oeste"), BorderLayout.WEST);
		
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


