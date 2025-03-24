package Validacion_Diseño_Test;

import Validacion_Diseño.ValidadorEmail;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorEmailTest {

    @Test
    public void testValidarEmail() {
        ValidadorEmail validador = new ValidadorEmail();
        assertTrue(validador.validarEmail("test@example.com"), "El email debe ser válido");
        assertFalse(validador.validarEmail("no-valid-email"), "El email debe ser inválido");
    }
}