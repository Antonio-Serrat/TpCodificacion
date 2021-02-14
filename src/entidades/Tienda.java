package entidades;

import java.util.Date;



public class Tienda {
	private String Duenio = "Jose Rutter";
	private String Direccion = "3874 y 2663";
	private int Telefono = 223457638;
	private String estadoCamara = "disponible";
	public void camarasDisponibles() {
	}
	
	
	
	public Tienda(String Duenio, String Direccion, int Telefono) {
		this.Duenio = Duenio;
		this.Direccion = Direccion;
		this.Telefono = Telefono;	
	}
	public String infoTienda() {
		return "El Dueño de la tienda es: "+Duenio +". Situada en: "+ Direccion + ".  Tlf:  "+Telefono;
	}
	
	
	
	public void Menu() {
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-");
		System.out.println("Bienvenido");
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-");
		
		System.out.println("-Ingrese 1 para obtener camaras disponibles");
		System.out.println("-Ingrese 2 para obtener camaras disponibles");
		System.out.println("-Ingrese 3 para alquilar una camara");
		System.out.println("-Ingrese 4 para cambiar el estado de una camara ");
		System.out.println("-Ingrese 5 para penalizar a un cliente");
		System.out.println("-Ingrese 6 para obtener las camaras con retraso");
		System.out.println("-Ingrese 7 para obtener las camaras en reparación");
		System.out.println("-Ingrese 8 para enviar una camara a reparacion ");
		System.out.println("-Ingrese 0 para abandonar de la tienda");
	}
	
	
	
	
	public String getDuenio() {
		return Duenio;
	}
	public String getDireccion() {
		return Direccion;
	}
	public int getTelefono() {
		return Telefono;
	}
	
	
	public String getEstadoCamara() {
		return estadoCamara;
	}
	
	public void setEstadoCamara(String estadoCamara) {
		estadoCamara = estadoCamara;
	}	
	
	public  void alquilar () {
		
	}
	
	public  void penalizar () {
		
	}
	
	public  void obtenerCamarasDisponibles() {
		
	}	
	
	public  void obtenerCamarasConRetraso() {
		
	}	
	
	public  void obtenerCamarasEnReparacion() {
		
	}
	
	public  void repararCamara() {
		
	}
	
	
	
}

