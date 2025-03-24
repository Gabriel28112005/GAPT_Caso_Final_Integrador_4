package Validacion_Diseño_Test;

import Validacion_Diseño.HerramientaDibujo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HerramientaDibujoTest {

    @Test
    public void testHerramientaDibujo() {
        HerramientaDibujo dibujo = new HerramientaDibujo();
        // Se verifica que los métodos se ejecuten sin lanzar excepciones.
        assertDoesNotThrow(() -> {
            dibujo.iniciarDibujo();
            dibujo.guardarDibujo();
            dibujo.borrarDibujo();
        });
    }
}