package model;

public class Ciudadano {
    private String cedula;
    private String nombre;
    private String apellido;

    public Ciudadano(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public boolean buscar(String identificador) {
        return this.cedula.equals(identificador);
    }

    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) return true;
        if (objeto == null || !(objeto instanceof Ciudadano)) return false;
        Ciudadano otroCiudadano = (Ciudadano) objeto;
        return cedula.equals(otroCiudadano.cedula);
    }

    @Override
    public String toString() {
        return "Ciudadano{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}