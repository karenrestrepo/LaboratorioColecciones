package co.edu.uniquindio.LaboratorioCollection.Ejercicio10;

import java.util.HashSet;

public class Edificio {

    private HashSet<String> codigosDeAccesos;

    public Edificio() {
        this.codigosDeAccesos = new HashSet<>();
    }

    public boolean permitirAcceso(Empleado empleado) {

        if (codigosDeAccesos.contains(empleado.getCodigo())) {
            System.out.println("Acceso denegado: El empleado con ID " + empleado.getCodigo() + " ya ingresó.");
            return false;
        } else {

            codigosDeAccesos.add(empleado.getCodigo());
            System.out.println("Acceso permitido al empleado con ID " + empleado.getCodigo());
            return true;
        }
    }

    public HashSet<String> getCodigosDeAccesos() {
        return codigosDeAccesos;
    }
}
