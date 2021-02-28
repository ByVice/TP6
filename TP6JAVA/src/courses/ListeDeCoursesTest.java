package courses;


import static org.junit.jupiter.api.Assertions.*;

import courses.Fruit;
import courses.ListeDeCourses;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListeDeCoursesTest {
	
	ListeDeCourses l1;
	ListeDeCourses l2;
	ListeDeCourses l0;

	@BeforeEach
	void setUp() throws Exception {
		l0 = new ListeDeCourses(null);
		l1 = new ListeDeCourses("1");
		l2 = new ListeDeCourses("2");
		l2.ajoute( new Fruit("Banane",10), 2);
		l2.ajoute( new Fruit("Banane",25), 4);
		l2.ajoute( new Fruit("Pomme",10), 2);
		l2.ajoute( new Fruit("Banane",10), 5);
		l2.ajoute( new Fruit("Pomme",10), 8);
		l2.ajoute( new Fruit("Banane",10), 3);
	}

	@Test
	void testListeDeCourses() {
		assertNotNull( l0);
		assertNotNull( l1);
		assertNotNull( l2);
	}

	@Test
	void testQuantite() {
		assertEquals( 0, l0.quantite(new Fruit("Banane",10))); //ERREUR
		assertEquals( 0, l1.quantite(new Fruit("Banane",10))); //ERREUR
		assertEquals( 0, l2.quantite(new Fruit("Banane",20))); //ERREUR
		assertEquals( 10, l2.quantite(new Fruit("Banane",10)));
		assertEquals( 4, l2.quantite(new Fruit("Banane",25)));
		assertEquals( 10, l2.quantite(new Fruit("Pomme",10)));
	}

	@Test
	void testPrix() {
		assertEquals( 0, l0.prix());
		assertEquals( 0, l1.prix());
		l1.ajoute(new Fruit("Pomme",10), 2);
		assertEquals( 20, l1.prix()); // ERREUR : 12 au lieu de 20 (addition au lieu de multiplication)
		l1.ajoute(new Fruit("Pomme",20), 2);
		assertEquals( 60, l1.prix()); // ERREUR : 34 au lieu de 60 (addition au lieu de multiplication)
		assertEquals( 300, l2.prix()); // ERREUR : 69 au lieu de 300
	}

	@Test
	void testToString() {
		assertEquals("liste null\n\nprix: 0", l0.toString()); // ERREUR null au lieu de ""
		assertEquals("liste 1\n\nprix: 0", l1.toString());
		assertEquals("liste 2\n" + 
				"4 Banane (25)\n" + 
				"10 Banane (10)\n" + 
				"10 Pomme (10)\n" + 
				"prix: 300", l2.toString()); // ERREUR : 69 au lieu de 300
	}

}


