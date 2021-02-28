package notation;

public class Notes {
	private float[] notes;
	private int capacite;
	private int nombre;
	private float max;
	private float min;
	private float moyenne;
	
	public static float NOTE_MIN = 20;
	public static float NOTE_MAX = 0;
	
	public Notes(int pCapacite) {
		capacite = pCapacite;
		notes = new float[capacite];
		max = NOTE_MAX;
		min = NOTE_MIN;

	}
	
	public boolean ajoute(float pNote) {
		float somme = 0;
		if(pNote >= NOTE_MIN && pNote <= NOTE_MAX && nombre<capacite) {
			notes[nombre] = pNote;
			nombre ++;
			if(pNote > max) {
				max = pNote;
			}
			if(pNote < min) {
				min = pNote;
			}

			for(int i = 0;i<nombre;i++){
				somme += notes[i]; 
			}
			
			moyenne = somme/nombre;
			return true;
		}
		return false;
	}
	
	public boolean capaciteAtteinte() {
		if(nombre >= capacite) {
			return true;
		}
		return false;
	}
	
	public int capacite() {
		return capacite;
	}
	
	public float min() {
		return min;
	}
	
	public float max() {
		return max;
	}
	
	public float moyenne() {
		return moyenne;
				
	}
	
	public int nombre() {
		return nombre;
	}
	

}
