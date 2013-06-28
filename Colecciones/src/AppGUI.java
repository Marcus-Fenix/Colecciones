import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class AppGUI extends JFrame {
	
	private JButton btn, guardar;
	private JFrame nueva;
	private JTextField Nombre, pApellido, sApellido, Sexo, Edad, NoControl, Carrera;
	private JLabel nombre, papellido, sapellido, sexo, edad, noControl, carrera;
	
	public AppGUI(){
		this.setTitle("Mi Aplicaion de alumno con ashMap");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		Map<String, Alumno> Alumnos = new HashMap<String ,Alumno>();
		
		
		Alumno a2 = new Alumno();
		
		/*a1.setNombre("Marcos");
		a1.setpApellido("S");
		a1.setsApellido("G");
		a1.setNoControl("2011083927");
		a1.setSexo('h');
		a1.setEdad(22);
		a1.setCarrera("Lic. en Computacion");
		
		a2.setNombre("Marcos");
		a2.setpApellido("S");
		a2.setsApellido("G");
		a2.setNoControl("2011o85470");
		a2.setSexo('h');
		a2.setEdad(22);
		a2.setCarrera("Lic. en Computacion");*/
		
		//Alumnos.put(a1.getNoControl(), a1);
		Alumnos.put(a2.getNoControl(), a2);
		
		System.out.println(Alumnos);
		
		guardar = new JButton("Guaradar");
		guardar.setBounds(100, 300, 100, 30);
		guardar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Alumno a1 = new Alumno();
				a1.setNoControl(NoControl.getText());
				a1.setNombre(Nombre.getText());
				a1.setpApellido(pApellido.getText());
				a1.setsApellido(sApellido.getText());
				a1.setSexo(Sexo.getText().charAt(0));
				a1.setEdad(Integer.valueOf(Edad.getText()));
				a1.setCarrera(Carrera.getText());
			}
		});
		
		btn = new JButton("Agregar");
		btn.setBounds(50, 50, 100, 30);
		btn.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				nueva = new JFrame();
				nueva.setLayout(null);
				nueva.setTitle("Agregar alumno");
				nueva.setSize(500, 400);
				nueva.setVisible(true);
				
				Nombre = new JTextField("Nombre: ");
				Nombre.setBounds(120, 20, 110, 30);
				
				pApellido = new JTextField("Primer Apellido: ");
				pApellido.setBounds(120, 50, 110, 30);
				
				sApellido = new JTextField("Segundo Apellido: ");
				sApellido.setBounds(120, 80, 110, 30);
				
				Sexo = new JTextField("Sexo ");
				Sexo.setBounds(120, 110, 110, 30);
				
				Edad = new JTextField("Edad ");
				Edad.setBounds(120, 140, 110, 30);
				
				NoControl = new JTextField("NoControl ");
				NoControl.setBounds(120, 170, 110, 30);
				
				Carrera = new JTextField("Carrera ");
				Carrera.setBounds(120, 200, 110, 30);
				
				nueva.add(Nombre);
				nueva.add(pApellido);
				nueva.add(sApellido);
				nueva.add(Sexo);
				nueva.add(Edad);
				nueva.add(NoControl);
				nueva.add(Carrera);
				nueva.add(guardar);
				
				nombre = new JLabel("Nombre: ");
				nombre.setBounds(10, 20, 110, 30);
				
				papellido = new JLabel("Primer Apellido: ");
				papellido.setBounds(10, 50, 110, 30);
				
				sapellido = new JLabel("Segundo Apellido: ");
				sapellido.setBounds(10, 80, 110, 30);
				
				sexo = new JLabel("Sexo: ");
				sexo.setBounds(10, 110, 110, 30);
				
				edad = new JLabel("Edad: ");
				edad.setBounds(10, 140, 110, 30);
				
				noControl = new JLabel("NoControl: ");
				noControl.setBounds(10, 170, 110, 30);
				
				carrera = new JLabel("Carrera: ");
				carrera.setBounds(10, 200, 110, 30);
				
				nueva.add(nombre);
				nueva.add(papellido);
				nueva.add(sapellido);
				nueva.add(sexo);
				nueva.add(edad);
				nueva.add(noControl);
				nueva.add(carrera);
				nueva.add(guardar);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		this.add(btn);
	}

}
