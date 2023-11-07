package ar.edu.unlam.pb2.parcial1;

public class Cliente {

	private Integer codigo;
	private String apellido;
	private String nombre;
	private Integer edad;
	
	public Cliente(Integer codigo, String apellido, String nombre, Integer edad) {
		this.setCodigo(codigo);
		this.setApellido(apellido);
		this.setNombre(nombre);
		this.setEdad(edad);
	}

	public Integer getCodigo() {
		return codigo;
	}
	
	private void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	private void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public Integer getEdad() {
		return edad;
	}

	private void setEdad(Integer edad) {
		this.edad = edad;
	}

}
