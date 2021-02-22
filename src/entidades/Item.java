package entidades;

import java.util.Date;

public class Item {
	
	private int codReferencia;
	private Estado estado = new Disponible() ;
	private Double costoAlquiler;
	private Date fechaDevolucion = new Date();
	private int historialAlquiler; //dias de alquiler de 1 a 30
	public CamaraFotografica camara;
	
	
	public Item(int codReferencia) {
		super();
		this.codReferencia = codReferencia;
		this.estado = estado;
	}
	
	public String getCamara() {
		return camara.getMarca();
	}

	public void setCamara(CamaraFotografica camara) {
		this.camara = camara;
	}
	

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public int getCodReferencia() {
		return codReferencia;
	}

	

	public Double getCostoAlquiler() {
		return costoAlquiler;
	}

	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}

	public int getHistorialAlquiler() {
		return historialAlquiler;
	}

	public void setCodReferencia(int codReferencia) {
		this.codReferencia = codReferencia;
	}



	public void setCostoAlquiler(Double costoAlquiler) {
		this.costoAlquiler = costoAlquiler;
	}

	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public void setHistorialAlquiler(int historialAlquiler) {
		this.historialAlquiler = historialAlquiler;
	}
	
	public void cambiarEstado (Estado estado) {
		estado.getEstadoSiguiente();
	}
	
	
	
	
	}

