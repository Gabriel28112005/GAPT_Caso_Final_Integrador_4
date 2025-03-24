package Busqueda_Gestion_Contactos;

import java.util.Map;
import java.util.HashMap;

public class AgendaContactos {
    // Modelo: mapa de contactos (nombre -> información)
    private Map<String, String> contactos;

    // Constructor
    public AgendaContactos() {
        contactos = new HashMap<>();
    }

    // Métodos
    public void agregarContacto(String nombre, String info) {
        contactos.put(nombre, info);
        System.out.println("Contacto agregado: " + nombre);
    }

    public void eliminarContacto(String nombre) {
        if (contactos.remove(nombre) != null) {
            System.out.println("Contacto eliminado: " + nombre);
        } else {
            System.out.println("Contacto no encontrado: " + nombre);
        }
    }

    public Map<String, String> listarContactos() {
        System.out.println("Listando contactos...");
        return contactos;
    }

    public String buscarContacto(String nombre) {
        String info = contactos.get(nombre);
        if (info != null) {
            System.out.println("Contacto encontrado: " + nombre);
        } else {
            System.out.println("Contacto no encontrado: " + nombre);
        }
        return info;
    }
}