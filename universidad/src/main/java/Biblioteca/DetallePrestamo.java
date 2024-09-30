package Biblioteca;

/**
 * Clase DetallePrestamo que representa un detalle de un préstamo de libro,
 * incluyendo el libro y su costo asociado.
 */
public class DetallePrestamo {
    private Libro libro;  // El libro asociado al detalle del préstamo
    private double costo;  // El costo del libro

    /**
     * Constructor de DetallePrestamo.
     * 
     * @param libro El libro asociado al préstamo
     * @param costo El costo del libro
     */
    public DetallePrestamo(Libro libro, double costo) {
        this.libro = libro;
        this.costo = costo;
    }

    // Getters y setters para los atributos

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    /**
     * Devuelve una representación en cadena del detalle del préstamo.
     * 
     * @return Información del detalle del préstamo
     */
    @Override
    public String toString() {
        return "DetallePrestamo{" +
                "libro=" + libro.getTitulo() + // Asumiendo que tienes un método getTitulo()
                ", costo=" + costo +
                '}';
    }
}

