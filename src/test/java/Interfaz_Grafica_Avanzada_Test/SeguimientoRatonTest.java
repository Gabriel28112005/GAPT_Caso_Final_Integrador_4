package Interfaz_Grafica_Avanzada_Test;

import Interfaz_Grafica_Avanzada.SeguimientoRaton;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SeguimientoRatonTest {

    @Test
    public void testObtenerPosicionRaton() {
        SeguimientoRaton raton = new SeguimientoRaton();
        String posicion = raton.obtenerPosicionRaton();
        assertNotNull(posicion, "La posición del ratón no debe ser null");
        assertFalse(posicion.isEmpty(), "La posición del ratón no debe estar vacía");
    }
}