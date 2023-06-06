package com.taurus.financeapi;

import com.taurus.financeapi.test.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FinanceApiApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testeSoma() {
		int resultado = Calculadora.somar(2, 3);
		Assertions.assertEquals(5, resultado);
	}

	@Test
	public void testeSubtracao() {
		int resultado = Calculadora.subtrair(5, 3);
		Assertions.assertEquals(2, resultado);
	}

	@Test
	public void testeMultiplicacao() {
		int resultado = Calculadora.multiplicar(2, 3);
		Assertions.assertEquals(6, resultado);
	}

	@Test
	public void testeDivisao() {
		double resultado = Calculadora.dividir(10, 2);
		Assertions.assertEquals(5.0, resultado, 0.001);
	}

}
