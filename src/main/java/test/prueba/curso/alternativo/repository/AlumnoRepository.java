package test.prueba.curso.alternativo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import test.prueba.curso.alternativo.dominio.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Integer>{

}
