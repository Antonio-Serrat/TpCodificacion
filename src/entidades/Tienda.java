package entidades;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;



public class Tienda {
  
	private String Duenio = "Jose Rutter";
	private String Direccion = "3874 y 2663";
	private int Telefono = 223457638;
	private List<Item> listaDeItems;
	Scanner sc = new Scanner(System.in);
	
	public Tienda(String Duenio, String Direccion, int Telefono) {
		this.Duenio = Duenio;
		this.Direccion = Direccion;
		this.Telefono = Telefono;
		this.listaDeItems = new ArrayList<>();
	}
	
	public void agregarlistaDeItems(Item item) {
		this.listaDeItems.add(item);
	}
	
	
	public List<Item> getListaDeItems() {
		return listaDeItems;
	}
	



	
	public String infoTienda() {
		return "El Dueño de la tienda es: "+Duenio +". Situada en: "+ Direccion + ".  Tlf:  "+Telefono;
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
	
	
	
	public void Menu() {
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-");
		System.out.println("Bienvenido");
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-");
		
		System.out.println("-Ingrese 1 para agregar una nueva camara");
		System.out.println("-Ingrese 2 para obtener camaras disponibles");
		System.out.println("-Ingrese 3 para alquilar una camara");
		System.out.println("-Ingrese 4 para cambiar el estado de una camara ");
		System.out.println("-Ingrese 5 para penalizar a un cliente");
		System.out.println("-Ingrese 6 para obtener las camaras con retraso");
		System.out.println("-Ingrese 7 para obtener las camaras en reparación");
		System.out.println("-Ingrese 8 para enviar una camara a reparacion ");
		System.out.println("-Ingrese 0 para abandonar de la tienda");
	}
	
	public  void agregarCamara (Tienda tienda) {
		System.out.print("Ingrese el codigo de referencia ");
		int codReferencia = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Ingrese la marca del producto ");
		String marca = sc.nextLine();
		
		System.out.print("Ingrese el modelo del producto  ");
		
		String modelo = sc.nextLine();
		
		Item item = new Item (codReferencia);
		CamaraFotografica itemDetails = new CamaraFotografica(marca,modelo);
		Disponible disponible = new Disponible();
		
		item.setEstado(disponible);
		item.setCamara(itemDetails);
		tienda.agregarlistaDeItems(item);
	}
	
	public  void verCamarasDisponibles() {
		System.out.println("las camaras disponibles son: ");
		Estado disponible = new Disponible();
		
		for (Item item : listaDeItems) {
			
			if(item.getEstado().equals(disponible.getNombre())) {
				System.out.println("codigo de referencia: " 
						+item.getCodReferencia()+" " 
						+" marca: "
						+ item.getCamara());	
			}
			
		}
	}	
	public void alquilar(Cliente cliente, Item item) {	
		
		for (Item i : listaDeItems) {
			if (i.getCodReferencia() == item.getCodReferencia()) {
				Estado disponible = new Disponible();
				Estado alquilado = new Alquilada();
				
				if (i.getEstado().equals(disponible.getNombre())) {
					
					i.setEstado(alquilado);
					System.out.println("la alquilaste");
				}else {
					//i.setEstado("Disponible");
					//System.out.println("estaba alquilada ahora la cambiaste a disponible");
				}
				
			}else {
				//System.out.println("no hay ninguna camara con ese codigo");
			}
		}
	} 
	
	public void verListaDeItems(){
		System.out.println("las camaras disponibles son: ");
		for (Item item : listaDeItems) {
			System.out.println("codigo de referencia: " 
					+item.getCodReferencia()+" " 
					+" marca: "
					+ item.getCamara());			
		}
	}
	
	
	
	public void setListaDeItems(List<Item> listaDeItems) {
		this.listaDeItems = listaDeItems;
	}
	
	
	
	
	
	
	
	public void cambiarEstadoCamara(Tienda tienda) {
		
		
		//mostrar el listado de camaras
		tienda.verListaDeItems();
		// ingresa codigo de referencia al cual quieres cambiar de estado
		System.out.println("ingresa codigo de referencia al cual quieres cambiar de estado");
		int codReferencia = sc.nextInt();
		Item nuevoItem = new Item(codReferencia);
		sc.nextLine();
		
		//-- case 1
		for (Item i : listaDeItems) {
			if (i.getCodReferencia() == nuevoItem.getCodReferencia() ) {
				Estado alquilada = new Alquilada();
				i.setEstado(alquilada);
			}
		}
		//----
		
		//menu con cuatro opciones
		// 1 cambiarEstadoAAlquilada
		// item.setEstado(Alquilada alquilada)
		// 2 cambiarEstadoConRetraso
		// item.setEstado(ConRetraso conRetraso)
		// 3 cambiarEstadoEnReparacion
		// item.setEstado(EnReparacion enReparacion)
		// 4 cambiarEstadoDisponible
		// item.setEstado(Disponible disponible)	
		
	}

	
	
/*	public  void cambiarEstadoCamara (Item item) {
		for (Item i : listaDeItems) {
			if (i.getCodReferencia() == item.getCodReferencia()) {
				if (i.getEstado().getNombre().equals("Disponible")) {
					i.setEstado("alquilado");
					System.out.println("Estado cambiado a alquilado");
				}else {
					i.setEstado("Disponible");
					System.out.println("Estado cambiado a disponible");
				}
				
			}else {
				//System.out.println("no hay ninguna camara con ese codigo");
			}
		}
		
	}
	*/
	public  void penalizar () {
		
	}
	
	
	public  void camarasConRetraso() {
		
	}	
	
	public  void camarasEnReparacion() {
		
	}
	
	public  void repararCamara() {
		
	}
	
	
	
}

