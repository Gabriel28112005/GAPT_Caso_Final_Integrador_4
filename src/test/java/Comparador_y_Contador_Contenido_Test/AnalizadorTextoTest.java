package Comparador_y_Contador_Contenido_Test;

import Comparador_y_Contador_Contenido.AnalizadorTexto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnalizadorTextoTest {

    @Test
    public void testContarPalabras() {
        AnalizadorTexto analizador = new AnalizadorTexto();
        int count = analizador.contarPalabras("Hola mundo de prueba");
        assertEquals(4, count, "Debe contar 4 palabras");
    }

    @Test
    public void testGenerarEstadisticas() {
        AnalizadorTexto analizador = new AnalizadorTexto();
        String stats = analizador.generarEstadisticas("Hola mundo de prueba");
        assertTrue(stats.contains("4"), "Las estadísticas deben incluir el número 4");
    }
}