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
	@Test
	public void deveriaRetornarFizzAlEnviar3(){
		String resultado=FizzBuzz.generar(3);
		String esperado ="Fizz";
		assertEquals(esperado,resultado);
	}
	@Test
	public void deveriaRetornarBuzzAlEnviar5(){
		String resultado=FizzBuzz.generar(5);
		String esperado ="Buzz";
		assertEquals(esperado,resultado);
	}
	@Test
	public void deveriaRetornarFizzBuzzAlEnviar15(){
		String resultado=FizzBuzz.generar(15);
		String esperado ="FizzBuzz";
		assertEquals(esperado,resultado);
	}
	
	

}
