package Interfaz_Grafica_Avanzada_Test;

import Interfaz_Grafica_Avanzada.BarraDesplazamiento;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BarraDesplazamientoTest {

    @Test
    public void testActualizarYSaltar() {
        BarraDesplazamiento barra = new BarraDesplazamiento();
        // Solo se verifica que no lancen excepciones
        assertDoesNotThrow(() -> barra.actualizarProgreso(50));
        assertDoesNotThrow(() -> barra.saltarSeccion(2));
    }
}