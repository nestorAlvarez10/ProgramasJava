package Calculadora2000;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextPanel extends JPanel {
	
	private JTextArea textArea;


	public TextPanel() {
		textArea = new JTextArea(2,2);		
		setLayout(new BorderLayout());	


		textArea.setFont(new Font("ARIAL",Font.CENTER_BASELINE,30));
		textArea.setBackground(Color.LIGHT_GRAY);
		
		add(new JScrollPane(textArea), BorderLayout.CENTER);
	}

	public void appendText(String text) {
		textArea.append(text);
		
	}

}