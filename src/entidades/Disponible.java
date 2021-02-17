package entidades;

public class Disponible extends Estado {
	
	public Disponible () {
		this.nombre= "Disponible";
	}
	
	
	public Estado getEstadoSiguiente() {
		// TODO Auto-generated method stub
		return new EnReparacion();
			

	}

	
}
