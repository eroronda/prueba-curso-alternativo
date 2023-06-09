package test.prueba.curso.alternativo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import test.prueba.curso.alternativo.dominio.Calificacion;

public interface CalificacionRepository extends JpaRepository<Calificacion, Integer> {

}
