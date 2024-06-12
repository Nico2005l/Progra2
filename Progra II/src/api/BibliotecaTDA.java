package api;

public interface BibliotecaTDA {
    void agregarLibro(int id, String autor, String titulo, int año);
    void eliminarLibro(int titulo);
    String buscarLibro(int titulo);
    void listarLibros();
    int contarLibros();
    void InicializarBiblioteca ();

}
