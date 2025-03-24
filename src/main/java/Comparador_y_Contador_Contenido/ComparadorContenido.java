package Comparador_y_Contador_Contenido;

public class ComparadorContenido {
    // Métodos
    public boolean compararArchivos(String file1, String file2) {
        boolean iguales = file1.equals(file2);
        System.out.println("Los archivos son " + (iguales ? "iguales." : "diferentes."));
        return iguales;
    }

    public String encontrarDiferencias(String file1, String file2) {
        if (file1.equals(file2)) {
            return "No hay diferencias.";
        } else {
            String diferencia = "Existen diferencias entre los archivos.";
            System.out.println(diferencia);
            return diferencia;
        }
    }
}