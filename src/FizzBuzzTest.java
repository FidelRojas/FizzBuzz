import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	public void deveriaRetornarUnoAlEnviarUno(){
		String resultado=FizzBuzz.generar(1);
		String esperado ="1";
		assertEquals(esperado,resultado);
	}
	@Test
	public void deveriaRetornarDosAlEnviarDos(){
		String resultado=FizzBuzz.generar(2);
		String esperado ="2";
		assertEquals(esperado,resultado);
	}
	

}
