package entidades;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nombre;
	private String direccion;
	private int telefono;
	private List<Item>camarasAlquiladas;
	private int mesesPenalizacion;
	
	
	public Cliente(String nombre) {
		super();
		this.nombre = nombre;
		this.camarasAlquiladas = new ArrayList<>();
	}

	
	public List<Item> getCamarasAlquiladas() {
		return camarasAlquiladas;
	}




	public void setCamarasAlquiladas(List<Item> camarasAlquiladas) {
		this.camarasAlquiladas = camarasAlquiladas;
	}




	public void agregarCamarasAlquiladas(Item item) {
		this.camarasAlquiladas.add(item);
	}
	public void quitarCamarasAlquiladas(Item item) {
		this.camarasAlquiladas.remove(item);
	}
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public int getMesesPenalizacion() {
		return mesesPenalizacion;
	}


	public void setMesesPenalizacion(int mesesPenalizacion) {
		this.mesesPenalizacion = mesesPenalizacion;
	}
	
	
	

}

