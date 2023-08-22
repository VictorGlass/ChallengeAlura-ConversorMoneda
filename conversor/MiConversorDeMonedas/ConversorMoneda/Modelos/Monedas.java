package Modelos;

public class Monedas {
	
	private String nombre;
	
	public Monedas(String nombre, double valorCompra, double valorVenta) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static String convertirMoneda(double cantidad, String tipoDeCambio) {
		switch (tipoDeCambio) {
		case "Peso Chileno a Dolar": {
			double cantidadObtenida = cantidad * 0.001;
			return "Usted cambio " + cantidad + " pesos Chilenos por " + cantidadObtenida + " Dolares";
		}
		case "Peso Chileno a Euro": {
			double cantidadObtenida = cantidad * 0.0011;
			return "Usted cambio "+ cantidad + " pesos Chilenos por " + cantidadObtenida + " Euros";
		}
		case "Peso Chileno a Libra Esterlina": {
			double cantidadObtenida = cantidad * 0.00090;
			return "Usted cambio "+ cantidad + " pesos Chilenos por " + cantidadObtenida + " Libra Esterlina";
		}
		case "Peso Chileno a Peso Argentino": {
			double cantidadObtenida = cantidad * 0.40;
			return "Usted cambio "+ cantidad + " pesos Chilenos por" + cantidadObtenida + " Peso Argentino";
		}
		case "Dolar a Peso Chileno": {
			double cantidadObtenida = cantidad * 869;
			return "Usted cambio "+ cantidad + " Dolares por " + cantidadObtenida + " Pesos Chilenos";
		}
		case "Euro a Peso Chileno": {
			double cantidadObtenida = cantidad * 943;
			return "Usted cambio "+ cantidad + " Euros por " + cantidadObtenida + " Pesos Chilenos";
		}
		case "Libra Esterlina a Peso Chileno": {
			double cantidadObtenida = cantidad * 1.106;
			return "Usted cambio "+ cantidad + " Libra Esterlina por " + cantidadObtenida + " Pesos Chilenos";
		}
		case "Peso Argentino a Peso Chileno": {
			double cantidadObtenida = cantidad * 2.48;
			return "Usted cambio "+ cantidad + " Peso Argentino por" + cantidadObtenida + " Peso Chileno";
		}
		default:{
			return "Al parecer a ocurrido un error";
		}
		
		}
	}
 }