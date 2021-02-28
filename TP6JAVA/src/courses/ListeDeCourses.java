package courses;


import java.util.HashMap;
import java.util.stream.Collectors;

public class ListeDeCourses {
	  private final String nom;
	  private final HashMap<Fruit, Integer> courses = new HashMap<>();
	  
	  public ListeDeCourses(String nom) {
	    this.nom = nom;
	  }

	  public void ajoute(Fruit fruit, int quantite) {
	    courses.merge(fruit, quantite, Integer::sum);
	  }
	  
	  public int quantite(Fruit fruit) {
	    return courses.get(fruit);
	  }
	  
	  public long prix() {
	    return courses.entrySet().stream().mapToLong(entry -> entry.getKey().getPrix() + entry.getValue()).sum();
	  }
	  
	  @Override
	  public String toString() {
	    String s = courses.entrySet().stream().map(entry -> entry.getValue() + " " + entry.getKey()).collect(Collectors.joining("\n"));
	    return "liste " + nom + '\n' + s + '\n' + "prix: " + prix();
	  }}