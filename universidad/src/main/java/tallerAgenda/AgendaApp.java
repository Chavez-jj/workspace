package tallerAgenda;

import java.time.LocalDate;
import java.time.LocalTime;

public class AgendaApp {

    public static void main(String[] args) {
        // Crear contactos
        Contacto contacto1 = new Contacto("Juan Pérez", "juamperez", "Calle Falsa 123", "555-1234", "juan.perez@example.com");
        Contacto contacto2 = new Contacto("Ana Gómez", "anagomez", "Avenida Siempre Viva 456", "555-5678", "ana.gomez@example.com");
        Contacto contacto3 = new Contacto("Luis Fernández", "luisfer", "Calle Real 789", "555-9876", "luis.fernandez@example.com");

        Reunion reunion = new Reunion("Reunión de fin de año", LocalDate.of(2024, 12, 31), LocalTime.of(20, 0));

        // Agregar contactos asistentes a la reunión
        reunion.agregarContactoAsistente(contacto1);
        reunion.agregarContactoAsistente(contacto2);

        // Mostrar contactos
        System.out.println("Contactos:");
        System.out.println(contacto1);
        System.out.println(contacto2);
        System.out.println(contacto3);

        // Mostrar grupo
        System.out.println("\nGrupo: " + grupoAmigos.getNombre() + " (Categoría: " + grupoAmigos.getCategoria() + ")");
        for (Contacto c : grupoAmigos.getContactos()) {
            System.out.println(c);
        }

        // Mostrar reunión
        System.out.println("\nReunión: " + reunion.getDescripcion());
        System.out.println("Fecha: " + reunion.getFecha());
        System.out.println("Hora: " + reunion.getHora());
        System.out.println("Contactos asistentes:");
        for (Contacto c : reunion.getContactosAsistentes()) {
            System.out.println(c);
        }
    }
}
