package Agendataller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;

public class Reunion {

    private String nombre;
    private LocalDate fecha;
    private LocalTime hora;
    private List<Contacto> contactosAsistentes;

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
        this.contactosAsistentes = new LinkedList<>();
    }

    /*
     * Agrega un contacto a la reunión.
     * 
     * @param contacto El contacto a agregar
     * @return true cuando el contacto es agregado exitosamente
     */
    public boolean agregarContacto(Contacto contacto) {
        return contactosAsistentes.add(contacto);
    }

    /**
     * Elimina un contacto de la reunión dado su nombre y teléfono.
     * 
     * @param nombre El nombre del contacto a eliminar
     * @param telefono El teléfono del contacto a eliminar
     * @return true si el contacto fue eliminado exitosamente, false en caso contrario
     */
    public boolean eliminarContacto(String nombre, String telefono) {
        for (Contacto contacto : contactosAsistentes) {
            if (contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telefono)) {
                return contactosAsistentes.remove(contacto);
            }
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public List<Contacto> getContactosAsistentes() {
        return contactosAsistentes;
    }

    @Override
    public String toString() {
        return "Reunion [nombre=" + nombre + ", fecha=" + fecha + ", hora=" + hora + "]";
    }
}