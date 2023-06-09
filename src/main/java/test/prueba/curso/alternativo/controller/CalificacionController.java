package test.prueba.curso.alternativo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import test.prueba.curso.alternativo.dominio.Calificacion;
import test.prueba.curso.alternativo.dto.ResponseDTO;
import test.prueba.curso.alternativo.service.CalificacionService;

@RestController
@RequestMapping("calificaciones")
public class CalificacionController {
	
	@Autowired 
	private CalificacionService calificacionService;
	
	
	@GetMapping
	public List<Calificacion> obtenerCalificaciones() {
		return calificacionService.consultarCalificaciones();
	}
	
	@PostMapping
	public ResponseDTO guardar(@RequestBody Calificacion calificacion ) {
		calificacionService.registrar(calificacion);
		return new ResponseDTO("ok","calificacion registrada");
	}
	
	@PutMapping
	public ResponseDTO consultar(@RequestParam Integer id, @RequestParam Double calificacion) {
		calificacionService.consultar(id, calificacion);
		return new ResponseDTO("ok","calificacion actualizada");
	}
	
	@DeleteMapping
	public ResponseDTO eliminar(@RequestParam Integer id ) {
		calificacionService.borrar(id);
		return new ResponseDTO("ok","calificacion eliminada");
	}

}
