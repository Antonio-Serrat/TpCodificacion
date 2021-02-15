package entidades;

public class camaraFotografica {
	private String marca;
	private String modelo;
	private boolean soporteFlash=true;
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public boolean isSoporteFlash() {
		return soporteFlash;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setSoporteFlash(boolean soporteFlash) {
		this.soporteFlash = soporteFlash;
	} 
	
	
}
