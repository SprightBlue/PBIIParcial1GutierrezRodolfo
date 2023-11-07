package ar.edu.unlam.pb2.parcial1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import ar.edu.unlam.pb2.parcial1.Enumeradores.Estado;
import ar.edu.unlam.pb2.parcial1.Enumeradores.Genero;
import ar.edu.unlam.pb2.parcial1.Enumeradores.TipoDeConsola;

class PrimerParcial2021 {

	@Test
	public void queSePuedaCrearUnaPelicula() {
		// Preparaci�n
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Exterminators II";
		final Genero GENERO_ESPERADO = Genero.ACCION;
		final Integer ANO_DE_ESTRENO_ESPERADO = 1993;
		final String DIRECTOR_ESPERADO = "Carlos Galettini";
		final String ACTOR_1_ESPERADO = "Guillermo Francella";
		final String ACTOR_2_ESPERADO = "Emilio Disi";
		
		// Ejecuci�n
		Pelicula pelicula = new Pelicula(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, GENERO_ESPERADO, ANO_DE_ESTRENO_ESPERADO, DIRECTOR_ESPERADO);
		pelicula.agregarActor(ACTOR_1_ESPERADO);
		pelicula.agregarActor(ACTOR_2_ESPERADO);
		
		// Validaci�n
		assertEquals(CODIGO_ESPERADO, pelicula.getCodigo());
		assertEquals(DESCRIPCION_ESPERADA, pelicula.getDescripcion());
		assertEquals(GENERO_ESPERADO, pelicula.getGenero());
		assertEquals(ANO_DE_ESTRENO_ESPERADO, pelicula.getAnoDeEstreno());
		assertEquals(DIRECTOR_ESPERADO, pelicula.getDirector());
		assertTrue(pelicula.actua(ACTOR_1_ESPERADO));
		
	}
	
	@Test
	public void queSePuedaCrearUnVideojuego() {
		// Preparaci�n
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Fornite";
		final TipoDeConsola CONSOLA_ESPERADA = TipoDeConsola.PLAY_STATION;
		
		// Ejecuci�n
		Videojuego juego = new Videojuego(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, CONSOLA_ESPERADA);
		
		// Validaci�n
		assertEquals(CODIGO_ESPERADO, juego.getCodigo());
		assertEquals(DESCRIPCION_ESPERADA, juego.getDescripcion());
		assertEquals(CONSOLA_ESPERADA, juego.getTipo());
		
	}
	
	@Test
	public void queSePuedaCrearUnLibro() {
		// Preparaci�n
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Fifty Shades of Grey";
		final String AUTOR_ESPERADO = "E. L. James";
		final String EDITORIAL_ESPERADA = "Vintage Books";
		
		// Ejecuci�n
		Libro libro = new Libro(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, AUTOR_ESPERADO, EDITORIAL_ESPERADA);
		
		// Validaci�n
		assertEquals(CODIGO_ESPERADO, libro.getCodigo());
		assertEquals(DESCRIPCION_ESPERADA, libro.getDescripcion());
		assertEquals(AUTOR_ESPERADO, libro.getAutor());
		assertEquals(EDITORIAL_ESPERADA, libro.getEditorial());
		
	}
	
	@Test
	public void queSePuedaCrearUnComestible() {
		// Preparaci�n
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Chomps";
		
		// Ejecuci�n
		Comestible comestible = new Comestible(CODIGO_ESPERADO, DESCRIPCION_ESPERADA);
		
		// Validaci�n
		assertEquals(CODIGO_ESPERADO, comestible.getCodigo());
		assertEquals(DESCRIPCION_ESPERADA, comestible.getDescripcion());
	}

	@Test
	public void queUnaPeliculaSeaVendible() {
		// Preparaci�n
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Exterminators II";
		final Genero GENERO_ESPERADO = Genero.ACCION;
		final Integer ANO_DE_ESTRENO_ESPERADO = 1993;
		final String DIRECTOR_ESPERADO = "Carlos Galettini";
		final Double PRECIO_VENTA = 5000.0;
		
		// Ejecuci�n
		Vendible pelicula = new Pelicula(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, GENERO_ESPERADO, ANO_DE_ESTRENO_ESPERADO, DIRECTOR_ESPERADO);
		pelicula.setPrecioVenta(PRECIO_VENTA);
		
		// Validaci�n
		assertEquals(PRECIO_VENTA, pelicula.getPrecioVenta());		
	}

	@Test
	public void queUnJuegoSeaAlquilable() {
		// Preparaci�n
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Fornite";
		final TipoDeConsola CONSOLA_ESPERADA = TipoDeConsola.PLAY_STATION;
		final Double PRECIO_ALQUILER = 500.0;
		
		// Ejecuci�n
		Alquilable juego = new Videojuego(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, CONSOLA_ESPERADA);
		juego.setPrecioAlquiler(PRECIO_ALQUILER);
		
		
		// Validaci�n
		assertEquals(PRECIO_ALQUILER, juego.getPrecioAlquiler());		
	}
	
