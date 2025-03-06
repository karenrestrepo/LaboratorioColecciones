package co.edu.uniquindio.LaboratorioCollection.Ejercicio5;

import java.util.Map;
import java.util.TreeMap;

public class MapaTreeMap {

    public Map<String, Double> crearTreeMap(){

        Map<String, Double> productosTreeMap = new TreeMap<>();
        productosTreeMap.put("Fresa ", 1.500);
        productosTreeMap.put("Mango ", 2.500);
        productosTreeMap.put("Lulo ", 1.000);
        productosTreeMap.put("Cereza ", 1.200);
        return productosTreeMap;
    }

    public void imprimirTreeMap (Map<String, Double> productosTreeMap){
        System.out.println(" Productos guardados en TreeMap  imprimen con un orden natural: " + '\n' + productosTreeMap );
    }
}
