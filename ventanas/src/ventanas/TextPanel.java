package ventanas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextPanel extends JPanel
{
	private JTextArea TextArea;
	private JButton btn;
	
	public TextPanel()
	{
		setLayout(new BorderLayout());
		btn = new JButton("click");
		TextArea=new JTextArea();
		btn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			TextArea.append("hola mundo\n");
			}
			
		});
		
		add(btn, BorderLayout.SOUTH);
		add(new JScrollPane(TextArea), BorderLayout.CENTER);
		
		
	}
}
