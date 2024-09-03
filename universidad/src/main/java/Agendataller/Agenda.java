package Agendataller;

import java.util.LinkedList;
import java.util.List;

public class Agenda {
    private List<Contacto> contactos;
    private List<Grupo> grupos;
    private List<Reunion> reuniones;

    public Agenda() {
        this.contactos = new LinkedList<>();
        this.grupos = new LinkedList<>();
        this.reuniones = new LinkedList<>();
    }

    // Métodos para gestionar contactos
    public boolean agregarContacto(Contacto contacto) {
        if (!contactos.contains(contacto)) {
            return contactos.add(contacto);
        }
        return false;
    }
    //eliminar contacto con mismo nombre y telefono 
    public boolean eliminarContacto(String nombre, String telefono) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telefono)) {
                return contactos.remove(contacto);
            }
        }
        return false;
    }

    public Contacto buscarContacto(String nombre, String telefono) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telefono)) {
                return contacto;
            }
        }
        return null;
    }

    // Métodos para gestionar grupos
    public boolean agregarGrupo(Grupo grupo) {
        if (!grupos.contains(grupo)) {
            return grupos.add(grupo);
        }
        return false;
    }

    public boolean eliminarGrupo(String nombre) {
        for (Grupo grupo : grupos) {
            if (grupo.getNombre().equals(nombre)) {
                return grupos.remove(grupo);
            }
        }
        return false;
    }

    public Grupo buscarGrupo(String nombre) {
        for (Grupo grupo : grupos) {
            if (grupo.getNombre().equals(nombre)) {
                return grupo;
            }
        }
        return null;
    }

    // Métodos para gestionar reuniones
    public boolean agregarReunion(Reunion reunion) {
        if (!reuniones.contains(reunion)) {
            return reuniones.add(reunion);
        }
        return false;
    }

    public boolean eliminarReunion(String nombre) {
        for (Reunion reunion : reuniones) {
            if (reunion.getNombre().equals(nombre)) {
                return reuniones.remove(reunion);
            }
        }
        return false;
    }

    public Reunion buscarReunion(String nombre) {
        for (Reunion reunion : reuniones) {
            if (reunion.getNombre().equals(nombre)) {
                return reunion;
            }
        }
        return null;
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public List<Reunion> getReuniones() {
        return reuniones;
    }

    @Override
    public String toString() {
        return "Agenda [contactos=" + contactos + ", grupos=" + grupos + ", reuniones=" + reuniones + "]";
    }
}
