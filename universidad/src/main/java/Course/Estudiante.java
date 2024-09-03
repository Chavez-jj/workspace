package Course;

public class Estudiante {
    public String nombre;
    public String apellido;
    public String numeroIdentificacion;
    public String correo;
    public String telefono;
    public int edad;
    public double nota1, nota2, nota3;

    public Estudiante(String nombre, String apellido, String numeroIdentificacion, String correo, String telefono, int edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.numeroIdentificacion=numeroIdentificacion;
        this.correo=correo;
        this.telefono=telefono;
        this.edad=edad;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", numeroIdentificacion="
                + numeroIdentificacion + ", correo=" + correo + ", telefono=" + telefono + ", edad=" + edad + "]";
    }


    
    
    

    
}

