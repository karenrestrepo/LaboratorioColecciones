package co.edu.uniquindio.LaboratorioCollection.Ejercicio6;

class Producto {
    String codigo;
    String nombre;
    double precio;

    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nombre: " + nombre + ", Precio: " + precio;
    }
}

