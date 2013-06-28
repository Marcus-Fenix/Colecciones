import java.util.ArrayList;


public class Personaje {
	
	private String nombre;
	private ArrayList<String> skills, items;
	
	public Personaje(String nombre){
		this.nombre = nombre;
		this.skills = new ArrayList();
		this.items = new ArrayList();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<String> getAllSkills() {
		return skills;
	}
	
	public String getSkill(int index){
		return skills.get(index);
	}
	
	public void setSkills(String skills) {
		this.skills.add(skills);
	}
	
	public ArrayList<String> getAllItems() {
		return items;
	}
	
	public String getItem(int index){
		return items.get(index);
	}
	
	public void setItems(String items) {
		this.items.add(items);
	}

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", skills=" + skills
				+ ", items=" + items + "]";
	}
	
	
	

}
