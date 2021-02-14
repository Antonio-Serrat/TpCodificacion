import java.util.Scanner;

import entidades.*; 

public class AppPrincipal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Tienda tienda = new Tienda(null, null, 0);
		tienda.setDuenio("Jorge onorfa");
		tienda.setDireccion("Guatemala 625");
		tienda.setTelefono(4890709);
		
		
		int opcion = -1;
		while (opcion != 0) {
			tienda.Menu();
		opcion = sc.nextInt();
		sc.nextLine();
		}
		switch (opcion) {
			
		case 1: 
			tienda.obtenerCamarasDisponibles();
			break;
		case 2:
			tienda.alquilar();
			break;
		case 3:
			tienda.cambiarEstadoCamaras();
			break;
		case 4:
			tienda.penalizar();
			break;
		case 5:
			tienda.obtenerCamarasConRetraso();
			break;
		case 6:
			tienda.obtenerCamarasEnReparacion();
			break;
		case 7:
			tienda.repararCamara();
			break;
		}
	}

}