	@Test
	public void queSePuedaCrearUnCliente() {
		// Preparaci�n
		final Integer CODIGO_ESPERADO = 1;
		final String NOMBRE_ESPERADO = "Camila";
		final String APELLIDO_ESPERADO = "Oculto";
		final Integer EDAD_ESPERADA = 23;
		
		// Ejecuci�n
		Cliente nuevoCliente = new Cliente(CODIGO_ESPERADO, APELLIDO_ESPERADO, NOMBRE_ESPERADO, EDAD_ESPERADA);
		
		// Validaci�n
		assertEquals(CODIGO_ESPERADO, nuevoCliente.getCodigo());
		assertEquals(NOMBRE_ESPERADO, nuevoCliente.getNombre());
		assertEquals(APELLIDO_ESPERADO, nuevoCliente.getApellido());
		assertEquals(EDAD_ESPERADA, nuevoCliente.getEdad());
		
	}

	@Test
	public void queSePuedaVenderUnLibro() {
		// Preparaci�n
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Fifty Shades of Grey";
		final String AUTOR_ESPERADO = "E. L. James";
		final String EDITORIAL_ESPERADA = "Vintage Books";
		final String NOMBRE_VIDEOCLUB = "Blockbuster";
		final Integer CODIGO_CLIENTE_ESPERADO = 1;
		final String NOMBRE_ESPERADO = "Camila";
		final String APELLIDO_ESPERADO = "Privado";
		final Integer EDAD_ESPERADA = 23;
		final Estado ESTADO_INICIAL_ESPERADO = Estado.DISPONIBLE;
		final Estado ESTADO_FINAL_ESPERADO = Estado.VENDIDO;
		
		// Ejecuci�n
		Videoclub video = new Videoclub(NOMBRE_VIDEOCLUB);
		Producto nuevoProducto = new Libro(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, AUTOR_ESPERADO, EDITORIAL_ESPERADA);
		Cliente nuevoCliente = new Cliente(CODIGO_ESPERADO, APELLIDO_ESPERADO, NOMBRE_ESPERADO, EDAD_ESPERADA);
		
		video.agregarProducto(nuevoProducto);
		
		// Validaci�n
		assertEquals(ESTADO_INICIAL_ESPERADO, video.agregarProducto(nuevoProducto).getEstadoActual());
		assertTrue(video.vender(nuevoProducto, nuevoCliente));
		assertEquals(NOMBRE_ESPERADO, video.agregarProducto(nuevoProducto).getQuienPoseeElProducto().getNombre());
		assertEquals(ESTADO_FINAL_ESPERADO, video.agregarProducto(nuevoProducto).getEstadoActual());
	}
	
	@Test
	public void queSePuedaAlquilarUnaPelicula() {
		// Preparaci�n
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "El Cisne Negro";
		final Genero GENERO_ESPERADO = Genero.SUSPENSO;
		final Integer ANO_DE_ESTRENO_ESPERADO = 2010;
		final String DIRECTOR_ESPERADO = "Darren Aronofsky";
		final String ACTOR_1_ESPERADO = "Natalie Portman";
		final String NOMBRE_VIDEOCLUB = "Blockbuster";
		final Integer CODIGO_CLIENTE_ESPERADO = 1;
		final String NOMBRE_ESPERADO = "Camila";
		final String APELLIDO_ESPERADO = "Privado";
		final Integer EDAD_ESPERADA = 23;
		final Estado ESTADO_INICIAL_ESPERADO = Estado.DISPONIBLE;
		final Estado ESTADO_FINAL_ESPERADO = Estado.ALQUILADO;
		
		// Ejecuci�n
		Videoclub video = new Videoclub(NOMBRE_VIDEOCLUB);
		Producto nuevoProducto = new Pelicula(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, GENERO_ESPERADO, ANO_DE_ESTRENO_ESPERADO, DIRECTOR_ESPERADO);
		Cliente nuevoCliente = new Cliente(CODIGO_ESPERADO, APELLIDO_ESPERADO, NOMBRE_ESPERADO, EDAD_ESPERADA);		
		
		video.agregarProducto(nuevoProducto);
		
		// Validaci�n
		assertEquals(ESTADO_INICIAL_ESPERADO, video.buscarProducto(nuevoProducto).getEstadoActual());
		assertTrue(video.alquilar(nuevoProducto, nuevoCliente));
		assertEquals(NOMBRE_ESPERADO, video.buscarProducto(nuevoProducto).getQuienPoseeElProducto().getNombre());
		assertEquals(ESTADO_FINAL_ESPERADO, video.buscarProducto(nuevoProducto).getEstadoActual());
	}

	@Test
	void queSeNoSePuedaVenderUnComestibleVendido() {
		// Preparaci�n
		
		// Ejecuci�n
		
		// Validaci�n
	}
	
	@Test
	void queSeNoSePuedaAlquilarUnJuegoAlquilado() {
		// Preparaci�n
		
		// Ejecuci�n
		
		// Validaci�n
	}
	
	@Test
	void queLuegoDeDevueltaUnaPeliculaSePuedaAlquilar() {
		// Preparaci�n
		
		// Ejecuci�n
		
		// Validaci�n
	}
	
	@Test
	void queSeNoSePuedaAlquilarUnPeliculaAUnMenor() {
		// Preparaci�n
		
		// Ejecuci�n
		
		// Validaci�n
	}

}
