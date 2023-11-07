package ar.edu.unlam.pb2.parcial1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ar.edu.unlam.pb2.parcial1.Enumeradores.Estado;

public class Videoclub {
	
	private String nombre;
	private List<Producto> productos;

	public Videoclub(String nombre) {
		this.setNombre(nombre);
		this.productos = new ArrayList<Producto>();
	}
	
	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Producto agregarProducto(Producto nuevoProducto) {
		this.productos.add(nuevoProducto);
		return nuevoProducto;
	}

	public boolean vender(Producto nuevoProducto, Cliente nuevoCliente) {
		boolean vendido = false;
		if(nuevoProducto.getEstadoActual().equals(Estado.DISPONIBLE) && nuevoProducto instanceof Vendible) {
			nuevoProducto.setEstadoActual(Estado.VENDIDO);
			nuevoProducto.setQuienPoseeElProducto(nuevoCliente);
			vendido = true;
		}
		return vendido;
	}

	public Producto buscarProducto(Producto nuevoProducto) {
		Producto productoBuscado = null;
		Iterator<Producto> iterador = this.productos.iterator();
		boolean encontrado = false;
		while(!encontrado && iterador.hasNext()) {
			Producto productoIterado = iterador.next();
			if(productoIterado.equals(nuevoProducto)) {
				productoBuscado = productoIterado;
				encontrado = true;
			}
		}
		return productoBuscado;
	}

	public boolean alquilar(Producto nuevoProducto, Cliente nuevoCliente) {
		boolean alquilado = false;
		if(nuevoProducto.getEstadoActual().equals(Estado.DISPONIBLE) && nuevoProducto instanceof Alquilable) {
			nuevoProducto.setEstadoActual(Estado.ALQUILADO);
			nuevoProducto.setQuienPoseeElProducto(nuevoCliente);
			alquilado = true;
		}
		return alquilado;
	}	

}
