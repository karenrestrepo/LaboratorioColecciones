package co.edu.uniquindio.LaboratorioCollection.Ejercicio5;

public class Main5 {

    public static void main(String[] args) {

        MapaHashMap mapaHashMap = new MapaHashMap();
        MapaLinkedHashMap mapaLinkedHashMap = new MapaLinkedHashMap();
        MapaTreeMap mapaTreeMap = new MapaTreeMap();

        // imprimir los productos de cada mapa
        mapaHashMap.imprimirHashMap(mapaHashMap.crearHashMap());
        mapaLinkedHashMap.imprimirLinkedHasMap(mapaLinkedHashMap.crearLinkedHasMap());
        mapaTreeMap.imprimirTreeMap(mapaTreeMap.crearTreeMap());


        // Al ejecutar el programa se pude observar que HashMap, imprime sin un orden especifico,
        // LinkedHashMap ordena por inserción lo que signidica que imprime de la manera que fueron agregados y
        // TreeMap ordena de manera natura un ejemplo de ello es que las frutas las ordena alfabeticamente






    }
}
