package Biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Biblioteca que gestiona libros, préstamos, bibliotecarios y estudiantes.
 */
public class Biblioteca {
    private String nombre; // Nombre de la biblioteca
    private List<Libro> libros; // Libros en la biblioteca
    private List<Prestamo> prestamos; // Préstamos realizados
    private List<Bibliotecario> bibliotecarios; // Bibliotecarios
    private List<Estudiante> estudiantes; // Estudiantes

    /**
     * Constructor de Biblioteca.
     * 
     * @param nombre Nombre de la biblioteca
     */
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
        this.prestamos = new ArrayList<>();
        this.bibliotecarios = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
    }

    // Getters y setters para nombre y listas

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    // Métodos para gestionar bibliotecarios y estudiantes

    public void setBibliotecarios(List<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    /**
     * Calcula el total pagado a bibliotecarios.
     * 
     * @return Total pagado
     */
    public double calcularTotalPagadoABibliotecarios() {
        double totalPagado = 0;
        for (Bibliotecario bibliotecario : bibliotecarios) {
            totalPagado += bibliotecario.getSalario(); 
        }
        return totalPagado; 
    }

    /**
     * Agrega un préstamo a la biblioteca.
     * 
     * @param prestamo El préstamo a agregar
     */
    public void agregarPrestamo(Prestamo prestamo) {
        this.prestamos.add(prestamo);
    }

    /**
     * Agrega un bibliotecario a la biblioteca.
     * 
     * @param bibliotecario El bibliotecario a agregar
     */
    public void agregarBibliotecario(Bibliotecario bibliotecario) {
        bibliotecarios.add(bibliotecario);
    }

    /**
     * Agrega un estudiante a la biblioteca.
     * 
     * @param estudiante El estudiante a agregar
     */
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    /**
     * Agrega un libro a la biblioteca.
     * 
     * @param libro El libro a agregar
     */
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    /**
     * Busca un libro por su código.
     * 
     * @param codigo El código del libro
     * @return El libro encontrado o null
     */
    public Libro buscarLibroPorCodigo(String codigo) {
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Crea un préstamo y lo agrega a la lista de préstamos.
     * 
     * @param prestamo El préstamo a crear
     */
    public void crearPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    /**
     * Muestra la lista de estudiantes.
     */
    public void mostrarEstudiantes() {
        System.out.println("--- Estudiantes ---");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }

    /**
     * Muestra los préstamos de un estudiante específico.
     * 
     * @param estudiante El estudiante cuyo préstamos mostrar
     */
    public void mostrarPrestamosPorEstudiante(Estudiante estudiante) {
        System.out.println("Préstamos de " + estudiante.getNombre() + ":");
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getEstudiante().equals(estudiante)) {
                System.out.println(prestamo);
            }
        }
    }

    /**
     * Devuelve el estudiante con más préstamos.
     * 
     * @return Estudiante con más préstamos
     */
    public Estudiante EstudianteConMasPrestamos() {
        Estudiante estudianteConMasPrestamos = null;
        int maxPrestamos = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCantidadPrestamos() > maxPrestamos) {
                maxPrestamos = estudiante.getCantidadPrestamos();
                estudianteConMasPrestamos = estudiante;
            }
        }
        return estudianteConMasPrestamos;
    }

    /**
     * Calcula el total recaudado por los préstamos.
     * 
     * @return Total recaudado
     */
    public double calcularTotalRecaudado() {
        double total = 0;
        for (Prestamo prestamo : prestamos) {
            total += prestamo.getDetalles().size() * 10; // Supone que cada libro prestado cuesta 10
        }
        return total;
    }

    // Getters de listas
    public List<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }
}