package entidades;

public class ConRetraso extends Estado {
	
    public ConRetraso () {
    	this.nombre= "Pagado";
    }
    
	public Estado getEstadoSiguiente() {
		// TODO Auto-generated method stub
		return new  Disponible();

	}

}
