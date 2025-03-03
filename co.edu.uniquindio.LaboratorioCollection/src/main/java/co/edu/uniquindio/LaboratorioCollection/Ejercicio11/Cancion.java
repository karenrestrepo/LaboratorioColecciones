package co.edu.uniquindio.LaboratorioCollection.Ejercicio11;

class Cancion {
    private String titulo;
    private String autor;

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cancion cancion = (Cancion) obj;
        return titulo.equals(cancion.titulo) && autor.equals(cancion.autor);
    }

    @Override
    public int hashCode() {
        return 31 * titulo.hashCode() + autor.hashCode();
    }

    @Override
    public String toString() {
        return "\"" + titulo + "\" por " + autor;
    }
}
