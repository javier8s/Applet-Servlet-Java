package Practica2;
import javax.swing.*;
import java.applet.Applet; 
import java.awt.*;
import java.awt.event.*;	
import java.applet.*;
public class Practica2_Applet extends Applet   {
	
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	    TextField textField1, textField2,textField3,textField4,textField5;
	    Button swapEm;
	    private JPanel panel1 = new JPanel();
	    private JPanel panel4= new JPanel();
	    private JPanel panel3= new JPanel();
	    private JPanel panel2 = new JPanel();
	    private Color Color1= new Color(190,238,247);
	    private Color Color2= new Color(111,194,208);
	    private Color Color3= new Color(69,146,175);
	    private Color Color4= new Color(255,130,70);
	    private Font fuente1=new Font("Times New Roman", Font.BOLD + Font.ITALIC, 25);
	    
	    private JLabel etiqueta1= new JLabel("Bienvenido :");
	    private JLabel etiqueta2 = new JLabel("Introduce los valores para el calculo del MCM o MCD : ");
	    private JLabel etiqueta3 = new JLabel("Introduce los valores para el calculo del area de un triangulo : ");
	    private JLabel etiqueta4 = new JLabel("Esperando a su elección . ");
	    
	public void init() {
		
		this.setLayout(new BorderLayout());
		Button buttonMCM= new Button("MCM");
		Button triangulo= new Button("Area");
		Button buttonMDM= new Button("MDM");
		
		
		buttonMDM.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
        		Metodos metodo = new Metodos();
        		String A = textField1.getText();
        		String B = textField2.getText();
        		String t = metodo.ejercicio1_a(Integer.parseInt(A), Integer.parseInt(B), 1);
        		
        		etiqueta4.setText(t);
                
             }
         }); 
		triangulo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
        		Metodos metodo = new Metodos();
        		String A = textField3.getText();
        		String B = textField4.getText();
        		String C = textField4.getText();
        		String t = metodo.ejercicio1_b(Integer.parseInt(A), Integer.parseInt(B), Integer.parseInt(C));
        		
        		etiqueta4.setText(t);
                
             }
         });
		buttonMCM.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
        		Metodos metodo = new Metodos();
        		String A = textField1.getText();
        		String B = textField2.getText();
        		String t = metodo.ejercicio1_a(Integer.parseInt(A), Integer.parseInt(B), 2);
        		
        		etiqueta4.setText(t);
                
             }
         }); 
		buttonMDM.setBackground(Color4);
		buttonMCM.setBackground(Color4);
		triangulo.setBackground(Color4);
		
		    panel1.setBackground(Color3);
		    panel4.setBackground(Color4);
		    panel2.setBackground(Color2);
		    panel3.setBackground(Color1);
		    setSize(1000, 1000);
		    panel1.setSize(10,100);
		    panel1.setPreferredSize(new Dimension(10,100));
		    panel2.setPreferredSize(new Dimension(40,300));
		    panel3.setPreferredSize(new Dimension(350,350));
		    panel4.setPreferredSize(new Dimension(750,100));

			textField1 = new TextField("150");
			textField2 = new TextField("60");
			
			textField4 = new TextField("3");
			textField3 = new TextField("2");
			textField5 = new TextField("2");
			
			this.add(panel1,BorderLayout.NORTH);
		    this.add(panel3,BorderLayout.CENTER);
		    this.add(panel2,BorderLayout.WEST);
		    this.add(panel4,BorderLayout.SOUTH);
		    
		    
		    GridBagConstraints gb = new GridBagConstraints();
	
		    panel2.setLayout(new GridBagLayout());
		    panel3.setLayout(new GridBagLayout());
		    panel1.setLayout(new BorderLayout());
		    etiqueta1.setLocation(100,100);
		    etiqueta1.setSize(400,200);
		    etiqueta1.setFont(fuente1);
		    
		    etiqueta1.setForeground(Color.black);
		    etiqueta1.setFont(new Font("Times New Roman",Font.BOLD+ Font.ITALIC,30));
		    
		    
		    etiqueta4.setLocation(100,100);
		    etiqueta4.setSize(400,200);
		    etiqueta4.setFont(fuente1);
		    
		    etiqueta4.setForeground(Color.black);
		    etiqueta4.setFont(new Font("Times New Roman",Font.BOLD+ Font.ITALIC,30));

		    gb.gridx = 0; 
		    gb.gridy = 0; 
		    gb.gridwidth = 1; 
		    gb.gridheight = 1; 
		    
		    panel3.add(etiqueta2,gb);
		    gb.gridx = 1;
		    gb.gridy = 0;
		    
		    panel3.add(textField1,gb);
		    gb.gridx = 2;
		    gb.gridy = 0;
		    panel3.add(textField2,gb);
		    
		    gb.gridx = 0;
		    gb.gridy = 1;
		    
		    panel3.add(etiqueta3,gb);
		    
		    
		    gb.gridx = 1;
		    gb.gridy = 1;
		    panel3.add(textField3,gb);
		    
		    gb.gridx = 2;
		    gb.gridy = 1;
		    panel3.add(textField4,gb);
		    
		    
		    gb.gridx = 3;
		    gb.gridy = 1;
		    panel3.add(textField5,gb);
		    
		   
		    panel1.add(etiqueta1,BorderLayout.CENTER);
		    gb.gridx = 0;
		    gb.gridy = 0;
		    
		    panel2.add(buttonMCM,gb);
		    gb.gridx = 0;
		    gb.gridy = 1;
		    
		    panel2.add(buttonMDM,gb);
		    gb.gridx = 0;
		    gb.gridy = 2;
		    
		    panel2.add(triangulo,gb);
		    
		    panel4.add(etiqueta4);
		    
		    this.setSize(600, 400);
		    this.setPreferredSize(new Dimension(1000,1000));
	}

} 