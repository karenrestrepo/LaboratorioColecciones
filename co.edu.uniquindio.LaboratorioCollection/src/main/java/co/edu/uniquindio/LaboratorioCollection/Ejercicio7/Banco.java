package co.edu.uniquindio.LaboratorioCollection.Ejercicio7;

import java.util.LinkedList;

public class Banco {

   private  LinkedList<String> colaDeEspera;


    public Banco() {
        this.colaDeEspera = new LinkedList<>();
    }

    public LinkedList<String> getColaDeEspera() {
        return colaDeEspera;
    }


    public void agregarCliente(String cliente){
        colaDeEspera.add(cliente);
    }

    public void atenderPrimeroLista(){
        if(!colaDeEspera.isEmpty()){
            String primerCliente = colaDeEspera.removeFirst();

        }else{
            System.out.println("No hay nadie en la cola ");
        }

    }

    public void agregarClienteUrgente(String cliente){

        colaDeEspera.addFirst(cliente);
        System.out.println("El cliente: " + cliente + "Fue agregado con urgencia");
    }

    public void mostarColaBanco(){
        if (!colaDeEspera.isEmpty()){
            System.out.println("Los clientes actuales son:" + '\n' + colaDeEspera);
        }else{
            System.out.println("No hay nadie en la cola ");
        }

    }
}
