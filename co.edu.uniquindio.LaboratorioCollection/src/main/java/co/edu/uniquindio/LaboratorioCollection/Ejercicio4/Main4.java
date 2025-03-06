package co.edu.uniquindio.LaboratorioCollection.Ejercicio4;

public class Main4 {

    public static void main(String[] args) {


        Tarea tarea1 = new Tarea(2, "Tarea 1");
        Tarea tarea2 = new Tarea(1, "Tarea 2");
        Tarea tarea3 = new Tarea(5, "Tarea 3");
        Tarea tarea4 = new Tarea(3, "Tarea 4");
        Tarea tarea5 = new Tarea(2, "Tarea 5");


        ColaTareas cola = new ColaTareas();

        cola.agregarTarea(tarea1);
        cola.agregarTarea(tarea2);
        cola.agregarTarea(tarea3);
        cola.agregarTarea(tarea4);
        cola.agregarTarea(tarea5);

        while (!cola.getCola().isEmpty()) {
            Tarea tarea = cola.getCola().poll();
            System.out.println(tarea);

        }
    }
}
