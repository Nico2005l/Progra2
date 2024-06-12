package api;

public interface AlumnoTDA {
    void Inicializar();
    void EliminarID(int x);
    void EliminarNota(int id, int x);
    void Cargar(int x, int y);
    ListaTDA VerNotas(int x);
    float Promedio(int x);
    boolean Aprobo(int x);
    ConjuntoTDA Alumnos();

}
