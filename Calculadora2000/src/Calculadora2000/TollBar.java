package Calculadora2000;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class TollBar extends JPanel implements ActionListener,Operaciones{

	private JButton num7,num8,num9,divi,num4,num5,num6,multi,num1,num2,num3,suma,resta,igual,punto,num0;		
	private StringListener textListener;	
	private String num="";		
	String arreglo[]= new String[15];
	private int i=0;	

	public TollBar() {
		num7 = new JButton("7");
		num8 = new JButton("8");
		num9 = new JButton("9");
		divi = new JButton("/");
		num4 = new JButton("4");
		num5 = new JButton("5");
		num6 = new JButton("6");
		multi = new JButton("*");
		num1 = new JButton("1");
		num2 = new JButton("2");
		num3 = new JButton("3");
		suma = new JButton("+");
		resta = new JButton("-");
		num0 = new JButton("0");
		punto = new JButton(".");
		igual = new JButton("=");

		setLayout(new FlowLayout(FlowLayout.LEFT));		
		setLayout(new GridLayout(4,4));

		num7.addActionListener(this);
		num8.addActionListener(this);
		num9.addActionListener(this);
		num4.addActionListener(this);
		num5.addActionListener(this);
		num6.addActionListener(this);	
		num1.addActionListener(this);
		num2.addActionListener(this);
		num3.addActionListener(this);
		resta.addActionListener(this);
		suma.addActionListener(this);
		divi.addActionListener(this);
		multi.addActionListener(this);
		punto.addActionListener(this);
		igual.addActionListener(this);
		num0.addActionListener(this);

		this.add(num7).setBackground(Color.blue);;
		this.add(num8).setBackground(Color.blue);;
		this.add(num9).setBackground(Color.blue);;
		this.add(divi).setBackground(Color.green);;
		this.add(num4).setBackground(Color.blue);;
		this.add(num5).setBackground(Color.blue);;
		this.add(num6).setBackground(Color.blue);;
		this.add(multi).setBackground(Color.green);;
		this.add(num1).setBackground(Color.blue);;
		this.add(num2).setBackground(Color.blue);;
		this.add(num3).setBackground(Color.blue);;
		this.add(suma).setBackground(Color.green);;
		this.add(num0).setBackground(Color.blue);;
		this.add(punto).setBackground(Color.blue);;
		
		this.add(igual).setBackground(Color.red);
		this.add(resta).setBackground(Color.green);;	
	}

	//recibe una interfaz como parametro
	public void setStringListener(StringListener Listener) {
		this.textListener = Listener;
	}	
	public void actionPerformed(ActionEvent e) {	

		//permite saber que boton se clickeo
		JButton clicked = (JButton)e.getSource();
		if(clicked == num7){				
			if(textListener != null){
				textListener.textEmitted("7");
				 num += ("7");
			}
		}
	    if(clicked == num8){			
			if(textListener != null){
				textListener.textEmitted("8");
				num += ("8");
			}
		}
	    if(clicked == num9){
	    	if(textListener != null){
	    		textListener.textEmitted("9");  
	    		num += ("9");
	    	}	
	    }
	    if(clicked == num4){
	    	if(textListener != null){
	    		textListener.textEmitted("4"); 
	    		num += ("4");
	    	}
	    }
	    if(clicked == num5){
	    	if(textListener != null){
	    		textListener.textEmitted("5");  
	    		num += ("5");
	    	}
	    }
	    if(clicked == num6){
	    	if(textListener != null){
	    		textListener.textEmitted("6");  
	    		num += ("6");
	    	}
	    }
	    if(clicked == num1){
	    	if(textListener != null){
	    		textListener.textEmitted("1"); 
	    		num += ("1");
	    	}
	    }
	    if(clicked == num2){
	    	if(textListener != null){
	    		textListener.textEmitted("2");  
	    		num += ("2");
	    	}
	    }
	    if(clicked == num3){
	    	if(textListener != null){
	    		textListener.textEmitted("3"); 
	    		num += ("3");
	    	}
	    }    	    
	    if(clicked == punto){
	    	if(textListener != null){
	    		textListener.textEmitted(".");    
	    		num += (".");
	    	}
	    }

	    if(clicked == multi){
	    	if(textListener != null){
	    		textListener.textEmitted("*");
	    		arreglo[i]=num;
		    	i++;
		    	arreglo[i]="*";	    	
		    	i++;
		    	num="";
	    	}
	    }
	    if(clicked == divi){
	    	if(textListener != null){
	    		textListener.textEmitted("/");
	    		arreglo[i]=num;
		    	i++;
		    	arreglo[i]="/";	    	
		    	i++;
		    	num="";
	    	}
	    }
	    if(clicked == suma){
	    	if(textListener != null){
	    		textListener.textEmitted("+");
	    		arreglo[i]=num;
		    	i++;
		    	arreglo[i]="+";	    	
		    	i++;
		    	num="";
	    	}
	    }
	    if(clicked == resta){
	    	if(textListener != null){
	    		textListener.textEmitted("-"); 
	    		arreglo[i]=num;
		    	i++;
		    	arreglo[i]="-";	    	
		    	i++;
		    	num="";
	    	}
	    }
	    if(clicked == num0){
	    	if(textListener != null){
	    		textListener.textEmitted("0");  
	    		num += ("0");
	    	}
	    }	    
	    if(clicked == igual){
	    	arreglo[i]=num;
	    	String operador;	
	    	int resultado=0;

	    	i=0;
	    	while(i<arreglo.length){		    	
		    	double num1=0.0;
		    	double num2=0.0;
			    //revela la posicion del operador en el arreglo			    	
	    		int i2=1;
	    		int iPor=0,iDiv=0,iMas=0,iMenos=0;		    	

	    		while(iPor<arreglo.length && arreglo[iPor]!="*")
	    			iPor++;
	    		while(iDiv<arreglo.length && arreglo[iDiv]!="/")
	    			iDiv++;
	    		while(iMas<arreglo.length && arreglo[iMas]!="+")
	    			iMas++;
	    		while(iMenos<arreglo.length && arreglo[iMenos]!="-")
	    			iMenos++;

	    		if(iPor<iDiv){
	    			i=iPor;
	    			operador="*";
	    		}
	    		else
	    			if(iPor>iDiv){
	    				i=iDiv;
	    				operador="/";
	    			}
	    			else
	    				if(iMas<iMenos){
	    					i=iMas;
	    					operador="+";
	    				}
	    				else{
	    					i=iMenos;
	    					operador="-";
	    				}	    		
	    		if(i<arreglo.length)
			    	while(arreglo[i+i2]==null){
			    		i2++;
			    	}	   	

		    	//si i < al tamaño del arreglo quiere dedir que encontro un operador
		    	if(i<arreglo.length && i!=0 ){
		    		//segun sea al caso del operaodor entra
		    		
		    		int entrada=0;
		    		
		    		if(arreglo[i]=="*")
		    			entrada +=1;
		    		if(arreglo[i]=="/")
		    			entrada+=2;
		    		if(arreglo[i]=="+")
		    			entrada +=3;
		    		if(arreglo[i]=="-")
		    			entrada+=4;
		    		
		    		switch(entrada)
		    		{
		    			case 1:						
		    				num1=Double.parseDouble(arreglo[i-1]); 			 
							num2=Double.parseDouble(arreglo[i+i2]); 
							arreglo[i-1]=null;
							arreglo[i+i2]=null;
							arreglo[i]=null;
							arreglo[i+i2]=String.valueOf(multiplicacion(num1, num2));
							iPor=0;	
							resultado=i+i2;
							break;
		    			case 2:	  				
		    				num1=Double.parseDouble(arreglo[i-1]);
							num2=Double.parseDouble(arreglo[i+i2]); 
							arreglo[i-1]=null;
							arreglo[i+i2]=null;
							arreglo[i]=null;
							arreglo[i+i2]=String.valueOf(division(num1, num2));							
							iDiv=0;
							resultado=i+i2;
							break;
		    			case 3:

		    				num1=Double.parseDouble(arreglo[i-1]);	    				
							num2=Double.parseDouble(arreglo[i+i2]); 

							arreglo[i-1]=null;
							arreglo[i+i2]=null;
							arreglo[i]=null;
							arreglo[i+i2]=String.valueOf(suma(num1, num2));	

							iMas=0;
							resultado=i+i2;
							break;
		    			case 4:

		    				num1=Double.parseDouble(arreglo[i-1]);		    				
							num2=Double.parseDouble(arreglo[i+i2]); 

							arreglo[i-1]=null;
							arreglo[i+i2]=null;
							arreglo[i]=null;
							arreglo[i+i2]=String.valueOf(resta(num1, num2));								
							iMenos=0;					
							resultado=i+i2;
							break;
		    		}		    		
		    	}
	    	}	
	    	if(textListener != null){
	    		textListener.textEmitted("\n = ");
	    		textListener.textEmitted(arreglo[resultado]);  
	    	}
	  	 }	    
	}
	
	
	@Override
	public double suma(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}

	@Override
	public double resta(double num1, double num2) {
		// TODO Auto-generated method stub
		return  num1-num2;
	}

	@Override
	public double multiplicacion(double num1, double num2) {
		// TODO Auto-generated method stub
		return  num1*num2;
	}

	@Override
	public double division(double num1, double num2) {
		// TODO Auto-generated method stub
		return  num1/num2;
	}

	

}