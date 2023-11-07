package ar.edu.unlam.pb2.parcial1;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlam.pb2.parcial1.Enumeradores.Genero;

public class Pelicula extends Producto implements Vendible, Alquilable {
	
	private Genero genero;
	private Integer anoDeEstreno;
	private String director;
	private List<String> actores;
	private Double precioVenta;
	private Double precioAlquiler;

	public Pelicula(Integer codigo, String descripcion, Genero genero,
			Integer anoDeEstreno, String director) {
		super(codigo, descripcion);
		this.setGenero(genero);
		this.setAnoDeEstreno(anoDeEstreno);
		this.setDirector(director);
		this.actores = new ArrayList<String>();
		this.setPrecioVenta(0.0);
		this.setPrecioAlquiler(0.0);
	}

	public void agregarActor(String actor) {
		this.actores.add(actor);
	}

	public Genero getGenero() {
		return genero;
	}
	
	private void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Integer getAnoDeEstreno() {
		return anoDeEstreno;
	}
	
	private void setAnoDeEstreno(Integer anoDeEstreno) {
		this.anoDeEstreno = anoDeEstreno;
	}

	public String getDirector() {
		return director;
	}
	
	private void setDirector(String director) {
		this.director = director;
	}

	public Boolean actua(String actor) {
		return this.actores.contains(actor);
	}

	@Override
	public void setPrecioVenta(Double precioVenta) {
		this.precioVenta = precioVenta;
	}

	@Override
	public Double getPrecioVenta() {
		return precioVenta;
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
