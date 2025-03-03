package co.edu.uniquindio.LaboratorioCollection.Ejercicio15;

import java.util.HashMap;
import java.util.Map;

public class DirectorioTelefonico {
    private Map<String, String> directorio = new HashMap<>();

    public void agregarContacto(String nombre, String telefono) {
        directorio.put(nombre, telefono);
    }

    public String buscarContacto(String nombre) {
        return directorio.getOrDefault(nombre, "Contacto no encontrado");
    }

    public void mostrarContactos() {
        System.out.println("Directorio Telefónico:");
        for (Map.Entry<String, String> entry : directorio.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        DirectorioTelefonico directorio = new DirectorioTelefonico();

        directorio.agregarContacto("Juan", "123456789");
        directorio.agregarContacto("María", "987654321");
        directorio.agregarContacto("Pedro", "456789123");

        System.out.println("Teléfono de María: " + directorio.buscarContacto("María"));
        System.out.println("Teléfono de Ana: " + directorio.buscarContacto("Ana"));

        directorio.mostrarContactos();
    }
}
