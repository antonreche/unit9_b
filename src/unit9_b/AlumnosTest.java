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
		String nif="91b75537E";
		
		assertFalse(alumno.validaNif(nif));
	}	
	
	/**
	 * Test method for {@link unit9_b.Alumno#validaNif(java.lang.String)}.
	 * Test para el Caso 3, el nif es correcto.
	 */
	@Test
	public void test3ValidaNif() {
		String nif="91075537E";
		
		assertTrue(alumno.validaNif(nif));
	}

	/**
	 * Test method for {@link unit9_b.Alumno#calculaTasaMatricula(int, boolean, boolean)}.
	 * Test para el Caso 1, edad<25, repetidor y no es familia numerosa, resultado esperado tasa=2000;
	 */
	@Test
	public void test1CalculaTasaMatricula() {
		boolean repetidor=true;
		boolean familiaNumerosa=false;
		int edad=24;
		
		assertEquals(alumno.calculaTasaMatricula(edad, familiaNumerosa, repetidor),2000f,0.00);
	}
	
	/**
	 * Test method for {@link unit9_b.Alumno#calculaTasaMatricula(int, boolean, boolean)}.
	 * Test para el Caso 2, edad 30, no es familia numerosa, resultado esperado tasa=500;
	 */
	@Test
	public void test2CalculaTasaMatricula() {
		boolean repetidor=true;
		boolean familiaNumerosa=false;
		int edad=30;
		
		assertEquals(alumno.calculaTasaMatricula(edad, familiaNumerosa, repetidor),500f,0.00);
	}

}
