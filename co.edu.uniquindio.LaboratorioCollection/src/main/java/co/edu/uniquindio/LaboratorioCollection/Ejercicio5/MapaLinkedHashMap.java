package co.edu.uniquindio.LaboratorioCollection.Ejercicio5;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapaLinkedHashMap {

    public Map<String, Double> crearLinkedHasMap(){

        Map<String, Double> productosLinkedHasMap = new LinkedHashMap<>();
        productosLinkedHasMap.put("Fresa ", 1.500);
        productosLinkedHasMap.put("Mango ", 2.500);
        productosLinkedHasMap.put("Lulo ", 1.000);
        productosLinkedHasMap.put("Cereza ", 1.200);
        return productosLinkedHasMap;
    }

    public void imprimirLinkedHasMap(Map<String, Double> productosLinkedHasMap){
        System.out.println(" Productos guardados en LinkedHasMap  imprimen con un orden de inserción "+ '\n'+
                " osea de la manera que estos son agregados o insertados: " + '\n' +productosLinkedHasMap );
    }
}
