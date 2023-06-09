package test.prueba.curso.alternativo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import test.prueba.curso.alternativo.dominio.Materia;

public interface MateriaRepository extends JpaRepository<Materia, Integer>{

}
