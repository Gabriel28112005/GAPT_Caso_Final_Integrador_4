package Busqueda_Gestion_Contactos;

public class BuscadorPalabras {
    // Método
    public int buscarPalabra(String texto, String palabra) {
        if (texto == null || palabra == null) {
            return 0;
        }
        int count = 0;
        int index = 0;
        while ((index = texto.indexOf(palabra, index)) != -1) {
            count++;
            index += palabra.length();
        }
        System.out.println("La palabra '" + palabra + "' aparece " + count + " veces.");
        return count;
    }
}