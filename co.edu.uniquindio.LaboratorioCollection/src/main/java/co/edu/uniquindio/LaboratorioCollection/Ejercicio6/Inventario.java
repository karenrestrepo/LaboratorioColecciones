package co.edu.uniquindio.LaboratorioCollection.Ejercicio6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Inventario {
    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(String codigo) {
        productos.removeIf(p -> p.codigo.equals(codigo));
    }

    public Producto buscarProducto(String codigo) {
        for (Producto p : productos) {
            if (p.codigo.equals(codigo)) {
                return p;
            }
        }
        return null;
    }

    public void listarInventarioPorNombre() {
        productos.sort(Comparator.comparing(p -> p.nombre));
        productos.forEach(System.out::println);
    }

    public void listarInventarioPorPrecio() {
        productos.sort(Comparator.comparingDouble(p -> p.precio));
        productos.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        inventario.agregarProducto(new Producto("001", "Laptop", 1200.50));
        inventario.agregarProducto(new Producto("002", "Mouse", 25.75));
        inventario.agregarProducto(new Producto("003", "Teclado", 45.99));

        System.out.println("Inventario ordenado por nombre:");
        inventario.listarInventarioPorNombre();

        System.out.println("\nInventario ordenado por precio:");
        inventario.listarInventarioPorPrecio();
    }
}
