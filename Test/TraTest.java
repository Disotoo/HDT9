import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
 * Diego Soto (22737)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 7
 * 25-03-2023
 * Clase TRaTest: Pruebas Unitarias
 */


class TraTest {

	@Test
	void redBlack() {
		ArbolRedBlack<Palabra> resultado = new ArbolRedBlack<Palabra>();
		resultado.add(new Palabra("dog", "perro"));
		Palabra busqueda = resultado.get(new Palabra("dog", ""));
		assertEquals("perro", busqueda.getSpanish());
	}

	@Test
	void splay() {
		ArbolSplay<Palabra> resultado1 = new ArbolSplay<Palabra>();
		resultado1.add(new Palabra("house", "casa"));
		Palabra busqueda1 = resultado1.get(new Palabra("house", ""));
		assertEquals("casa", busqueda1.getSpanish());
	}




	

}