package Modelos;

public class Temperatura {
	private String nombre;
	
	public Temperatura(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public static String convertirTemperatura(double cantidad, String tipoDeCambio) {
		switch (tipoDeCambio) {
		case "De Celsius a Farenheite": {
			double temperatura = (cantidad * 9 / 5) + 32;
			return cantidad + "Grados Celsius equivalen a " + temperatura + " Grados Farenheite.";
		}
		case "De Fareheite a Celsius": {
			double temperatura = (cantidad - 32) * 5 / 9;
			return cantidad + " Grados farenheite equivalen a " + temperatura + " Grados Celsius.";
		}
		default: {
			return "Al parecer algo a salido mal";
		}
		}
	}
}