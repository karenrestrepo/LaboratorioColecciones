package co.edu.uniquindio.LaboratorioCollection.Ejercicio9;
import java.util.Stack;

public class NavegacionWeb {
    private Stack<String> historial = new Stack<>();

    public void visitarPagina(String url) {
        historial.push(url);
        System.out.println("Visitando: " + url);
    }

    public void retroceder() {
        if (historial.size() > 1) {
            historial.pop();
            System.out.println("Retrocediendo a: " + historial.peek());
        } else {
            System.out.println("No hay páginas anteriores.");
        }
    }

    public void mostrarHistorial() {
        System.out.println("Historial de navegación:");
        for (String pagina : historial) {
            System.out.println(pagina);
        }
    }

    public static void main(String[] args) {
        NavegacionWeb navegador = new NavegacionWeb();

        navegador.visitarPagina("www.google.com");
        navegador.visitarPagina("www.github.com");
        navegador.visitarPagina("www.stackoverflow.com");

        navegador.retroceder();
        navegador.retroceder();
        navegador.retroceder();

        navegador.mostrarHistorial();
    }
}

