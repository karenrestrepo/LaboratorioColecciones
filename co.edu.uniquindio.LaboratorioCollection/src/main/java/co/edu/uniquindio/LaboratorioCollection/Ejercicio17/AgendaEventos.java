package co.edu.uniquindio.LaboratorioCollection.Ejercicio17;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private TreeMap<Date, String> eventos;
    public AgendaEventos() {
        eventos = new TreeMap<>();
    }

    public void agregarEvento(String fechaStr, String evento) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        try {
            Date fecha = sdf.parse(fechaStr);
            eventos.put(fecha, evento);
        } catch (ParseException e) {
            System.out.println("Error al parsear la fecha: " + e.getMessage());
        }
    }

    public void mostrarEventos() {
        for (Map.Entry<Date, String> entry : eventos.entrySet()) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            System.out.println("Fecha: " + sdf.format(entry.getKey()) + " | Evento: " + entry.getValue());
        }
    }

    public void mostrarProximoEvento() {
        Map.Entry<Date, String> proximoEvento = eventos.firstEntry();
        if (proximoEvento != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            System.out.println("Próximo evento: " + sdf.format(proximoEvento.getKey()) + " | Evento: " + proximoEvento.getValue());
        } else {
            System.out.println("No hay eventos programados.");
        }
    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();

        agenda.agregarEvento("05/03/2025 09:00", "Reunión de trabajo");
        agenda.agregarEvento("06/04/2025 14:00", "Cita con el dentista");
        agenda.agregarEvento("20/03/2025 18:30", "Cena con amigos");
        agenda.agregarEvento("04/03/2025 10:00", "Llamada de conferencia");

        System.out.println("Todos los eventos programados:");
        agenda.mostrarEventos();

        System.out.println("\nPróximo evento:");
        agenda.mostrarProximoEvento();
    }
}

