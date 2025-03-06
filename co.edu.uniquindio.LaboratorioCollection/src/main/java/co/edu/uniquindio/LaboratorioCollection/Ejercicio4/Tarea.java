package co.edu.uniquindio.LaboratorioCollection.Ejercicio4;

public class Tarea implements Comparable<Tarea> {


    private int prioridad;
    private String  nombreTarea;

    public Tarea(int prioridad, String nombreTarea) {
        this.prioridad = prioridad;
        this.nombreTarea = nombreTarea;
    }

    @Override
    public int compareTo(Tarea o) {
        return  Integer.compare(this.prioridad, o.getPrioridad() );

    }

    public int getPrioridad() {
        return prioridad;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    @Override
    public String toString() {
        return "Tarea{" + "nombre = '" + nombreTarea + '\'' + ", prioridad = " + prioridad + '}';
    }
}
