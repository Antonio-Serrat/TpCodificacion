package entidades;

public class Alquilada extends Estado {
	
	public Alquilada () {
		this.nombre= "Alquilada";
		
	}

	public Estado getEstadoSiguiente() {
		// TODO Auto-generated method stub
		return new ConRetraso();

	}

}
