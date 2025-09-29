package org.generation;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Pruebas unitarias de la clase Calculator")
public class CalculatorTest {

	@DisplayName("Sumatoria de numeros positivos")
	@Test
	void addTest() {
		Calculator cal = new Calculator();
		assertEquals(5, cal.add(3, 2), "Suma 3 y 2 debe ser 5");
		assertEquals(100, cal.add(30, 70), "Suma 30 y 70 debe ser 100");
		assertEquals(1_000_000, cal.add(500_000, 500_000), "Suma 500_000 y 500_000 debe ser 1_000_000");
	}

	// Probar el metodo de resta
	@DisplayName("Resta de numeros positivos")
	@Test
	void substractionTest() {
		Calculator cal = new Calculator();
		assertEquals(1, cal.subtraction(3, 2), "Resta 3 y 2 debe ser 1");
		assertEquals(40, cal.subtraction(70, 30), "Resta 70 y 30 debe ser 40");
		assertEquals(1_500_000, cal.subtraction(2_500_000, 1_000_000),
				"Resta 2_500_000 y 1_000_000 debe ser 1_500_000");
	}

	// Probar el metodo de division
	@DisplayName("Division de numeros positivos")
	@Test
	void divisionTest() {
		Calculator cal = new Calculator();
		assertEquals(5, cal.division(10, 2), "Division 10 entre 2 debe ser 5");
		assertEquals(17, cal.division(70, 4), "Division 70 entre 4 debe ser 17");
		assertEquals(1_500_000, cal.division(3_000_000, 2), "Division 3_000_000 entre 2 debe ser 1_500_000");
	}
}
