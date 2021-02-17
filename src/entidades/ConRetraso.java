package entidades;

public class ConRetraso extends Estado {
	
    public ConRetraso () {
    	this.nombre= "con retraso";
    }
    
	public Estado getEstadoSiguiente() {
		// TODO Auto-generated method stub
		return new  Disponible();

	}

}
