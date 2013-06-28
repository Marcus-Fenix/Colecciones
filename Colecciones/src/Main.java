import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		//List<String> equipo = new LinkedList<String>();
		List<String> equipo = new ArrayList<String>();
		
		equipo.add("Mario");
		equipo.add("Marcos");
		equipo.add("Gera");
		equipo.add("Carlos");
		
		//Iterator it = equipo.iterator();
		
		/*ListIterator<String> it =  equipo.listIterator();
		String primero = (String) it.next();
		//System.out.println("ª" + primero);
		String segundo = (String) it.next();
		//System.out.println("ª" + segundo);*/
		//it.remove();
		/*for(String e : equipo){
			System.out.println(e);
		}
		
		String Obj = null;
	
		for(String e : equipo){
			if(e == "Mario"){
				Obj = e;
			}
		}
		
		equipo.remove(Obj);
		
		for(String e : equipo){
			System.out.println(e);
		}*/
		
		/*List<Personaje> listaPersonaje = new ArrayList<Personaje>();
		listaPersonaje.add(new Personaje("Mario"));
		listaPersonaje.get(0).setItems("Estrella");
		listaPersonaje.get(0).setItems("Hongo");
		listaPersonaje.get(0).setSkills("Brincar");
		
		for(Personaje p : listaPersonaje){
			System.out.println(" " + p.toString());
		}*/
		
		AppGUI app = new AppGUI();
		app.setVisible(true);
		
	}

}
