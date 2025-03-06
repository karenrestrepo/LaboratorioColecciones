package co.edu.uniquindio.LaboratorioCollection.Ejercicio1;

public class Main1 {

    public static void main(String[] args) {

        Empresa empresa = new Empresa();

        Producto producto1 = new Producto("AB12");
        Producto producto2 = new Producto("BC13");
        Producto producto3 = new Producto("AA22");
        Producto producto4 = new Producto("AB12");

        empresa.agregarProducto(producto1);
        empresa.agregarProducto(producto2);
        empresa.agregarProducto(producto3);
        empresa.agregarProducto(producto4);

        Producto productoBuscado = empresa.buscarCodigo("AB12");

        if (productoBuscado != null) {
            System.out.println(" El pruducto fue encontrado " + productoBuscado.getCodigo());
        } else {
            System.out.println("Producto no fue encontrado ");
        }




    }
}
