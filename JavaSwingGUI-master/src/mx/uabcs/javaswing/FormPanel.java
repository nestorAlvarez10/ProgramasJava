package mx.uabcs.javaswing;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class FormPanel extends JPanel {
	
	private JLabel nameLabel;
	private JLabel occupationLabel;
	private JTextField nameField;
	private JTextField occupentionField;
	private JButton okBtn;
	
	
	
	
	private FormListener formListener;
	
	public FormPanel(){
		Dimension dim = getPreferredSize();
		dim.width=250;
		setPreferredSize(dim);
		
		nameLabel= new JLabel("Nombre: ");
		occupationLabel= new JLabel("Ocupacion: ");
		nameField = new JTextField(10);
		occupentionField = new JTextField(10);
		
		
		okBtn= new JButton("OK");
		okBtn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = nameField.getText();
				String occupation = occupentionField.getText();
				
				FormEvent ev = new FormEvent(this,name,occupation);
				if(formListener !=null){
					formListener.FormEventOcurred(ev);
				}
			
				
			}
			
		});
		
		
		
		Border innerBorder = BorderFactory.createTitledBorder("Agregar Persona");
		Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
		setBorder(BorderFactory.createCompoundBorder(outerBorder,innerBorder));
		
		setLayout(new GridBagLayout());//investigar
		
		
		GridBagConstraints gc = new GridBagConstraints();
		
		/////////// first row ////////////////////
		
		
		gc.weightx = 1;
		gc.weighty = 0.1;
		
		gc.gridx=0;
		gc.gridy=0;
		gc.fill=GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0,0,0,5);
		add(nameLabel,gc);
		
		gc.gridx=1;
		gc.gridy=0;
		gc.insets = new Insets (0,0,0,0);
		gc.anchor =  GridBagConstraints.LINE_START;
		add(nameField,gc);
		
		//// seconds row////////
		
		gc.weightx=1;
		gc.weighty=0.1;
		
		
		gc.gridy=1;
		gc.gridx=0;
		gc.insets = new Insets(0,0,0,5);
		gc.anchor= GridBagConstraints.LINE_END;
		add(occupationLabel,gc);
		
		gc.gridy=1;
		gc.gridx=1;
		gc.insets = new Insets(0,0,0,5);
		gc.anchor= GridBagConstraints.LINE_START;
		add(occupentionField,gc);
		
		
		/// third row//////
		
		gc.weightx=1;
		gc.weighty=2.0;
		
		
		gc.gridy=2;
		gc.gridx=1;
		gc.anchor= GridBagConstraints.FIRST_LINE_START;
		gc.insets = new Insets(0,0,0,0);
		add(okBtn,gc);
		
	}
	
	public void setFormListener(FormListener listener){
		
		this.formListener= listener;
	}

}
