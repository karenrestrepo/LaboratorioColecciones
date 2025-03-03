package co.edu.uniquindio.LaboratorioCollection.Ejercicio8;
import java.util.Scanner;
import java.util.Vector;

public class EditorTexto {

    private String texto;
    private Vector<String> historial;

    public EditorTexto() {
        texto = "";
        historial = new Vector<>();
    }

    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();
        Scanner scanner = new Scanner(System.in);
        String comando;

        while (true) {
            System.out.print("Ingrese nuevo texto o 'deshacer': ");
            comando = scanner.nextLine();

            if (comando.equals("deshacer")) {
                editor.deshacer();
            } else if (comando.equalsIgnoreCase("salir")) {
                System.out.println("Saliendo del editor...");
                break;
            } else {
                editor.realizarCambio(comando);
            }
        }

        scanner.close();
    }

    public void realizarCambio(String nuevoTexto) {
        historial.add(texto);
        texto = nuevoTexto;
        System.out.println("Cambio realizado: " + texto);
    }


    public void deshacer() {
        if (historial.isEmpty()) {
            System.out.println("No hay cambios para deshacer.");
        } else {
            texto = historial.remove(historial.size() - 1);
            System.out.println("Último cambio deshecho. Texto restaurado: " + texto);
        }
    }
}

