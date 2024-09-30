package Biblioteca;

/**
 * Clase abstracta Persona que representa a una persona 
 * en el sistema, conteniendo información básica como nombre, 
 * cédula, teléfono y correo.
 */
public abstract class Persona {
    private String nombre; // Nombre de la persona
    private String cedula; // Cédula de la persona
    private String telefono; // Teléfono de la persona
    private String correo; // Correo electrónico de la persona

    /**
     * Constructor de Persona.
     * 
     * @param nombre Nombre de la persona
     * @param cedula Cédula de la persona
     * @param telefono Teléfono de la persona
     * @param correo Correo electrónico de la persona
     */
    public Persona(String nombre, String cedula, String telefono, String correo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
    }

    // Getters y setters para los atributos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}