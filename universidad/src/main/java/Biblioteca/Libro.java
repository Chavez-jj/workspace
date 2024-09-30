package Biblioteca;

import java.time.LocalDate;

/**
 * Clase Libro que representa un libro en la biblioteca,
 * incluyendo su información bibliográfica y disponibilidad.
 */
public class Libro {
    private String codigo; // Código del libro
    private String isbn; // ISBN del libro
    private String autor; // Autor del libro
    private String titulo; // Título del libro
    private String editorial; // Editorial del libro
    private int copiasDisponibles; // Cantidad de copias disponibles
    private LocalDate fechaPublicacion; // Fecha de publicación del libro

    /**
     * Constructor de Libro.
     * 
     * @param codigo Código del libro
     * @param isbn ISBN del libro
     * @param autor Autor del libro
     * @param titulo Título del libro
     * @param editorial Editorial del libro
     * @param copiasDisponibles Cantidad de copias disponibles
     * @param fechaPublicacion Fecha de publicación del libro
     */
    public Libro(String codigo, String isbn, String autor, String titulo, String editorial, int copiasDisponibles, LocalDate fechaPublicacion) {
        this.codigo = codigo;
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
        this.copiasDisponibles = copiasDisponibles;
        this.fechaPublicacion = fechaPublicacion;
    }

    // Getters y setters para los atributos

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public void setCopiasDisponibles(int copiasDisponibles) {
        this.copiasDisponibles = copiasDisponibles;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
}