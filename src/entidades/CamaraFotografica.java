package entidades;

public class CamaraFotografica {
	private String marca;
	private String modelo;
	private boolean soporteFlash;
	
	
	
	public CamaraFotografica(String marca, String modelo, boolean soporteFlash) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.soporteFlash = soporteFlash;
	}
	public CamaraFotografica(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		
	}
	
	
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
