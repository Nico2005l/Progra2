package api;

public interface DiccionarioMultipleTDA {
    void InicializarDiccionario();
    void Agregar(int clave, int valor); //Con Diccionario Inicializado
    void Eliminar(int clave);//Con Diccionario Inicializado y con elementos
    void EliminarValor(int clave, int valor);//Con Diccionario Inicializado y con elementos
    ConjuntoTDA Recuperar(int clave);//Con Diccionario Inicializado y con elementos
    ConjuntoTDA Claves();//Con Diccionario Inicializado y con elementos
}
