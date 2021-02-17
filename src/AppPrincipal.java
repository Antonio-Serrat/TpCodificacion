import java.util.Scanner;

import entidades.*; 

public class AppPrincipal {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Tienda tienda = new Tienda(null, null, 0);
		tienda.infoTienda();
		//tienda.agregarlistaDeItems(camaraSony);
		
		//Cliente pepe = new Cliente("pepe");
		
		//tienda.alquilar(pepe, camaraSony);
		
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
				
				System.out.print("Ingrese su nombre  ");
				
				String nombre = sc.nextLine();
				Cliente nuevoCliente = new Cliente(nombre);
				
				tienda.verCamarasDisponibles();
				
				System.out.println("ingrese el codigo de la camara que desee alquilar");
				int codRef = sc.nextInt();
				
				
				sc.nextLine();
				Item itemNuevo = new Item(codRef);
				
				
				tienda.alquilar(nuevoCliente, itemNuevo);
				;
				break;
			case 4:
				
				tienda.cambiarEstadoCamara(tienda);
				
				/*tienda.verListaDeItems();
				System.out.println("ingrese el codigo de la camara que desee cambiar el estado");
				
				int codRefe = sc.nextInt();			
				sc.nextLine();
				Item itemNuevou = new Item(codRefe);
				
				//tienda.cambiarEstadoCamara(itemNuevou);
				;*/
				break;
			case 5:
				;
				break;
			case 6:
				;
				break;
			case 7:
				;
				break;
			}
		}

	}

}
