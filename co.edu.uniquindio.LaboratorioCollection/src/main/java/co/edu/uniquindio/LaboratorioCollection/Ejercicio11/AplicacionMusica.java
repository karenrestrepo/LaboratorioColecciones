package co.edu.uniquindio.LaboratorioCollection.Ejercicio11;
import java.util.LinkedHashSet;

public class AplicacionMusica {
    private LinkedHashSet<Cancion> cancionesFavoritas;

    public AplicacionMusica() {
        cancionesFavoritas = new LinkedHashSet<>();
    }

    public static void main(String[] args) {
        AplicacionMusica app = new AplicacionMusica();
        Cancion cancion1 = new Cancion("Shape of You", "Ed Sheeran");
        Cancion cancion2 = new Cancion("Mi suerte", "Morat");
        Cancion cancion3 = new Cancion("Lose you to love me", "Selena Gomez");

        app.agregarCancion(cancion1);
        app.agregarCancion(cancion2);
        app.agregarCancion(cancion3);

        Cancion cancionDuplicada = new Cancion("Shape of You", "Ed Sheeran");
        app.agregarCancion(cancionDuplicada);

        app.mostrarCancionesFavoritas();
    }

    public void agregarCancion(Cancion cancion) {
        if (cancionesFavoritas.add(cancion)) {
            System.out.println("Canción añadida a favoritos: " + cancion);
        } else {
            System.out.println("La canción ya está en favoritos.");
        }
    }

    public void mostrarCancionesFavoritas() {
        if (cancionesFavoritas.isEmpty()) {
            System.out.println("No tienes canciones favoritas.");
        } else {
            System.out.println("Canciones favoritas:");
            for (Cancion cancion : cancionesFavoritas) {
                System.out.println(cancion);
            }
        }
    }

}
