package Comparador_y_Contador_Contenido;

public class AnalizadorTexto {
    // Métodos
    public int contarPalabras(String texto) {
        if (texto == null || texto.isEmpty()) {
            return 0;
        }
        String[] palabras = texto.split("\\s+");
        int count = palabras.length;
        System.out.println("Número de palabras: " + count);
        return count;
    }

    public String generarEstadisticas(String texto) {
        int numPalabras = contarPalabras(texto);
        String estadisticas = "Estadísticas: " + numPalabras + " palabras encontradas.";
        System.out.println(estadisticas);
        return estadisticas;
    }
}