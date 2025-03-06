package co.edu.uniquindio.LaboratorioCollection.Ejercicio13;

public class Paciente implements Comparable<Paciente>{


    private String nombre;
    private int prioridad;

    public Paciente(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    @Override
    public int compareTo(Paciente o) {
        return Integer.compare(this.prioridad,o.getPrioridad() );
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public String toString() {
        return "Paciente {" + "nombre = '" + nombre + '\'' + ", prioridad = " + prioridad + '}';
    }

}
