package api;

public interface ColaPrioridadTDA {
    void InicializarCola();/** Sin pre condición */
    boolean ColaVacia();/** Pila inicializada */
    void AcolarPrioridad(int x, int prioridad);/** Pila inicializada */
    void Desacolar();/** Pila inicializada y con elementos */
    int Primero();/** Pila inicializada y con elementos */
    int Prioridad();/** Pila inicializada y con elementos */

}
