package api;

public interface PilaTDA {
    void InicializarPila(); /** Sin pre condición */
    void Apilar (int x); /** Pila inicializada */
    void Desapilar ();/** Pila inicializada y con elementos */
    int Tope ();/** Pila inicializada y con elementos */
    boolean PilaVacia();/** Pila inicializada */
}
