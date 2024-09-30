package Biblioteca;

import java.time.LocalDate;

public class App {
    private static Biblioteca biblioteca;

    public static void main(String[] args) {
        biblioteca = new Biblioteca("Biblioteca Universitaria");

        // Inicializar bibliotecarios
        inicializarBibliotecarios();

        // Inicializar estudiantes
        inicializarEstudiantes();

        // Inicializar libros
        inicializarLibros();

        // Inicializar préstamos
        inicializarPrestamos();

        // Mostrar la información
        mostrarInformacion();
    }

    private static void inicializarBibliotecarios() {
        Bibliotecario bibliotecario1 = new Bibliotecario("Juan Pérez", "123456789", "juan@example.com", 123456789, 1500.0, LocalDate.of(2020, 1, 1));
        Bibliotecario bibliotecario2 = new Bibliotecario("Ana Gómez", "987654321", "ana@example.com", 987654321, 1600.0, LocalDate.of(2019, 6, 15));
        Bibliotecario bibliotecario3 = new Bibliotecario("Luis Martínez", "456123789", "luis@example.com", 456123789, 1700.0, LocalDate.of(2021, 3, 10));
        Bibliotecario bibliotecario4 = new Bibliotecario("Sofía Torres", "321654987", "sofia@example.com", 321654987, 1800.0, LocalDate.of(2022, 5, 20));
        Bibliotecario bibliotecario5 = new Bibliotecario("María López", "654789321", "maria@example.com", 654789321, 1900.0, LocalDate.of(2023, 8, 25));
        
        biblioteca.agregarBibliotecario(bibliotecario1);
        biblioteca.agregarBibliotecario(bibliotecario2);
        biblioteca.agregarBibliotecario(bibliotecario3);
        biblioteca.agregarBibliotecario(bibliotecario4);
        biblioteca.agregarBibliotecario(bibliotecario5);
    }

    private static void inicializarEstudiantes() {
        Estudiante estudiante1 = new Estudiante("Carlos Martínez", "111222333", "carlos@example.com", 123456789, true);
        Estudiante estudiante2 = new Estudiante("Lucía Rodríguez", "444555666", "lucia@example.com", 987654321, true);
        Estudiante estudiante3 = new Estudiante("Javier Pérez", "777888999", "javier@example.com", 123456789, true);
        Estudiante estudiante4 = new Estudiante("Ana Castillo", "222333444", "ana@example.com", 987654321, true);
        Estudiante estudiante5 = new Estudiante("Santiago Ríos", "555666777", "santiago@example.com", 123456789, true);
        
        biblioteca.agregarEstudiante(estudiante1);
        biblioteca.agregarEstudiante(estudiante2);
        biblioteca.agregarEstudiante(estudiante3);
        biblioteca.agregarEstudiante(estudiante4);
        biblioteca.agregarEstudiante(estudiante5);
    }

    private static void inicializarLibros() {
        Libro libro1 = new Libro("L001", "978-3-16-148410-0", "Gabriel García Márquez", "Cien años de soledad", "Editorial XYZ", 5, LocalDate.of(1967, 5, 30));
        Libro libro2 = new Libro("L002", "978-3-16-148410-1", "J.K. Rowling", "Harry Potter y la piedra filosofal", "Editorial ABC", 3, LocalDate.of(1997, 6, 26));
        Libro libro3 = new Libro("L003", "978-3-16-148410-2", "Mario Vargas Llosa", "La ciudad y los perros", "Editorial DEF", 4, LocalDate.of(1963, 4, 28));
        Libro libro4 = new Libro("L004", "978-3-16-148410-3", "Gabriel García Márquez", "El amor en los tiempos del cólera", "Editorial GHI", 2, LocalDate.of(1985, 9, 5));
        Libro libro5 = new Libro("L005", "978-3-16-148410-4", "Julio Cortázar", "Rayuela", "Editorial JKL", 6, LocalDate.of(1963, 6, 4));
        Libro libro6 = new Libro("L006", "978-3-16-148410-5", "Isabel Allende", "La casa de los espíritus", "Editorial MNO", 5, LocalDate.of(1982, 6, 1));
        Libro libro7 = new Libro("L007", "978-3-16-148410-6", "Chimamanda Ngozi Adichie", "Americanah", "Editorial PQR", 4, LocalDate.of(2013, 5, 14));
        Libro libro8 = new Libro("L008", "978-3-16-148410-7", "Gabriel García Márquez", "Crónica de una muerte anunciada", "Editorial STU", 3, LocalDate.of(1981, 2, 6));
        Libro libro9 = new Libro("L009", "978-3-16-148410-8", "Laura Esquivel", "Como agua para chocolate", "Editorial VWX", 5, LocalDate.of(1989, 2, 6));
        Libro libro10 = new Libro("L010", "978-3-16-148410-9", "Gabriel García Márquez", "El otoño del patriarca", "Editorial YZ", 2, LocalDate.of(1975, 6, 1));
        // Agregar más libros si es necesario
        
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);
        biblioteca.agregarLibro(libro5);
        biblioteca.agregarLibro(libro6);
        biblioteca.agregarLibro(libro7);
        biblioteca.agregarLibro(libro8);
        biblioteca.agregarLibro(libro9);
        biblioteca.agregarLibro(libro10);
    }

    private static void inicializarPrestamos() {
        Bibliotecario bibliotecario1 = biblioteca.getBibliotecarios().get(0); 
        Estudiante estudiante1 = biblioteca.getEstudiantes().get(0); 
        LocalDate fechaPrestamo1 = LocalDate.of(2023, 9, 1);
        LocalDate fechaEntrega1 = LocalDate.of(2023, 9, 10);
        Prestamo prestamo1 = new Prestamo("0001", fechaPrestamo1, fechaEntrega1, bibliotecario1, estudiante1, 200.0);
        prestamo1.agregarLibro(biblioteca.buscarLibroPorCodigo("L001"), 5.0);
        biblioteca.agregarPrestamo(prestamo1);

        Bibliotecario bibliotecario2 = biblioteca.getBibliotecarios().get(1); 
        Estudiante estudiante2 = biblioteca.getEstudiantes().get(1); 
        LocalDate fechaPrestamo2 = LocalDate.of(2023, 9, 2);
        LocalDate fechaEntrega2 = LocalDate.of(2023, 9, 12);
        Prestamo prestamo2 = new Prestamo("0002", fechaPrestamo2, fechaEntrega2, bibliotecario2, estudiante2, 200.0);
        prestamo2.agregarLibro(biblioteca.buscarLibroPorCodigo("L002"), 3.0);
        biblioteca.agregarPrestamo(prestamo2);

        // Agrega más préstamos según sea necesario
    }

    private static void mostrarInformacion() {
        System.out.println("\n--- Datos de la Biblioteca ---");
        System.out.println(biblioteca);
        System.out.println("\n--- Total Recaudado: " + biblioteca.calcularTotalRecaudado());
        biblioteca.EstudianteConMasPrestamos();
        biblioteca.calcularTotalPagadoABibliotecarios();
    }
}
