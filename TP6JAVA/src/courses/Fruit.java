package courses;

import java.util.Objects;

public class Fruit {
  private final String nom;
  private final long prix;

  public Fruit(String nom, long prix) {
	Objects.requireNonNull(nom);
    this.nom = nom;
    this.prix = prix;
  }
  
  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Fruit)) {
      return false;
    }
    Fruit fruit = (Fruit)o;
    return nom.equals(fruit.nom) && prix==fruit.prix;
  }
  
  @Override
  public int hashCode() {
    return nom.hashCode();
  }
  
  public String getNom() {
    return nom;
  }
  
  public long getPrix() {
    return prix;
  }
  
  @Override
  public String toString() {
    return nom + " (" + prix + ')';
  }
}