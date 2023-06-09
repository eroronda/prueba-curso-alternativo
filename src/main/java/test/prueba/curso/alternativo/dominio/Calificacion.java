package test.prueba.curso.alternativo.dominio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Calificacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_t_calificaciones")
	private Integer id;
	@JoinColumn(name = "id_t_usuarios")
	@ManyToOne(fetch = FetchType.LAZY)
	private Alumno alumno;
	@JoinColumn(name = "id_t_materias")
	@ManyToOne(fetch = FetchType.LAZY)
	private Materia materia;

	private Double calificacion;
	@Column(name="fecha_registro")
	private Date fechaRegistro;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Double calificacion) {
		this.calificacion = calificacion;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

}
