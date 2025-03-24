import Busqueda_Gestion_Contactos.*;
import Comparador_y_Contador_Contenido.*;
import Editor_Texto_Interactivo.*;
import Interfaz_Grafica_Avanzada.*;
import Validacion_Diseño.*;

public class Main {
    public static void main(String[] args) {

        // 1. Editor de Texto Interactivo
        System.out.println("=== Editor de Texto Interactivo ===");
        EditorTexto editor = new EditorTexto("Juan");
        editor.crearTexto();
        editor.editarTexto("Este es el contenido del texto.");
        editor.guardarTexto("texto.txt");
        String contenido = editor.cargarTexto("texto.txt");
        System.out.println("Contenido cargado: " + contenido);
        System.out.println();

        // 2. Listado de Documentos
        System.out.println("=== Listado de Documentos ===");
        ListadoDocumentos listado = new ListadoDocumentos();
        listado.agregarDocumento("Documento1");
        listado.agregarDocumento("Documento2");
        System.out.println("Documentos: " + listado.listarDocumentos());
        String docSeleccionado = listado.seleccionarDocumento(0);
        System.out.println("Documento seleccionado: " + docSeleccionado);
        System.out.println();

        // 3. Comparador y Contador de Contenido
        System.out.println("=== Comparador y Contador de Contenido ===");
        ComparadorContenido comparador = new ComparadorContenido();
        boolean iguales = comparador.compararArchivos("Contenido1", "Contenido1");
        System.out.println("Archivos iguales: " + iguales);
        String dif = comparador.encontrarDiferencias("Contenido1", "Contenido2");
        System.out.println("Diferencias: " + dif);
        System.out.println();

        // 4. Analizador de Texto
        System.out.println("=== Analizador de Texto ===");
        AnalizadorTexto analizador = new AnalizadorTexto();
        int numPalabras = analizador.contarPalabras("Hola mundo esto es una prueba");
        System.out.println("Número de palabras: " + numPalabras);
        String estadisticas = analizador.generarEstadisticas("Hola mundo esto es una prueba");
        System.out.println("Estadísticas: " + estadisticas);
        System.out.println();

        // 5. Buscador de Palabras
        System.out.println("=== Buscador de Palabras ===");
        BuscadorPalabras buscador = new BuscadorPalabras();
        int ocurrencias = buscador.buscarPalabra("uno dos uno tres uno", "uno");
        System.out.println("La palabra 'uno' aparece " + ocurrencias + " veces.");
        System.out.println();

        // 6. Agenda de Contactos
        System.out.println("=== Agenda de Contactos ===");
        AgendaContactos agenda = new AgendaContactos();
        agenda.agregarContacto("Ana", "ana@example.com");
        agenda.agregarContacto("Luis", "luis@example.com");
        System.out.println("Contactos: " + agenda.listarContactos());
        String contacto = agenda.buscarContacto("Ana");
        System.out.println("Contacto encontrado: " + contacto);
        agenda.eliminarContacto("Luis");
        System.out.println("Contactos tras eliminar 'Luis': " + agenda.listarContactos());
        System.out.println();

        // 7. Interfaz Gráfica Avanzada
        System.out.println("=== Interfaz Gráfica Avanzada ===");
        VentanaMultiple ventana = new VentanaMultiple();
        ventana.abrirNuevaVentana();
        ventana.cerrarVentana(1);
        SeguimientoRaton raton = new SeguimientoRaton();
        String posicionRaton = raton.obtenerPosicionRaton();
        System.out.println("Posición del ratón: " + posicionRaton);
        BarraDesplazamiento barra = new BarraDesplazamiento();
        barra.actualizarProgreso(70);
        barra.saltarSeccion(3);
        System.out.println();

        // 8. Validación de E-mail y Diseño Gráfico
        System.out.println("=== Validación de E-mail y Diseño Gráfico ===");
        ValidadorEmail validador = new ValidadorEmail();
        boolean emailValido = validador.validarEmail("test@example.com");
        System.out.println("Email 'test@example.com' es válido: " + emailValido);
        boolean emailInvalido = validador.validarEmail("invalid-email");
        System.out.println("Email 'invalid-email' es válido: " + emailInvalido);
        HerramientaDibujo dibujo = new HerramientaDibujo();
        dibujo.iniciarDibujo();
        dibujo.guardarDibujo();
        dibujo.borrarDibujo();
        System.out.println();

        System.out.println("=== FIN DE LA SIMULACIÓN ===");
    }
}