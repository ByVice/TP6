/**
 * 
 */
package test;
import entier.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Vincent
 *
 */
class EntierTest {

	private Entier a,b;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		a= new Entier(10);
		b= new Entier();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link Entier#Entier(int)}.
	 */
	@Test
	void testEntierInt() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Entier#Entier()}.
	 */
	@Test
	void testEntier() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Entier#doubler()}.
	 */
	@Test
	void testDoubler() {
		a.doubler();
		assertEquals(20,a.valeur());
	}

	/**
	 * Test method for {@link Entier#valeur()}.
	 */
	@Test
	void testValeur() {
		assertEquals(10,a.valeur());
	}

}
