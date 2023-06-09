package test.prueba.curso.alternativo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.prueba.curso.alternativo.dominio.Calificacion;
import test.prueba.curso.alternativo.repository.CalificacionRepository;

@Service
public class CalificacionService {
	@Autowired
	CalificacionRepository calificacionRepository;

	public Calificacion registrar(Calificacion Calificacion) {
		return calificacionRepository.save(Calificacion);
	}

	public List<Calificacion> consultarCalificaciones() {
		return calificacionRepository.findAll();
	}

	public Calificacion consultar(Integer id, Double nuevaCalificacion) {
		Calificacion calificacion = calificacionRepository.findById(id).get();
		calificacion.setCalificacion(nuevaCalificacion);
		return calificacion;
	}

	public Calificacion borrar(Integer id) {
		Calificacion calificacion = calificacionRepository.findById(id).get();
		calificacionRepository.delete(calificacion);
		return calificacion;
	}
}
