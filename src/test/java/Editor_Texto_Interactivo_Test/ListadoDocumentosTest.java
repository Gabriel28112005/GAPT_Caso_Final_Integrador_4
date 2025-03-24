package Editor_Texto_Interactivo_Test;

import Editor_Texto_Interactivo.ListadoDocumentos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class ListadoDocumentosTest {

    @Test
    public void testAgregarYListarDocumentos() {
        ListadoDocumentos listado = new ListadoDocumentos();
        listado.agregarDocumento("Documento1");
        listado.agregarDocumento("Documento2");
        List<String> docs = listado.listarDocumentos();
        assertEquals(2, docs.size(), "Debe haber 2 documentos en la lista");
    }

    @Test
    public void testSeleccionarDocumento() {
        ListadoDocumentos listado = new ListadoDocumentos();
        listado.agregarDocumento("Documento1");
        listado.agregarDocumento("Documento2");
        String doc = listado.seleccionarDocumento(1);
        assertEquals("Documento2", doc, "El documento seleccionado debe ser 'Documento2'");
    }
}