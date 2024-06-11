package org.ual.ejrcicio2;

public class ej2exam {
	 public boolean isDateCorrect(int day, int month, int year) {
	        // Verificar si el mes está dentro del rango válido (1-12)
	        if (month < 1 || month > 12)
	            return false;

	        // Verificar si el día está dentro del rango válido para el mes dado
	        switch (month) {
	            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
	                return day >= 1 && day <= 31;
	            case 4: case 6: case 9: case 11:
	                return day >= 1 && day <= 30;
	            case 2: // Febrero
	                // Febrero siempre tiene 28 días
	                return day >= 1 && day <= 28;
	            default:
	                return false;
	        }
	    }
}
