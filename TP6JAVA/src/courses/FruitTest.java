package courses;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class FruitTest {

	private Fruit f1;
	private Fruit f2;
	private Fruit f3;
	private Fruit f4;
	private Fruit f5;
	//private Fruit f6;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		f1 = new Fruit("Banane", 500);
		f2 = new Fruit("Banane", 500);
		f3 = new Fruit("Banane", 400);
		f4 = new Fruit("Pomme", 500);
		f5 = new Fruit("Pomme", 300);
		//f6 = new Fruit(null, 0);
	}

	/**
	 * Test method for {@link courses.Fruit#hashCode()}.
	 */
	@Test
	void testHashCode() {
		assertTrue( f1.hashCode()==f2.hashCode());
	}

	/**
	 * Test method for {@link courses.Fruit#Fruit(java.lang.String, long)}.
	 */
	@Test
	void testFruit() {
		assertNotNull(f1);
		assertNotNull(f4);
		assertNotNull(f5);
		assertThrows( NullPointerException.class, () -> new Fruit(null, 0));
	}

	/**
	 * Test method for {@link courses.Fruit#equals(java.lang.Object)}.
	 */
	@Test
	void testEqualsObject() {
		assertTrue( f1.equals(f2));
		assertFalse( f1.equals(f3));
		assertFalse( f3.equals(f1));
		assertFalse( f2.equals(f4));
		assertFalse( f2.equals("oui"));
		assertFalse( f2.equals(null));
		//assertFalse( f6.equals(f1));
		//assertFalse( f1.equals(f6));
	}

	/**
	 * Test method for {@link courses.Fruit#getNom()}.
	 */
	@Test
	void testGetNom() {
		assertEquals("Banane",f1.getNom());
		assertEquals("Pomme",f5.getNom());
	}

	/**
	 * Test method for {@link courses.Fruit#getPrix()}.
	 */
	@Test
	void testGetPrix() {
		assertEquals(400,f3.getPrix());
		assertEquals(300,f5.getPrix());
	}

	/**
	 * Test method for {@link courses.Fruit#toString()}.
	 */
	@Test
	void testToString() {
		assertEquals("Banane (500)", f1.toString());
		assertEquals("Banane (400)", f3.toString());
		assertEquals("Pomme (300)", f5.toString());
	}

}
