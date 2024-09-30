package Biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase Prestamo que representa un préstamo de libros en la biblioteca,
 * incluyendo información sobre el estudiante, el bibliotecario y los detalles del préstamo.
 */
public class Prestamo {
    private String codigo; // Código del préstamo
    private LocalDate fechaPrestamo; // Fecha en que se realizó el préstamo
    private LocalDate fechaEntrega; // Fecha en que debe entregarse el préstamo
    private Bibliotecario bibliotecario; // Bibliotecario que procesa el préstamo
    private Estudiante estudiante; // Estudiante que solicita el préstamo
    private double monto; // Monto total del préstamo
    private List<DetallePrestamo> detalles; // Detalles de los libros prestados

    /**
     * Constructor de Prestamo.
     * 
     * @param codigo Código del préstamo
     * @param fechaPrestamo Fecha en que se realizó el préstamo
     * @param fechaEntrega Fecha en que debe entregarse el préstamo
     * @param bibliotecario Bibliotecario que procesa el préstamo
     * @param estudiante Estudiante que solicita el préstamo
     * @param monto Monto total del préstamo (inicializado a 0)
     */
    public Prestamo(String codigo, LocalDate fechaPrestamo, LocalDate fechaEntrega,
                    Bibliotecario bibliotecario, Estudiante estudiante, double monto) {
        this.codigo = codigo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        this.bibliotecario = bibliotecario;
        this.estudiante = estudiante;
        this.monto = 0; // Inicializar monto a 0
        this.detalles = new ArrayList<>(); 
    }

    /**
     * Método para agregar un libro al préstamo.
     * 
     * @param libro Libro a agregar al préstamo
     * @param costo Costo del libro
     */
    public void agregarLibro(Libro libro, double costo) {
        DetallePrestamo detalle = new DetallePrestamo(libro, costo);
        detalles.add(detalle);
        this.monto = calcularMonto(); // Recalcular el monto total al agregar un libro
    }

    /**
     * Método privado para calcular el monto total del préstamo.
     * 
     * @return Monto total del préstamo
     */
    private double calcularMonto() {
        double total = 0;
        for (DetallePrestamo detalle : detalles) {
            total += detalle.getCosto(); // Asegúrate de que DetallePrestamo tenga un método getCosto()
        }
        return total;
    }

    // Getters y Setters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public List<DetallePrestamo> getDetalles() {
        return detalles;
    }

    /**
     * Método para representar el préstamo en forma de texto.
     * 
     * @return Representación en texto del préstamo
     */
    @Override
    public String toString() {
        return "Prestamo{" +
                "codigo='" + codigo + '\'' +
                ", fechaPrestamo=" + fechaPrestamo +
                ", fechaEntrega=" + fechaEntrega +
                ", bibliotecario=" + bibliotecario.getNombre() + // Asumiendo que tienes un método getNombre()
                ", estudiante=" + estudiante.getNombre() +
                ", monto=" + monto +
                ", detalles=" + detalles + // Puedes personalizar la representación de detalles
                '}';
    }
}