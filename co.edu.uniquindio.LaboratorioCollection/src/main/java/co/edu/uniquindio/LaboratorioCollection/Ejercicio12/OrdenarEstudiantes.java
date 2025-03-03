package co.edu.uniquindio.LaboratorioCollection.Ejercicio12;
import java.util.TreeSet;

public class OrdenarEstudiantes {
    public static void main(String[] args) {
        TreeSet<String> estudiantes = new TreeSet<>();

        estudiantes.add("Carlos");
        estudiantes.add("Ana");
        estudiantes.add("Pedro");
        estudiantes.add("Lucía");
        estudiantes.add("Beatriz");

        System.out.println("Lista de estudiantes ordenada:");
        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }

        System.out.println("\nPrimer estudiante: " + estudiantes.first());
        System.out.println("Último estudiante: " + estudiantes.last());
    }
}
