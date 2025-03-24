package Interfaz_Grafica_Avanzada_Test;

import Interfaz_Grafica_Avanzada.VentanaMultiple;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VentanaMultipleTest {

    @Test
    public void testAbrirYCerrarVentana() {
        VentanaMultiple ventana = new VentanaMultiple();
        // Estos métodos imprimen en consola, por lo que se invocan para comprobar que no lanzan excepciones.
        assertDoesNotThrow(() -> ventana.abrirNuevaVentana());
        assertDoesNotThrow(() -> ventana.cerrarVentana(1));
    }
}