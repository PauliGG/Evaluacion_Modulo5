package cl.awakelab.Evaluacion_Modulo5.servicio;

import java.util.List;

import cl.awakelab.Evaluacion_Modulo5.modelo.Capacitacion;



public interface ICapacitacionService {
	
	public List<Capacitacion> obtenerCapacitaciones();

	public Capacitacion crearCapacitacion(Capacitacion capacitacion);
	
}
