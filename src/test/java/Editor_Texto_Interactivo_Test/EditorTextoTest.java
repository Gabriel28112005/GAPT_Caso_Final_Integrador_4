package Editor_Texto_Interactivo_Test;

import Editor_Texto_Interactivo.EditorTexto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EditorTextoTest {

    @Test
    public void testCrearYEditarTexto() {
        EditorTexto editor = new EditorTexto("Autor");
        editor.crearTexto();
        editor.editarTexto("Texto de prueba");
        assertEquals("Texto de prueba", editor.getContenido(), "El contenido debe ser 'Texto de prueba'");
    }

    @Test
    public void testGuardarYCargarTexto() {
        EditorTexto editor = new EditorTexto("Autor");
        editor.editarTexto("Contenido guardado");
        boolean guardado = editor.guardarTexto("ruta.txt");
        assertTrue(guardado, "El texto debe guardarse exitosamente");
        String contenido = editor.cargarTexto("ruta.txt");
        assertEquals("Contenido guardado", contenido, "El contenido cargado debe coincidir");
    }
}