package co.edu.uniquindio.LaboratorioCollection.Ejercicio16;

public class Main16 {

    public static void main(String[] args) {

        Supermercado supermercado = new Supermercado();
        supermercado.agregarProducto("Leche", 3000.0);
        supermercado.agregarProducto("Arroz", 1500.0);
        supermercado.agregarProducto("Aceite", 5000.0);
        supermercado.agregarProducto("Sal", 1000.0);
        supermercado.agregarProducto("Panal de Huevos", 17000.0);

        supermercado.calcularElTotal();
        supermercado.crearFactura();


    }
}
