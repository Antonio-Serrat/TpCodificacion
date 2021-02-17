package entidades;

public class EnReparacion extends Estado {
	
	public EnReparacion () {
		this.nombre= "En reparacion";
	}

	public Estado getEstadoSiguiente() {
		
		return this;

	}

}
