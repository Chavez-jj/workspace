package tallerAgenda;

import java.util.Collection;
import java.util.LinkedList;

public class Grupo {

    private String nombre;
    private Categoria categoria;
    private Collection<Contacto> contactos;
    
    /**
     * Metodo constructor de la clase grupo
     * 
     * @param nombre
     * @param categoria
     * 
     */

    public Grupo(String nombre, Categoria categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        contactos = new LinkedList<>();

    }

    /*
     * Metodo que agrega contactos a grupo respetando el limite de 5 contactos.
     */


    public void agregarContactoGrupo(Grupo grupo) {
        double contact = 0;
        
        for (Contacto contacto : contactos) {
            if (contact <= 5 ) {
                contactos.add(contacto);
                contact++;
            }
        }
    }

     /*
     * Metodo que elimina a el contacto de grupo por medio de el nombre y el numero de
     * telefono
     */

     public void eliminarContactoGrupo(String nombre, String telefono) {
        for (Contacto contacto : contactos){
            if (contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telefono)) {
                contactos.remove(contacto);
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    /*
     * representación en forma de cadena.
     */
    @Override
    public String toString() {
        return "Grupo [nombre=" + nombre + ", categoria=" + categoria + "]";
    }

}
