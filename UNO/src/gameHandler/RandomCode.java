package gameHandler;

import java.util.Random;

public class RandomCode {
	
	private String alphabeth = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
	
	public RandomCode() {}
	
	/**
	 * Genera un código aleatorio de 6 caracteres
	 * @return String code devuelve un código en forma de cadena
	 * */
	public String generate() {
		StringBuilder code = new StringBuilder();
		code.append(this.alphabeth.charAt(Random(this.alphabeth.length())));
		code.append(String.format("%s",Random(9)));
		code.append(String.format("%s",Random(9)));
		code.append(this.alphabeth.charAt(Random(this.alphabeth.length())));
		code.append(String.format("%s",Random(9)));
		code.append(this.alphabeth.charAt(Random(this.alphabeth.length())));
		
		return code.toString();
	}
	
	/**
	 * Genera un número Aleatorio dentro de un rango
	 * @param int n recibe un valor entero que será el valor máximo del rango
	 * @return int devuelve un valor entero aleatorio entre 0 y n
	 * */
	private int Random(int n) {
		Random rand = new Random();
		if (n!=0) {
			return rand.nextInt(n);
		}
		return 0;
		    
	}
	
	
}
