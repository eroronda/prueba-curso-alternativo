package test.prueba.curso.alternativo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.prueba.curso.alternativo.dominio.Materia;
import test.prueba.curso.alternativo.repository.MateriaRepository;

@Service
public class MateriaService {

	@Autowired MateriaRepository materiaRepository;
	
	public Materia registrar(Materia materia) {
		return materiaRepository.save(materia);
	}
	
	public List<Materia> consultarMaterias(){
		return materiaRepository.findAll();
	}
	
	public Materia consultar(Integer id, Double nuevaCalificacion) {
		Materia materia = materiaRepository.findById(id).get();
		return materia;
	}
	
	public Materia borrar(Integer id) {
		Materia materia = materiaRepository.findById(id).get();
		materiaRepository.delete(materia);
		return materia;
	}
}
