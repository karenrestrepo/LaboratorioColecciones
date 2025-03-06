package co.edu.uniquindio.LaboratorioCollection.Ejercicio5;

import java.util.HashMap;
import java.util.Map;

public class MapaHashMap {

    public Map<String, Double> crearHashMap(){

        Map<String, Double> productosHashMap = new HashMap<>();
        productosHashMap.put("Fresa ", 1.500);
        productosHashMap.put("Mango ", 2.500);
        productosHashMap.put("Manzana ", 2.500);
        productosHashMap.put("Lulo ", 1.000);
        productosHashMap.put("Cereza ", 1.200);
        return productosHashMap;
    }

    public void imprimirHashMap(Map<String, Double> productosHashMap){
        System.out.println(" Productos guardados en HashMap  imprimen sin orden: " + '\n' +productosHashMap );
    }
}
