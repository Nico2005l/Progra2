package api;

public interface ConjuntoTDA {
    void InicializarConjunto();
    boolean ConjuntoVacio();// siempre que el conjunto este incializado
    void Agregar(int x);// siempre que el conjunto este incializado
    int Elegir();// siempre que el conjunto este incializado y no este vacio
    void Sacar(int x);// siempre que el conjunto este incializado y no este vacio
    boolean Pertenece(int x);// siempre que el conjunto este incializado

}
