package Biblioteca;

/**
 * Clase Estudiante que representa a un estudiante en la biblioteca,
 * incluyendo sus datos personales y su estado de préstamo.
 */
public class Estudiante {
    private String nombre; // Nombre del estudiante
    private String id; // ID del estudiante
    private String email; // Correo electrónico del estudiante
    private int telefono; // Teléfono del estudiante
    private boolean activo; // Estado de actividad del estudiante
    private int cantidadPrestamos; // Cantidad de préstamos realizados

    /**
     * Constructor de Estudiante.
     * 
     * @param nombre Nombre del estudiante
     * @param id ID del estudiante
     * @param email Correo electrónico del estudiante
     * @param telefono Teléfono del estudiante
     * @param activo Estado de actividad del estudiante
     */
    public Estudiante(String nombre, String id, String email, int telefono, boolean activo) {
        this.nombre = nombre;
        this.id = id;
        this.email = email;
        this.telefono = telefono;
        this.activo = activo;
        this.cantidadPrestamos = 0; // Inicializa en 0
    }

    /**
     * Obtiene la cantidad de préstamos realizados por el estudiante.
     * 
     * @return Cantidad de préstamos
     */
    public int getCantidadPrestamos() {
        return cantidadPrestamos;
    }

    /**
     * Incrementa la cantidad de préstamos del estudiante.
     */
    public void incrementarPrestamos() {
        cantidadPrestamos++;
    }

    /**
     * Devuelve una representación en cadena del estudiante.
     * 
     * @return Información del estudiante
     */
    @Override
    public String toString() {
        return "Estudiante: " + nombre + " - ID: " + id;
    }

    // Getters y setters para los atributos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void setCantidadPrestamos(int cantidadPrestamos) {
        this.cantidadPrestamos = cantidadPrestamos;
    }
}
