package co.edu.uniquindio.LaboratorioCollection.Ejercicio14;

import java.util.ArrayDeque;
import java.util.Deque;

public class HistorialMensajes {
    private Deque<String> mensajes;
    private static final int MAX_MENSAJES = 10;
    public HistorialMensajes() {
        mensajes = new ArrayDeque<>();
    }


    public void agregarMensaje(String mensaje) {
        if (mensajes.size() == MAX_MENSAJES) {
            mensajes.poll();
        }
        mensajes.offer(mensaje);
    }

    public void mostrarMensajes() {
        System.out.println("Últimos " + MAX_MENSAJES + " mensajes:");
        for (String mensaje : mensajes) {
            System.out.println(mensaje);
        }
    }

    public static void main(String[] args) {
        HistorialMensajes historial = new HistorialMensajes();
        historial.agregarMensaje("Hola, ¿cómo te llamas?");
        historial.agregarMensaje("Me llamo Ana, ¿y tú?");
        historial.agregarMensaje("Soy Luis, un placer conocerte.");
        historial.agregarMensaje("Igualmente, ¿de dónde eres?");
        historial.agregarMensaje("Soy de Armenia, ¿y tú?");
        historial.agregarMensaje("Yo soy de Pijao.");
        historial.agregarMensaje("¡Qué bien! He ido una vez a Pijao.");
        historial.agregarMensaje("Sí, es un pueblo tranquilo.");
        historial.agregarMensaje("¿Qué te gusta hacer en tu tiempo libre?");
        historial.agregarMensaje("Me encanta leer y pasear por el parque.");

        historial.mostrarMensajes();

        historial.agregarMensaje("Yo disfruto mucho del cine.");
        historial.agregarMensaje("¡Yo también! ¿Cuál es tu película favorita?");

        historial.mostrarMensajes();
    }
}


