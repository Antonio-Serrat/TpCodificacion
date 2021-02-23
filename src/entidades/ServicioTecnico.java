package entidades;

import java.util.ArrayList;
import java.util.List;

public class ServicioTecnico {
	private String nombre;
	private String direccion;
	private String marca;
	private List<Item>camarasEnServicioTecnico;
	
	public ServicioTecnico(String nombre) {
		super();
		this.nombre = nombre;
		this.camarasEnServicioTecnico = new ArrayList<>();
	}

	public void agregarCamarasEnReparacion(Item item) {
		this.camarasEnServicioTecnico.add(item);
	}
	
	public void quitarCamarasEnReparacion(Item item) {
		this.camarasEnServicioTecnico.remove(item);
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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
	
}
