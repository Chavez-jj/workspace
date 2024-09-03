package Course;

public class Profesor {
    private String nombre;
    private String cedula;
    private String categoria;

    public Profesor(String nombre, String cedula, String categoria){
        this.nombre=nombre;
        this.cedula=cedula;
        this.categoria=categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Profesor [nombre=" + nombre + "]";
    }

    

    
}

