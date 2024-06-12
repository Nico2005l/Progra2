package api;

public interface ListaPromediadaTDA {

    void Inicializar();

    void Agregar(int x);//Con Lista Inicializada

    void Eliminar(int x);//Con Lista Inicializada

    float Promedio();//Con Lista Inicializada y no vacia

    ColaTDA Menores();//Con Lista Inicializada y no vacia

    ColaTDA Mayores();//Con Lista Inicializada y no vacia

    boolean estaVacia();//Con Lista Inicializada


}
