package Comparador_y_Contador_Contenido_Test;

import Comparador_y_Contador_Contenido.ComparadorContenido;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComparadorContenidoTest {

    @Test
    public void testCompararArchivos() {
        ComparadorContenido comparador = new ComparadorContenido();
        assertTrue(comparador.compararArchivos("abc", "abc"), "Los archivos deben ser iguales");
        assertFalse(comparador.compararArchivos("abc", "def"), "Los archivos deben ser diferentes");
    }

    @Test
    public void testEncontrarDiferencias() {
        ComparadorContenido comparador = new ComparadorContenido();
        String diferencias = comparador.encontrarDiferencias("abc", "def");
        assertNotNull(diferencias, "La respuesta no debe ser null");
    }
}