package entidades;

import java.util.Date;

public abstract class Estado {
	protected String nombre ;
	private Date fecha = new Date();
	
	public abstract Estado getEstadoSiguiente();
		
	
		
		public String getNombre() {
		return nombre;
	}
		
		public Date getFecha( ) {
		return fecha;
		}
		
		public void  setNombre(String nombre) {
		   this.nombre = nombre;
		}
		
		public void setFecha(Date fecha) {
			 this.fecha = fecha;
		}

}
