package Course;

import java.util.Collection;
import java.util.LinkedList;

public class Curso {

    private String nombre;
    private Profesor profesor;
    public Collection<Estudiante> estudiantes;

    /**
     * Metodo constructor de la clase curso
     * 
     * @param nombre
     * @param profesor
     */
    public Curso(String nombre, Profesor profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
        estudiantes = new LinkedList<>();
    }

    /*
     * Metodos que deben realizar
     * - calcularNotaDe(notas)
     */

    public void agregarEstudiante(Estudiante estudiante) {
        if (!verificarEstudiante(estudiante.getNumeroIdentificacion())) {
            estudiantes.add(estudiante);
        }
    }

    public boolean verificarEstudiante(String id) {
        boolean centinela = false;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNumeroIdentificacion().equals(id)) {
                centinela = true;
            }
        }
        return centinela;
    }

    public void eliminarEstudiante(String id) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNumeroIdentificacion().equals(id)) {
                estudiantes.remove(estudiante);
                break;
            }
        }
    }

    public double calcularNotaDefinitiva(String id, double nota1, double nota2, double nota3) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNumeroIdentificacion().equals(id)) {
                estudiante.setNota1(nota1);
                estudiante.setNota2(nota2);
                estudiante.setNota3(nota3);

                double definitiva = (nota1 + nota2 + nota3) / 3;
                return definitiva;
            }
        }
        return -1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Collection<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Collection<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return "Curso [nombre=" + nombre + ", profesor=" + profesor + ", estudiantes=" + estudiantes + "]";
    }
}