package Busqueda_Gestion_Contactos_Test;

import Busqueda_Gestion_Contactos.AgendaContactos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Map;

public class AgendaContactosTest {

    @Test
    public void testAgregarYBuscarEliminarContacto() {
        AgendaContactos agenda = new AgendaContactos();
        agenda.agregarContacto("Juan", "juan@mail.com");
        assertEquals("juan@mail.com", agenda.buscarContacto("Juan"), "El email de Juan debe ser 'juan@mail.com'");

        Map<String, String> contactos = agenda.listarContactos();
        assertEquals(1, contactos.size(), "Debe haber 1 contacto en la agenda");

        agenda.eliminarContacto("Juan");
        contactos = agenda.listarContactos();
        assertEquals(0, contactos.size(), "La agenda debe quedar vacía después de eliminar");
    }
}