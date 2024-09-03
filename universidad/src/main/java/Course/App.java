package Course;

public class App {
    public static void main(String[] args) {

        //Profesor
        Profesor profesor = new Profesor("Raul", "123", "Auxiliar");

        //Curso
        Curso curso = new Curso("Programación I", profesor);

        //Estudiantes
        Estudiante ana = new Estudiante("Ana", "Gomez", "1222", "r@", "3111", 30);

        Estudiante camila = new Estudiante("Camila", "Zapata", "1223", "r@", "3111", 30);

        //Agregar estudiantes al curso
        curso.agregarEstudiante(ana);
        curso.agregarEstudiante(camila);

        System.out.println(curso);

        //Nota definitiva
        System.out.println(curso.calcularNotaDefinitiva("1222", 1, 5, 2.6));
        System.out.println(curso.calcularNotaDefinitiva("1223", 5, 5, 4));

        //Eliminar estudiante
        curso.eliminarEstudiante("1222");

        //Estudiante estudiant3 = new Estudiante("Juliana", "Rivera", "1222", "r@", "3111", 30);
        System.out.println("Estudiante eliminado: " + curso);

        
    }
    
}


