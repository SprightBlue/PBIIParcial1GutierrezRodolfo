package ar.edu.unlam.pb2.parcial1;

import ar.edu.unlam.pb2.parcial1.Enumeradores.TipoDeConsola;

public class Videojuego extends Producto implements Alquilable {
	
	private TipoDeConsola tipo;
	private Double precioAlquiler;

	public Videojuego(Integer codigo, String descripcion, TipoDeConsola tipo) {
		super(codigo, descripcion);
		this.setTipo(tipo);
		this.setPrecioAlquiler(0.0);
	}

	public TipoDeConsola getTipo() {
		return tipo;
	}

	private void setTipo(TipoDeConsola tipo) {
		this.tipo = tipo;
	}

	@Override
	public void setPrecioAlquiler(Double precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}

	@Override
	public Double getPrecioAlquiler() {
		return precioAlquiler;
	}

}
