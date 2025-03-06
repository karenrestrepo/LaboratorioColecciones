package co.edu.uniquindio.LaboratorioCollection.Ejercicio4;

import java.util.PriorityQueue;

public class ColaTareas {

    private PriorityQueue<Tarea> cola  = new PriorityQueue<>();



    public void agregarTarea(Tarea tarea){

        cola.add(tarea);

    }

    public PriorityQueue<Tarea> getCola() {
        return cola;
    }


}
