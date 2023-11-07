package ar.edu.unlam.pb2.parcial1;

public class Libro extends Producto implements Vendible {

	private String autor;
	private String editorial;
	private Double precioVenta;
	
	public Libro(Integer codigo, String descripcion, String autor, String editorial) {
		super(codigo, descripcion);
		this.setAutor(autor);
		this.setEditorial(editorial);
		this.setPrecioVenta(0.0);
	}

	public String getAutor() {
		return autor;
	}
	
	private void setAutor(String autor) {
		this.autor = autor;
	}
	
	public Object getEditorial() {
		return editorial;
	}

	private void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	@Override
	public void setPrecioVenta(Double precioVenta) {
		this.precioVenta = precioVenta;
	}

	@Override
	public Double getPrecioVenta() {
		return precioVenta;
	}

}
