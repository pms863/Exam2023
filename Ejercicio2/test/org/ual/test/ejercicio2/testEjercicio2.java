package org.ual.test.ejercicio2;

import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import org.ual.ejrcicio2.ej2exam;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testEjercicio2 {
	@ParameterizedTest(name = "Con día={0}, mes={1}, año={2}, el resultado esperado es {3}")
	@CsvFileSource(resources = "prueba.csv", delimiter = ';')
	void testIsDateCorrect(int day, int month, int year, boolean expectedResult) {
		ej2exam date = new ej2exam();
		boolean result = date.isDateCorrect(day, month, year);
		assertEquals(expectedResult, result);
	}
}
