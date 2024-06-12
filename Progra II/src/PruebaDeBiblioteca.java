import api.BibliotecaTDA;
import impl.BibliotecaDinamica;

public class PruebaDeBiblioteca {
    public static void main(String[] args) {

        BibliotecaTDA biblioteca = new BibliotecaDinamica();
        biblioteca.InicializarBiblioteca();
        // Agregar libros
        biblioteca.agregarLibro(1, " Gabriel Garcia Marquez ", " Cien años de soledad", 1967);
        biblioteca.agregarLibro(2, " J.K. Rowling ", " Harry Potter y la piedra filosofal", 1997);
        biblioteca.agregarLibro(3, " George Orwell ", " 1984", 1949);

        biblioteca.eliminarLibro(2);
        
        biblioteca.listarLibros();

        

    }

}
