package tallerAgenda;

/*
 * CRUD
 */
import java.util.Collection;
import java.util.LinkedList;

public class Agenda {
    private String nombre;
    private Grupo grupo;
    private Contacto contacto;
    private Reunion reunion;
    public Collection<Contacto> contactos; // lista de contactos
    public Collection<Grupo> grupos; // lista de grupos
    public Collection<Reunion> reuniones; // lista de reuniones

    /**
     * Metodo constructor de la clase Agenda
     * 
     * @param grupo
     * @param contacto
     * @param reunion
     */

    public Agenda(String nombre, Grupo grupo, Contacto contacto, Reunion reunion) {
        this.nombre = nombre;
        this.grupo = grupo;
        this.contacto = contacto;
        this.reunion = reunion;
        contactos = new LinkedList<>();
        grupos = new LinkedList<>();
    }

    /*
     * Metodo que impide la creacion de un contacto con el mismo nombre y numero de
     * telefono
     */

    public boolean impedirContactoDoble(String nombre, String telefono) {
        boolean centinela = false;
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telefono)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /*
     * Metodo que crea el contacto
     */

    public void agregarContacto(Contacto contacto) {
        if (!impedirContactoDoble(contacto.getNombre(), contacto.getTelefono())) {
            contactos.add(contacto);
        }
    }

    /*
     * Metodo que elimina a el contacto por medio de el nombre y el numero de
     * telefono
     */

    public void eliminarContacto(String nombre, String telefono) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telefono)) {
                contactos.remove(contacto);
                break;
            }
        }
    }

    /*
     * Metodo que crea a el grupo
     */

    public void agregarGrupo(Grupo grupo) {
        grupos.add(grupo);

    }

    /*
     * Metodo que elimina a el grupo por medio de el nombre
     */

    public void eliminarGrupo(String nombre) {
        for (Grupo grupo : grupos) {
            if (grupo.getNombre().equals(nombre)) {
                grupos.remove(grupo);
                break;
            }
        }
    }

    /*
     * Metodo que crea a la reunion
     */

    public void agregarReunion(Reunion reunion) {
        grupos.add(grupo);

    }

    /*
     * Metodo que elimina a la reunion por medio de el nombre
     */

    public void eliminarReunion(String nombre) {
        for (Grupo grupo : grupos) {
            if (grupo.getNombre().equals(nombre)) {
                grupos.remove(grupo);
                break;
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }

    public Reunion getReunion() {
        return reunion;
    }

    public void setReunion(Reunion reunion) {
        this.reunion = reunion;

    }

    /*
     * representación en forma de cadena del objeto.
     */
    @Override
    public String toString() {
        return "Agenda[nombre="+ nombre + "grupo=" + grupo + ", contacto=" + contacto + ", reunion=" + reunion + "]";
    }
}
