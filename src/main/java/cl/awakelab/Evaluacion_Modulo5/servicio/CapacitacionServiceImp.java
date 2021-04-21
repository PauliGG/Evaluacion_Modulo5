package cl.awakelab.Evaluacion_Modulo5.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.Evaluacion_Modulo5.modelo.Capacitacion;
import cl.awakelab.Evaluacion_Modulo5.repositorio.CapacitacionRepository;



@Service
public class CapacitacionServiceImp implements ICapacitacionService{
	
	@Autowired
	CapacitacionRepository cr ;
	
	@Override
	public List<Capacitacion> obtenerCapacitaciones() {
		
		return cr.findAll();
		
	}

	@Override
	public Capacitacion crearCapacitacion(Capacitacion capacitacion) {
		
		return cr.save(capacitacion) ;
	}

}
