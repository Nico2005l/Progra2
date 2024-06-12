package api;

public interface DiccionarioSimpleTDA {
    void InicializarDiccionario();
    void Agregar(int clave, int valor);//Con Diccionario Inicializado
    void Eliminar(int clave);//Con Diccionario Inicializado y con elementos
    int Recuperar(int clave);//Con Diccionario Inicializado y con elementos
    ConjuntoTDA Claves();//Con Diccionario Inicializado y con elementos
}


