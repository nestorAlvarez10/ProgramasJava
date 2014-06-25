import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;





public class Main extends JFrame {
	
	private Logo toolbar;
	private TextPanel textPanel;
	private DatosUabcs datosUabcs;
	private FormPanel formpanel; 
	
	
	//textArea.setFont(new Font("ARIAL",Font.BOLD,20));
	
	public  Main()
	{
		super("                                                                                 ********GPS UABCS********");

		// logo
		
		Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/logouabcs.png"));
		setIconImage(icono);
		
		
		setLayout(new BorderLayout());
		
		toolbar = new Logo();
		textPanel = new TextPanel();		
		datosUabcs = new DatosUabcs();
		formpanel  = new FormPanel();
		
		add(toolbar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);
		add(datosUabcs, BorderLayout.SOUTH);
		add(formpanel,BorderLayout.WEST);
		
		setSize(900, 600);//tamano de la ventana
		setLocation(180,80);//posicionar ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);//poner la ventana
		this.setResizable(false);
		
	}
	
}
