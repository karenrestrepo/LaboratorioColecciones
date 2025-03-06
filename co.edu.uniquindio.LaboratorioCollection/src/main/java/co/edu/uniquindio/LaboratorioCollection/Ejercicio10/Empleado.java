package co.edu.uniquindio.LaboratorioCollection.Ejercicio10;

public class Empleado  {

    private String nombre;
    private String codigo;

    public Empleado(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }


    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
}
