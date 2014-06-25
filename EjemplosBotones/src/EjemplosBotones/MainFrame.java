package EjemplosBotones;

import java.awt.BorderLayout;

import javax.swing.JFrame;





import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class MainFrame extends JFrame 
{
	
	private JButton btn;
	private TextPanel textPanel;
	private ToolBar toolbar;
	private FormPanel formPanel;
	private JCheckBox cb1, cb2;
	private ArrayList<FormEvent> myList;
	
	
	
	
	
	////checkBox///////**************////
	
		/*public void CheckBox(){
		this.setLayout(null);
		add(cb1 = new JCheckBox("mujer",false) );
		cb1.setBounds(10,10,100,30);
		add(cb2 = new JCheckBox("hombre",false) );
		cb2.setBounds(10,50,100,30);
	}*/
	
	public MainFrame() {
		

		this.setTitle("CATALOGO");
		setSize(700, 600);
		this.setLocation(350, 50);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		setLayout(new BorderLayout());
		
		myList = new ArrayList<FormEvent>();
		toolbar = new ToolBar();
		btn = new JButton("Click me");
		textPanel = new TextPanel();
		formPanel =  new FormPanel();
		add(formPanel,BorderLayout.WEST);
		add(toolbar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);
	
		
		
		//toolbar///**********///
		toolbar.setFormArrayList(myList);
		toolbar.setStringListener(new StringListener(){
			@Override
			public void textEmitted(String text) {
				// TODO Auto-generated method stub
			textPanel.appendText(text);	
			}
		});
		                 //**************//
		toolbar.setFormArrayListener(new FormArrayListener(){
			@Override
			public void ArrayEmitted(ArrayList<FormEvent> Lista) {
				// TODO Auto-generated method stub
				for(FormEvent fe: Lista){
					System.out.println(fe.getName());
					System.out.println(fe.getOcupation());
					System.out.println(fe.getAgeCategory());
					System.out.println(fe.getEmpCategory());
					System.out.println(fe.getGender());
					textPanel.appendText(fe.getName()+"\n"+fe.getOcupation()+"\n"+fe.getAgeCategory()+"\n"+fe.getEmpCategory()+"\n"+fe.getGender());
				}
			}
		});
		
		
		/*//Formpanel para que se pinte con el OK
		formPanel.setFormListener(new FormListener(){

			@Override
			public void FormEventOcurrend(FormEvent e) {
				// TODO Auto-generated method stub
				//String name = e.getName();
				//String ocupation = e.getOcupation();
				//textPanel.appendText(name+":   "+ocupation+ "\n");
				//myList.add(e);
				
			}
			
		});
		
	
		
		///botones
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPanel.appendText("Hello\n");
			}
		});*/
		
		
	}
}
