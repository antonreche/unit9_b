/**
 * 
 */
package unit9_b;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Clase AlumnoTest creada por JUnit para testear la clase alumno
 * @author Antonio Reche Ramal
 */
public class AlumnosTest {
	
	private Alumno alumno;	

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		alumno=new Alumno();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link unit9_b.Alumno#validaNif(java.lang.String)}.
	 * Test para el Caso 1, la longitud del nif no es de 9 caracteres.
	 */
	@Test
	public void test1ValidaNif() {
		String nif="12345678";
		
		assertFalse(alumno.validaNif(nif));
	}
	
	/**
	 * Test method for {@link unit9_b.Alumno#validaNif(java.lang.String)}.
	 * Test para el Caso 2, los 8 primeros caracteres no son un número válido.
	 */
	@Test
	public void test2ValidaNif() {
		String nif="2A15740P";
		
		assertFalse(alumno.validaNif(nif));
	}	

	/**
	 * Test method for {@link unit9_b.Alumno#calculaTasaMatricula(int, boolean, boolean)}.
	 *
	@Test
	public void testCalculaTasaMatricula() {
		fail("Not yet implemented");
	}
*/
}
