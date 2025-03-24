package Editor_Texto_Interactivo;

import java.util.List;
import java.util.ArrayList;

public class ListadoDocumentos {
    // Modelo: lista de documentos
    private List<String> documentos;

    // Constructor
    public ListadoDocumentos() {
        this.documentos = new ArrayList<>();
    }

    // Métodos
    public List<String> listarDocumentos() {
        System.out.println("Listando documentos...");
        return documentos;
    }

    public String seleccionarDocumento(int id) {
        if (id >= 0 && id < documentos.size()) {
            String doc = documentos.get(id);
            System.out.println("Documento seleccionado: " + doc);
            return doc;
        } else {
            System.out.println("ID de documento inválido.");
            return null;
        }
    }

    // Método auxiliar para agregar documentos
    public void agregarDocumento(String documento) {
        documentos.add(documento);
        System.out.println("Documento agregado: " + documento);
    }
}