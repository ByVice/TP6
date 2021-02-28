package test;
import notation.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NotesTest {
	Notes a;

	@BeforeEach
	void setUp() throws Exception {
		a = new Notes(10);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testNotes() {
		assertEquals(a, new Notes(10));
	}

	@Test
    void testAjoute() {
		a.ajoute(9);
		assertEquals(1,a.nombre());
		assertEquals(9,a.min());
		assertEquals(9,a.max());
	}

	@Test
	void testCapaciteAtteinte() {
		fail("Not yet implemented");
	}

	@Test
	void testCapacite() {
		fail("Not yet implemented");
	}

	@Test
    void testMin() {
		fail("Not yet implemented");
	}

	@Test
	void testMax() {
		fail("Not yet implemented");
	}

	@Test
	void testMoyenne() {
		fail("Not yet implemented");
	}

	@Test
	void testNombre() {
		fail("Not yet implemented");
	}

}
