package entidades;

public class EnReparacion extends Estado {
	
	public EnReparacion () {
		this.nombre= "EnReparacion";
	}

	public Estado getEstadoSiguiente() {
		
		return this;

	}

}
