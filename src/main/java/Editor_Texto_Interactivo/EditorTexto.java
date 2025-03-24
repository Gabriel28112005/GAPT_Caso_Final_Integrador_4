package Editor_Texto_Interactivo;

public class EditorTexto {
    // Modelos (atributos)
    private String contenido;
    private String autor;

    // Constructor
    public EditorTexto(String autor) {
        this.autor = autor;
        this.contenido = "";
    }

    // Métodos
    public void crearTexto() {
        this.contenido = "";
        System.out.println("Texto creado.");
    }

    public void editarTexto(String nuevoContenido) {
        this.contenido = nuevoContenido;
        System.out.println("Texto editado.");
    }

    public boolean guardarTexto(String ruta) {
        // Simulación: se guarda el texto y se retorna true.
        System.out.println("Texto guardado en " + ruta);
        return true;
    }

    public String cargarTexto(String ruta) {
        // Simulación: se retorna el contenido actual.
        System.out.println("Texto cargado desde " + ruta);
        return this.contenido;
    }

    // Getters y Setters
    public String getContenido() {
        return contenido;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
}