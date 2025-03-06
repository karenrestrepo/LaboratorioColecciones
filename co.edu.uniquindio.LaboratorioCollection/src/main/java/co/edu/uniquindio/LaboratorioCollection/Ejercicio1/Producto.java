package co.edu.uniquindio.LaboratorioCollection.Ejercicio1;

public class Producto implements Comparable<Producto>{

    private String codigo;

    public Producto(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }


    @Override
    public int compareTo(Producto o) {
        return codigo.compareTo(o.getCodigo());
    }
}
