package test.prueba.curso.alternativo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.prueba.curso.alternativo.dominio.Alumno;
import test.prueba.curso.alternativo.repository.AlumnoRepository;

@Service
public class AlumnoService {
	@Autowired
	AlumnoRepository alumnoRepository;

	public Alumno registrar(Alumno alumno) {
		return alumnoRepository.save(alumno);
	}

	public List<Alumno>consultarLista() {
		return alumnoRepository.findAll();
	}

	public Alumno consultar(Integer id, Double nuevaCalificacion) {
		Alumno alumno = alumnoRepository.findById(id).get();
		return alumno;
	}

	public Alumno borrar(Integer id) {
		Alumno alumno = alumnoRepository.findById(id).get();
		alumnoRepository.delete(alumno);
		return alumno;
	}
}
