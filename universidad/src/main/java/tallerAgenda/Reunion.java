package tallerAgenda;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Collection;
import java.util.LinkedList;



public class Reunion {
    private String nombre;
    private LocalDate fecha;
    private LocalTime hora;
    private Collection<Contacto> contactosAsistentes;

    /**
     * Metodo constructor de la clase reunion
     * 
     * @param nombre
     * @param fecha
     * @param hora
     * 
     */

    public Reunion(String nombre, LocalDate fecha, LocalTime hora) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        contactosAsistentes = new LinkedList<>();
    }

    /*
     * Metodo que agrega contactos asistentes a reunion
     */
    public void agregarContactoReunion(Contacto contacto) {

        contactosAsistentes.add(contacto);

    }

    /*
     * Metodo que elimina a el contacto de reunion por medio de el nombre y el
     * numero de
     * telefono
     */
    public void eliminarContactoReunion(String nombre, String telefono) {
        for (Contacto contacto : contactosAsistentes) {
            if (contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telefono)) {
                contactosAsistentes.remove(contacto);
                break;
            }
        }
    }

    /*
     * metodos get y set.
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarContacto(Contacto contacto) {
        contactosAsistentes.add(contacto);
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    /*
     * representación en forma de cadena del objeto.
     */
    @Override
    public String toString() {
        return "Reunion [nombre=" + nombre + ", dia= " + fecha + ", hora=" + hora + "]";
    }

}
