package api;

public interface HeapTDA {
    void InicializarHeap();
    void Agregar(int x);
    void Sacar();
    int Primero();
    boolean HeapVacio();
}
