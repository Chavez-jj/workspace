package Agendataller;

import java.time.LocalDate;
import java.time.LocalTime;

public class App {
    public static void main(String[] args) {
        // Crear instancia de Agenda
        Agenda agenda = new Agenda();

        // Crear contactos
        Contacto contacto1 = new Contacto("Julian", "yulian", "Calle perdida", "32011", "juan@ere.com");
        Contacto contacto2 = new Contacto("Oscar", "Omar", "Calle jiji", "32004", "oscar@ere.com");
        Contacto contacto3 = new Contacto("pipe", "pepinillo", "Calle 123", "32003", "pepinillopipe@ere.com");
        Contacto contacto4 = new Contacto("raul", "elprofe", "Calle 13", "32023", "rulys@ere.com");
        Contacto contacto5 = new Contacto("raul", "elprofe", "Calle 13", "32023", "rulys@ere.com");
        Contacto contacto6 = new Contacto("pepe", "peque", "calle 100", "32002", "pepeee@ere.com");
        // Agregar contactos a la agenda
        agenda.agregarContacto(contacto1);
        agenda.agregarContacto(contacto2);
        agenda.agregarContacto(contacto3);
        agenda.agregarContacto(contacto4);
        agenda.agregarContacto(contacto5);
        agenda.agregarContacto(contacto6);
        
        // Crear grupo
        Grupo grupoAmigos = new Grupo("Amigos", Categoria.AMIGOS);
        agenda.agregarGrupo(grupoAmigos);

        // Agregar contactos al grupo
        grupoAmigos.agregarContactoGrupo(contacto1);
        grupoAmigos.agregarContactoGrupo(contacto2);
        grupoAmigos.agregarContactoGrupo(contacto3);
        grupoAmigos.agregarContactoGrupo(contacto4);
        grupoAmigos.agregarContactoGrupo(contacto5);
        grupoAmigos.agregarContactoGrupo(contacto6);

        // Crear reunión
        Reunion reunion = new Reunion("Reunión de fin de año", LocalDate.of(2024, 12, 31), LocalTime.of(20, 0));
        agenda.agregarReunion(reunion);

        // Agregar contactos asistentes a la reunión
        reunion.agregarContacto(contacto1);
        reunion.agregarContacto(contacto2);

        // Mostrar contactos
        System.out.println("Contactos:");
        for (Contacto contacto : agenda.getContactos()) {
            System.out.println(contacto);
        }

        // Mostrar grupo
        System.out.println("\nGrupo: " + grupoAmigos.getNombre() + " (Categoría: " + grupoAmigos.getCategoria() + ")");
        for (Contacto contacto : grupoAmigos.getContactos()) {
            System.out.println(contacto);
        }

        // Mostrar reunión
        System.out.println("\nReunión: " + reunion.getNombre());
        System.out.println("Fecha: " + reunion.getFecha());
        System.out.println("Hora: " + reunion.getHora());
        System.out.println("Contactos asistentes:");
        for (Contacto contacto : reunion.getContactosAsistentes()) {
            System.out.println(contacto);
        }
    }
}