import java.util.Scanner;

import entidades.*; 

public class AppPrincipal {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Tienda tienda = new Tienda(null, null, 0);
		tienda.infoTienda();
		
		int opcion = -1;
		while (opcion != 0) {
			tienda.Menu();
		opcion = sc.nextInt();
		sc.nextLine();
		
			switch (opcion) {
				
			case 1: 
				tienda.agregarCamara(tienda);
				break;
				
			case 2:
				
				tienda.verCamarasDisponibles();
				break;
				
			case 3:

				tienda.datosAlquiler();
				
				break;
			case 4:
	
				tienda.cambiarEstadoCamara(tienda);
				tienda.verListaDeItems();
				
				break;
			case 5:
				
				break;
			case 6:
				tienda.verCamarasConRetraso();
				
				break;
			case 7:
				tienda.recuperarCamaraEnReparacion();
				break;
			case 8:
				tienda.repararCamara();
				break;
			}
		}

	}

}
