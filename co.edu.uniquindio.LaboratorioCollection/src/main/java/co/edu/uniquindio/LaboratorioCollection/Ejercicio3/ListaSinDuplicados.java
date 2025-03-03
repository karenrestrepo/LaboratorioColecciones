package co.edu.uniquindio.LaboratorioCollection.Ejercicio3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ListaSinDuplicados {
    public static void main(String[] args) {
        Set<String> elementos = new HashSet<>();

        elementos.add("Manzana");
        elementos.add("Banana");
        elementos.add("Cereza");
        elementos.add("Manzana");

        System.out.println("Elementos en la lista:");
        Iterator<String> iterator = elementos.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
