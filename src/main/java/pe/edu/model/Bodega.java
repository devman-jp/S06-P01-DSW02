package pe.edu.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BODEGAS")
public class Bodega {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idBodega;
	private String nombre;
	private String direccion;
	private Integer telefono;
	private Date inaguracion;
	private String duenio;
	
	public Bodega() {
		// TODO Auto-generated constructor stub
	}

	public Bodega(Integer idBodega, String nombre, String direccion, Integer telefono, Date inaguracion,
			String duenio) {
		this.idBodega = idBodega;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.inaguracion = inaguracion;
		this.duenio = duenio;
	}

	public Integer getIdBodega() {
		return idBodega;
	}

	public void setIdBodega(Integer idBodega) {
		this.idBodega = idBodega;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public Date getInaguracion() {
		return inaguracion;
	}

	public void setInaguracion(Date inaguracion) {
		this.inaguracion = inaguracion;
	}

	public String getDuenio() {
		return duenio;
	}

	public void setDuenio(String duenio) {
		this.duenio = duenio;
	}
	
	
	
}
