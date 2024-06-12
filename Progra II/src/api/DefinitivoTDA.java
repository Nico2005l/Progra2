package api;

public interface DefinitivoTDA {

    void Inicializar();
    void Agregar(int x, int y);
    //solo agregara elementos que no esten
    void Eliminar(int x);
    boolean EstaVacio();
    int Contar();
    float Sumar();
    float Promediar();
    void ImprimirMenorAMayor();
    void ImprimirMayorAMenor();
    ConjuntoTDA Claves();
    ListaTDA Valores();

}
