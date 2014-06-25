package mx.uabcs.javaswing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class MainFrame extends JFrame {
	
	private JButton btn;
	private TextPanel textPanel;
	private Toolbar toolbar;
	private FormPanel FormPanel;
	private ArrayList<FormEvent>mylist;
	
	public MainFrame() {
		super("Hello World");
		
		setLayout(new BorderLayout());
		mylist= new ArrayList<FormEvent>();
		toolbar = new Toolbar();
		btn = new JButton("Click me");
		textPanel = new TextPanel();
		FormPanel = new FormPanel();
		
		
		//toolbar.setTextPanel(textPanel);
		toolbar.setArrayList(mylist);
		
		toolbar.setStringListener(new StringListener(){

			@Override
			public void textEmitted(String text) {
				// TODO Auto-generated method stub
				textPanel.appendText(text);
				
			}
		});
		
		
		toolbar.setFormArrayListener(new FormArrayListener(){

			@Override
			public void ArrayEmitted(ArrayList<FormEvent> lista) {
				// TODO Auto-generated method stub
				
				for(FormEvent fe: lista){
					
					System.out.println(fe.getName());
				}
				
			}
			
		});
		
		FormPanel.setFormListener(new FormListener(){

			@Override
			public void FormEventOcurred(FormEvent e) {
				mylist.add(e);
				//String name = e.getName();
				//String occupention =e.getoccupention();
				//textPanel.appendText(name +": "+occupention + "\n");
			}
			
		});
			
		
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPanel.appendText("hello\n");
			}
		});
		
		add(toolbar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		add(FormPanel,BorderLayout.WEST);
		
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
