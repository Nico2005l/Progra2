package api;

public interface ColaTDA {
    void InicializarCola();/** Sin pre condición */
    boolean ColaVacia();/** Pila inicializada */
    void Acolar(int x);/** Pila inicializada */
    void Desacolar();/** Pila inicializada y con elementos */
    int Primero();/** Pila inicializada y con elementos */

}
