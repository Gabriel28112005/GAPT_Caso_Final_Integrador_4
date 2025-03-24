package Busqueda_Gestion_Contactos_Test;

import Busqueda_Gestion_Contactos.BuscadorPalabras;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BuscadorPalabrasTest {

    @Test
    public void testBuscarPalabra() {
        BuscadorPalabras buscador = new BuscadorPalabras();
        int count = buscador.buscarPalabra("uno dos uno tres uno", "uno");
        assertEquals(3, count, "La palabra 'uno' debe aparecer 3 veces");
    }
}