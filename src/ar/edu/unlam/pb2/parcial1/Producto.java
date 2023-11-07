package ar.edu.unlam.pb2.parcial1;

import ar.edu.unlam.pb2.parcial1.Enumeradores.Estado;

public abstract class Producto {
	
	protected Integer codigo;
	protected String descripcion;
	protected Estado estadoActual;
	protected Cliente quienPoseeElProducto;
	
	public Producto(Integer codigo, String descripcion) {
		this.setCodigo(codigo);
		this.setDescripcion(descripcion);
		this.setEstadoActual(Estado.DISPONIBLE);
		this.setQuienPoseeElProducto(null);
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	
	protected void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	protected void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Estado getEstadoActual() {
		return estadoActual;
	}
	
	protected void setEstadoActual(Estado estadoActual) {
		this.estadoActual = estadoActual;
	}

	public Cliente getQuienPoseeElProducto() {
		return quienPoseeElProducto;
	}
	
	protected void setQuienPoseeElProducto(Cliente quienPoseeElProducto) {
		this.quienPoseeElProducto = quienPoseeElProducto;
	}

}
