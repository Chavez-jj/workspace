package tallerAgenda;

import java.time.LocalDate;
import java.time.LocalTime;

public class App {
    public static void main(String[] args) {
        //contacto
        
        Contacto contacto1 = new Contacto ("julian", "Nato", "celaa", "3200423232", "juasn@enmske.com");
        Contacto contacto2 = new Contacto ("oscar", "omar", "celaa", "3200423232", "juasn@enmske.com");
        Contacto contacto3  = new Contacto ("oscar", "omar", "celaa", "3200423232", "juasn@enmske.com");
        Contacto contacto4 = new Contacto ("oscar", "omar", "celaa", "3200423232", "juasn@enmske.com");
        Contacto contacto5 = new Contacto ("raul", "elprofe", "lanube", "3200423232", "juasn@enmske.com");
        Contacto contacto6 = new Contacto("pepe", "diente duro", "calle 100", "32177", "pepinillo@nd.com");
        //Agregar grupo a agenda
        Grupo grupoAmigos = new Grupo("Amigos", Categoria.AMIGOS);



        // Agregar contactos al grupo
        grupoAmigos.agregarContactoGrupo(contacto1);
        grupoAmigos.agregarContactoGrupo(contacto2);
        grupoAmigos.agregarContactoGrupo(contacto3);
       

        //agregar reunion a agenda
        Reunion reunion = new Reunion("Reunión de fin de año", LocalDate.of(2024, 12, 31), LocalTime.of(20, 0));

        // Agregar contactos asistentes a la reunión
        reunion.agregarContactoReunion(contacto1);
        reunion.agregarContactoReunion(contacto2);

       
        //Agregar contactos a agenda

        //Agregar grupos a agenda

        //Agregar reuniones a agenda
        
       


        //Eliminar estudiante de agenda

        //Eliminar estudiante de grupo 
        
        //Eliminar estudiante de reunion

       

        

        
    }

}
