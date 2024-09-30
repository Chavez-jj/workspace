package Biblioteca;

import java.time.LocalDate;

/**
 * Clase Bibliotecario que representa a un bibliotecario en la biblioteca,
 * incluyendo sus datos personales y de empleo.
 */
public class Bibliotecario {
    private String nombre; // Nombre del bibliotecario
    private String id; // ID del bibliotecario
    private String email; // Correo electrónico del bibliotecario
    private int telefono; // Teléfono del bibliotecario
    private double salario; // Salario del bibliotecario
    private LocalDate fechaContratacion; // Fecha de contratación

    /**
     * Constructor de Bibliotecario.
     * 
     * @param nombre Nombre del bibliotecario
     * @param id ID del bibliotecario
     * @param email Correo electrónico del bibliotecario
     * @param telefono Teléfono del bibliotecario
     * @param salario Salario del bibliotecario
     * @param fechaContratacion Fecha de contratación
     */
    public Bibliotecario(String nombre, String id, String email, int telefono, double salario, LocalDate fechaContratacion) {
        this.nombre = nombre;
        this.id = id;
        this.email = email;
        this.telefono = telefono;
        this.salario = salario;
        this.fechaContratacion = fechaContratacion;
    }

    /**
     * Devuelve una representación en cadena del bibliotecario.
     * 
     * @return Información del bibliotecario
     */
    @Override
    public String toString() {
        return "Bibliotecario: " + nombre + " - ID: " + id;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }
}