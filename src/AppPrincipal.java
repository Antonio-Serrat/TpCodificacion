import java.util.Scanner;

import entidades.*; 

public class AppPrincipal {

	public static void main(String[] args) {

		Item camaraSony = new Item(354);
		CamaraFotografica camaraSonyDetails = new CamaraFotografica("Sony","MDX",true);
		
		camaraSony.setCamara(camaraSonyDetails);
		System.out.println(camaraSony.getCamara());
		
		Scanner sc = new Scanner(System.in);
		
		Tienda tienda = new Tienda(null, null, 0);
		tienda.infoTienda();
		tienda.agregarlistaDeItems(camaraSony);
		
		Cliente pepe = new Cliente("pepe");
		
		tienda.alquilar(pepe, camaraSony);
		
		int opcion = -1;
		while (opcion != 0) {
			tienda.Menu();
		opcion = sc.nextInt();
		sc.nextLine();
		
			switch (opcion) {
				
			case 1: 
				System.out.print("Ingrese el codigo de referencia ");
				int codReferencia = sc.nextInt();
				sc.nextLine();
				
				System.out.print("Ingrese la marca del producto ");
				String marca = sc.nextLine();
				
				System.out.print("Ingrese el modelo del producto  ");
				
				String modelo = sc.nextLine();
				
				Item item = new Item (codReferencia);
				CamaraFotografica itemDetails = new CamaraFotografica(marca,modelo);
				
				item.setCamara(itemDetails);
				tienda.agregarlistaDeItems(item);
				;
				break;
			case 2:
				
				tienda.verListaDeItems();
				
				;
				break;
			case 3:
				
				System.out.print("Ingrese su nombre  ");
				
				String nombre = sc.nextLine();
				Cliente nuevoCliente = new Cliente(nombre);
				
				tienda.verListaDeItems();
				
				System.out.println("ingrese el codigo de la camara que desee alquilar");
				int codRef = sc.nextInt();
				
				
				sc.nextLine();
				Item itemNuevo = new Item(codRef);
				
				
				tienda.alquilar(nuevoCliente, itemNuevo);
				;
				break;
			case 4:
				;
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
