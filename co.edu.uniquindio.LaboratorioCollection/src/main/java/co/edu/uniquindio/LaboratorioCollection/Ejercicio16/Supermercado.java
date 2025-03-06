package co.edu.uniquindio.LaboratorioCollection.Ejercicio16;

import java.util.LinkedHashMap;
import java.util.Map;

public class Supermercado {

    private Map<String, Double> productos;

    public Supermercado() {
        this.productos = new LinkedHashMap<>();
    }

    public void agregarProducto(String nombreProducto, double precio){
        productos.put(nombreProducto,precio);
    }

    public double calcularElTotal(){
        double total = 0;
        for (double precio: productos.values()){
            total += precio;

        }
        return total;
    }

    public void mostrarProductos() {
        System.out.println("Productos comprados:");

        for (Map.Entry<String, Double> producto : productos.entrySet()) {
            System.out.println(producto.getKey() + ": $" + producto.getValue());
        }
    }

    public void crearFactura(){
        mostrarProductos();
        System.out.println( '\n'+ "El total a pagar es: "+ calcularElTotal() );
    }





}
