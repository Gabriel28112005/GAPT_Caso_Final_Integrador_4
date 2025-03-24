package Validacion_Diseño;

public class ValidadorEmail {
    // Método
    public boolean validarEmail(String email) {
        boolean valido = email != null && email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
        System.out.println("El email '" + email + "' es " + (valido ? "válido." : "inválido."));
        return valido;
    }
}