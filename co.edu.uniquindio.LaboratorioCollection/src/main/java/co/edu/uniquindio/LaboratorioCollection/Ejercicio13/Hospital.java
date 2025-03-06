package co.edu.uniquindio.LaboratorioCollection.Ejercicio13;

import java.util.PriorityQueue;

public class Hospital {

    private PriorityQueue<Paciente> colaPacientes  = new PriorityQueue<>();



    public void agregarPaciente(Paciente paciente){

        colaPacientes.add(paciente);

    }

    public PriorityQueue<Paciente> getCola() {
        return colaPacientes;
    }

}
