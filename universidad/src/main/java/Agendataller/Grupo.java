package Agendataller;

import java.util.LinkedList;
import java.util.List;

public class Grupo {

    private String nombre;
    private Categoria categoria;
    private List<Contacto> contactos;

    /**
     * Metodo constructor de la clase grupo
     * 
     * @param nombre
     * @param categoria
     */
    public Grupo(String nombre, Categoria categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.contactos = new LinkedList<>();
    }

    /**
     * Agrega un contacto al grupo si hay menos de 5 contactos en el grupo
     * y si el contacto no está ya en el grupo
     * 
     * @param contacto El contacto a agregar
     * @return true si el contacto fue agregado exitosamente, false en caso si no
     */
    public boolean agregarContactoGrupo(Contacto contacto) {
        if (contactos.size() < 5 && !contactos.contains(contacto)) {
            contactos.add(contacto);
            return true;
        }
        return false;
    }

    /**
     * Elimina un contacto del grupo dado su nombre y teléfono.
     * 
     * @param nombre   El nombre del contacto a eliminar
     * @param telefono El teléfono del contacto a eliminar
     */

    public boolean verificarContacto (String nombre, String telefono) {
        
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telefono)) {
                contactos.remove(contacto);
                return true;
                
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    @Override
    public String toString() {
        return "Grupo [nombre=" + nombre + ", categoria=" + categoria + "]";
    }
}
