package co.edu.uniquindio.LaboratorioCollection.Ejercicio1;

import java.util.TreeSet;

public class Empresa {

    TreeSet<Producto> productos = new TreeSet<>();


    public void agregarProducto(Producto producto){

        productos.add(producto);
    }
    public Producto buscarCodigo(String  codigo){
        for (Producto producto  : productos){
            if (producto.getCodigo().equals(codigo)){
                return producto;
            }
        }


        return null;
    }




}
