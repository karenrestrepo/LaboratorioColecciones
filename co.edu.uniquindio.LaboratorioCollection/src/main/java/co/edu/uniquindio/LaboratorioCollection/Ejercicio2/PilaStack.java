package co.edu.uniquindio.LaboratorioCollection.Ejercicio2;

import java.util.Stack;

public class PilaStack {
    private Stack<Object> pila = new Stack<>();

    public static void main(String[] args) {

        PilaStack pila = new PilaStack();
        pila.insertar(10);
        pila.insertar("Hola");
        pila.insertar(20);
        pila.insertar(100);

    }

    public boolean insertar(Object elemento) {
        if (pila.isEmpty()) {
            pila.push(elemento);
            System.out.println("Elemento '" + elemento + "' agregado a la pila");
            return true;
        } else {
            if (pila.peek().getClass().equals(elemento.getClass())) {
                pila.push(elemento);
                System.out.println("Elemento '" + elemento + "' agregado a la pila");
                return true;
            } else {
                System.out.println("Error: El tipo del objeto '" +elemento+ "' no coincide con el tipo en la cima de la pila");
                return false;
            }
        }
    }

}
