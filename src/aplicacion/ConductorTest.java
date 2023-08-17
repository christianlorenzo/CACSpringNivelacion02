package aplicacion;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConductorTest {

	@Test
	public void testEsSeguro() {
	
		Auto auto1 = new Auto(120, true);
		Conductor conductor1 = new Conductor(auto1, true);
		assertTrue(conductor1.esSeguro());
		
	}

}
