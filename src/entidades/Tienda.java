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
	
	public void agregarlistaDeItems(Item item) {
		this.listaDeItems.add(item);
	}
	
	
	public List<Item> getListaDeItems() {
		return listaDeItems;
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
		if (listaDeItems.isEmpty()) {
			System.out.println("no hay camaras Disponibles porque no hay ninguna cargada al local");
		}else {
			System.out.println("las camaras disponibles son: ");
			Estado disponible = new Disponible();

			for (Item item : listaDeItems) {
				
				if(item.getEstado().equals(disponible.getNombre())) {
					System.out.printf("Cod Producto: %s.................Nombre: %s ........",
							item.getCodReferencia(),
							 item.getCamara());		
					System.out.println(" ");	
				}
			}
		}
		
		
			
		}
		
	public void datosAlquiler() {
		
		System.out.print("Ingrese su nombre  ");
		
		String nombre = sc.nextLine();
		Cliente nuevoCliente = new Cliente(nombre);
		
		this.verCamarasDisponibles();
		
		System.out.println("ingrese el codigo de la camara que desee alquilar");
		int codRef = sc.nextInt();
		
		sc.nextLine();
		Item itemNuevo = new Item(codRef);
		//si el usuario alquilo una camara, no ejecutes el siguiente codigo.
		//if (!listaDeItems.isEmpty())
		// si el listado del cliente no es null entonces no entra al metodo alquilar
		//
		this.alquilar(nuevoCliente, itemNuevo);
		// syso uds ya tiene una camara alquilada, no puede alquilar otra.El maximo de alquiler es uno.
		
	}
	
	public void alquilar(Cliente cliente, Item item) {	
				
		for (Item i : listaDeItems) {
			if (i.getCodReferencia() == item.getCodReferencia()) {
				Estado disponible = new Disponible();
				Estado alquilado = new Alquilada();
				
				if (i.getEstado().equals(disponible.getNombre())) {
					
					i.setEstado(alquilado);
					
					cliente.agregarCamarasAlquiladas(item);
					
					System.out.println("Has alquilado la camara");
				}else {
					System.out.println("la camara esta alquilada o se encuentra en reparaci�n");
				}
			}
		}
	} 
	
	public void verListaDeItems(){
		
		if (listaDeItems.isEmpty()) {
			System.out.println("no hay camaras ,debes agregar alguna");
		}else {
			//System.out.println("el estado de las camaras es: ");
			for (Item item : listaDeItems) {
				 
				System.out.printf("Cod Producto: %s.................Nombre: %s .............Estado: %s..........",
						item.getCodReferencia(),
						item.getCamara(),	
						item.getEstado());
				System.out.println(" ");
			}
		}
		
		
	}
	
	public void setListaDeItems(List<Item> listaDeItems) {
		this.listaDeItems = listaDeItems;
	}

	public void cambiarEstadoCamara(Tienda tienda) {
		
		if (listaDeItems.isEmpty()) {
			
		}else {
		
		//mostrar el listado de camaras
		tienda.verListaDeItems();
		// ingresa codigo de referencia al cual quieres cambiar de estado
		System.out.println("ingresa codigo de referencia al cual quieres cambiar de estado");
		int codReferencia = sc.nextInt();
		Item nuevoItem = new Item(codReferencia);
		sc.nextLine();
		
		System.out.println("-Ingrese 1 para cambiar el estado de la camara a alquilada");
		System.out.println("-Ingrese 2 para cambiar el estado de la camara a con retraso");
		System.out.println("-Ingrese 3 para cambiar el estado de la camara a en reparacion");
		System.out.println("-Ingrese 4 para cambiar el estado de la camara a disponible");
		int opcion = sc.nextInt();
		switch (opcion) {
				case 1:
					for (Item i : listaDeItems) {
						if (i.getCodReferencia() == nuevoItem.getCodReferencia() ) {
							Estado alquilada = new Alquilada();
							i.setEstado(alquilada);
						}}
					break;
				case 2:
					for (Item i : listaDeItems) {
						if (i.getCodReferencia() == nuevoItem.getCodReferencia() ) {
							Estado conRetraso = new ConRetraso();
							i.setEstado(conRetraso);
						}}
					break;
				case 3:
					for (Item i : listaDeItems) {
						if (i.getCodReferencia() == nuevoItem.getCodReferencia() ) {
							Estado enReparacion = new EnReparacion();
							i.setEstado(enReparacion);
						}}
					break;
				case 4:
					for (Item i : listaDeItems) {
						if (i.getCodReferencia() == nuevoItem.getCodReferencia() ) {
							Estado disponible = new Disponible();
							i.setEstado(disponible);
						}}
					break;
		
		
				default:
					break;
				}	
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
	
	public  void penalizar () {
		
	}
	
	
	public  void verCamarasConRetraso() {
		
		Estado conRetraso = new ConRetraso();
		
		if (listaDeItems.isEmpty()) {
			System.out.println("no hay camaras con retraso");
		}else {
			System.out.println("las camaras con retraso son: ");
			for (Item item : listaDeItems) {
				
				if(item.getEstado().equals(conRetraso.getNombre())) {
					System.out.printf("Cod Producto: %s.................Nombre: %s ........",
							item.getCodReferencia(),
							 item.getCamara());		
					System.out.println(" ");	
				}
				
			}
		}
		
		
	}	
	
	public  void verCamarasEnReparacion() {
		
		Estado enReparacion = new EnReparacion();
		
		if (listaDeItems.isEmpty()) {
			System.out.println("no hay camaras en reparacion");
		}else {
			System.out.println("las camaras en reparacion son: ");
			for (Item item : listaDeItems) {
				
				if(item.getEstado().equals(enReparacion.getNombre())) {
					System.out.printf("Cod Producto: %s.................Nombre: %s ........",
							item.getCodReferencia(),
							 item.getCamara());		
					System.out.println(" ");	
				}
				
			}
		}
		
		
	}	
	
	
	public void enviarAServicioTecnico(ServicioTecnico ST, Item item) {	
		Estado disponible = new Disponible();
		Estado enReparacion = new EnReparacion();
		
		for (Item i : listaDeItems) {
			if (i.getCodReferencia() == item.getCodReferencia()) {
				
				if (i.getEstado().equals(disponible.getNombre())) {
					
					i.setEstado(enReparacion);
					
					ST.agregarCamarasEnReparacion(item);
					
					System.out.println("Has enviado una camara a servicio tecnico: " + ST.getNombre());
				}
			}
		}
	} 

	
	public  void repararCamara() {
		//mostrar un listado de camaras con el estado : EN REPARACION                              checked!!!
		verListaDeItems();
		//ingrese el numero de referencia de la camara que desees enviar a reparar
		
		System.out.println("ingrese el codigo de la camara que desee enviar a reparar");
		int codRef = sc.nextInt();
		sc.nextLine();
		Item itemNuevo = new Item(codRef);
		//mostrar un listado de servicios tecnicos que acepten esa marca de camara(servicio tecnico marca == camaraFotografica marca;)
		ServicioTecnico servicioTecnicoSamsung = new ServicioTecnico("servicioTecnicoSamsung");
		System.out.println("1 " + servicioTecnicoSamsung.getNombre());
		
		
		// enviar camara a servicio tecnico () . Cambiar estado a, "la camara se esta reparando en: servicioTecnicoSamsung.name")
				//										agregar( ServicioTecnico.add(Item))
		
		enviarAServicioTecnico(servicioTecnicoSamsung, itemNuevo);		
		
	}
	
	public void recuperarCamaraEnReparacion(){
		
		Estado disponible = new Disponible();
		Estado enReparacion = new EnReparacion();
		ServicioTecnico ST = new ServicioTecnico(null);
		
		verCamarasEnReparacion();
		//mostrar un listado de camaras con el estado : EN REPARACION                     
		System.out.println("Ingrese el código de la camara que ya ha sido reparada");
		//ingrese el numero de referencia de la camara que ya ha sido reparada.
		int codRef = sc.nextInt();
		Item itemRecuperado = new Item(codRef);
		for(Item i : listaDeItems)
			if(i.getEstado().equals(enReparacion.getNombre())) {
				//Cambiar estado a, disponible)
				i.setEstado(disponible);
				//quitar( ServicioTecnico.remove(Item))
				ST.quitarCamarasEnReparacion(itemRecuperado);
				
			}
		
		System.out.println("Su camara fue devuelta exitosamente.");
	}
	
	
	
}

