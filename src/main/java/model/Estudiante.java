package model;

public class Estudiante{

    private String nombre;
    private Integer codigo;
    private String apellido;
    private String carrera;

    public Estudiante(Integer codigo, String nombre, String apellido, String carrera) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public boolean buscar(Integer identificador) {
        return this.codigo.equals(identificador);
    }

    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) return true;
        if (objeto == null || !(objeto instanceof Estudiante)) return false;
        Estudiante otroEstudiante = (Estudiante) objeto;
        return codigo.equals(otroEstudiante.codigo);
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", carrera" + carrera + '\'' +
                '}';
    }
}
