package EjemplosBotones;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;

//formulario
public class FormPanel extends JPanel 
{
	private JLabel nameLabel;
	private JLabel occupationLabel;
	private JTextField nameField;//e
	private JTextField occupationField;
	private JButton okBtn;
	private FormListener formListener;
	private JList ageList;
	private JComboBox empCombo;
	private JRadioButton maleleRadio;
	private JRadioButton femaleRadio;
	private JRadioButton otherRadio;
	private ButtonGroup ganderGroup;
	private JCheckBox CbM, CbF;
	private ButtonGroup gaderCheckBox;
		
	public FormPanel()
	{
		Dimension dim=getPreferredSize();//obtiene el valor del panel,sobreescritura elementos
		dim.width=250;
		setPreferredSize(dim);
		
		
		///instancias
		nameLabel= new JLabel ("NOMBRE");
		occupationLabel=new JLabel("OCUPACION");
		nameField = new JTextField(10);
		occupationField=new JTextField(10);
		okBtn=new JButton("OK");
		empCombo=new JComboBox();
		ageList = new JList();
		
		
		maleleRadio=new JRadioButton("masculino");
		femaleRadio=new JRadioButton("femenino");
		otherRadio=new JRadioButton("otro");
		ganderGroup=new ButtonGroup();
		maleleRadio.setSelected(true);
		///checkbox////
		CbM= new JCheckBox("Mexicano");
		

		////agrupar el contenido////
		ganderGroup.add(maleleRadio);
		ganderGroup.add(femaleRadio);
		ganderGroup.add(otherRadio);
		
		DefaultListModel ageModel = new DefaultListModel();
		ageModel.addElement(new AgeCategory(0,"18 - 35"));
		ageModel.addElement(new AgeCategory(1,"36 - 45"));
		ageModel.addElement(new AgeCategory(2,"46 en adelante"));
		ageList.setModel(ageModel);
		
		
		/// la lista mas grande de tamaño
		ageList.setPreferredSize(new Dimension (110,70));
		ageList.setBorder(BorderFactory.createEtchedBorder());
		ageList.setSelectedIndex(0);
		
		DefaultComboBoxModel empModel = new DefaultComboBoxModel();
		empModel.addElement(new EmployeeCategory(0,"empleado"));
		empModel.addElement(new EmployeeCategory(1,"contrato"));
		empModel.addElement(new EmployeeCategory(2,"no es empleado"));
		empCombo.setModel(empModel);
		empCombo.setSelectedIndex(0);
		
		///botones
		okBtn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				
			String name=nameField.getText();
			String occupation = occupationField.getText();
			AgeCategory ageCat =(AgeCategory)ageList.getSelectedValue();
			EmployeeCategory empCat = (EmployeeCategory)empCombo.getSelectedItem();
			String gender= ganderGroup.getSelection().getActionCommand();

			////para que aparescan en consola///////
			
			System.out.println(name);	
			System.out.println(occupation);
			System.out.println(ageCat.getId());
			System.out.println(empCat.getId());	
			System.out.println(gender);
			
			String empleado=empCat.toString();
			int edad=ageCat.getId();
			////para qe aparescan en grafico///////
			FormEvent eve = new FormEvent(this, name, occupation, edad,empleado, gender);
				
				if(formListener != null)
				{
					formListener.FormEventOcurrend(eve);
				}
	
				}
		});
		
		Border innerBorder = BorderFactory.createTitledBorder("AGREGAR PERSONA");
		Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
		setBorder(BorderFactory.createCompoundBorder(outerBorder,innerBorder));
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		
		
		/////////////////// botones/////////////////////
		/////first row// NAME
		gc.weightx=1;
		gc.weighty=1;
		
		gc.gridx=0;
		gc.gridy=0;
		gc.fill=GridBagConstraints.NONE;
		gc.anchor=GridBagConstraints.LINE_END;
		gc.insets=new Insets(0,0,0,5);
		add(nameLabel,gc);
		
		gc.gridx=1;
		gc.gridy=0;
		gc.insets=new Insets (0,0,0,0);
		gc.anchor=GridBagConstraints.LINE_START;
		add(nameField,gc);
		
		////second row///// OCUPATION
		gc.weightx=1;
		gc.weighty=1;
		
		gc.gridx=0;
		gc.gridy=1;
		gc.insets=new Insets(0,0,0,5);
		gc.anchor=GridBagConstraints.LINE_END;
		add(occupationLabel,gc);
		
		gc.gridx=1;
		gc.gridy=1;
		gc.insets=new Insets(0,0,0,5);
		gc.anchor=GridBagConstraints.LINE_START;
		add(occupationField,gc);
		
		//////third row//// lista de edades
		
		gc.weightx=1;
		gc.weighty=1;
		
		gc.gridx=1;
		gc.gridy=2;
		gc.anchor=GridBagConstraints.FIRST_LINE_START;
		gc.insets=new Insets(0,0,0,0);
		add(ageList,gc);
	
		//////five row//// lista trabajas///
		
		gc.weightx=1;
		gc.weighty=1;
		
		gc.gridx=1;
		gc.gridy=3;
		gc.anchor=GridBagConstraints.FIRST_LINE_START;
		gc.insets=new Insets(0,0,0,0);
		add(empCombo,gc);
		
		//////////six raw///////RadioButton Male
		
		gc.weightx=1;
		gc.weighty=0.05;
				
		gc.gridy++;
		gc.gridx=1;
		gc.anchor=GridBagConstraints.FIRST_LINE_START;
		gc.insets=new Insets(0,0,0,0);
		add(maleleRadio,gc);
		
		//////////seven raw///////RadioButton Fale
		
		gc.weightx=1;
		gc.weighty=0.05;
		
		gc.gridy++;
		gc.gridx=1;
		gc.anchor=GridBagConstraints.FIRST_LINE_START;
		gc.insets=new Insets(0,0,0,0);
		add(femaleRadio,gc);
		
		//////////8 raw///////RadioButton other
		
		gc.weightx=1;
		gc.weighty=1;
		
		gc.gridy++;
		gc.gridx=1;
		gc.anchor=GridBagConstraints.FIRST_LINE_START;
		gc.insets=new Insets(0,0,0,0);
		add(otherRadio,gc);
		
		
		
		
		//////10 row// checkbox
		
		gc.weightx=1;
		gc.weighty=3;
		
		gc.gridy++;
		gc.gridx=1;
		gc.anchor=GridBagConstraints.FIRST_LINE_START;
		gc.insets=new Insets(0,0,0,0);
		add(CbM,gc);

		//////11 row// OK
		
		gc.weightx=1;
		gc.weighty=2.0;
		
		gc.gridy++;
		gc.gridx=1;
		gc.anchor=GridBagConstraints.FIRST_LINE_START;
		gc.insets=new Insets(0,0,0,0);
		add(okBtn,gc);

	}
	
	public void setFormListener (FormListener listener)
	{
		this.formListener=listener;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	////clase interna
	
	class AgeCategory
	{
		private int id;
		private String text;
		
		public AgeCategory(int id, String text) {
			this.id=id;
			this.text=text;
			
		}
		
		public String toString(){
			return text;
		}
		
		public int getId(){
			return id;
		}
	}
}



////////////clase interna/////////
class EmployeeCategory
{
	private int id;
	private String text;
	
	public EmployeeCategory(int id, String text) {
		this.id=id;
		this.text=text;
		
	}
	
	public String toString(){
		return text;
	}
	
	public int getId(){
		return id;
	}
}



