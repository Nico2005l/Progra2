package impl;

import api.AlumnoTDA;
import api.ColaPrioridadTDA;
import api.ConjuntoTDA;
import api.ListaTDA;

public class AlumnoDinamico implements AlumnoTDA {

    NodoAlumno primero;

    ConjuntoTDA conjuntoID;

    @Override
    public void Inicializar() {
       primero = null;
       conjuntoID = new ConjuntoDinamico();
       conjuntoID.InicializarConjunto();
    }

    @Override
    public void EliminarID(int x) {
        if(primero.info == x){
            primero = primero.sig;
        }else{
            NodoAlumno aux = primero;
            while(aux.sig != null && aux.sig.info != x){
                aux = aux.sig;
            }
            aux.sig = aux.sig.sig;
        }
    }

    @Override
    public void EliminarNota(int id, int x) {
        NodoAlumno aux = primero;
        while (aux.info!=id){
            aux=aux.sig;
        }
        aux.notas.remove(x);

    }

    @Override
    public void Cargar(int x, int y) {
        if (primero==null){
            NodoAlumno aux = new NodoAlumno();
            aux.info = x;
            aux.notas = new ListaDinamica();
            aux.sig = null;
            aux.notas.inicializarLista();
            aux.notas.append(y);
            primero = aux;
            conjuntoID.Agregar(x);

        }else if (!conjuntoID.Pertenece(x)){
            NodoAlumno aux = new NodoAlumno();
            aux.info = x;
            aux.notas = new ListaDinamica();
            aux.sig = null;
            aux.notas.inicializarLista();
            aux.notas.append(y);;
            aux.sig = primero;
            primero = aux;
            conjuntoID.Agregar(x);

        }else if (conjuntoID.Pertenece(x)){
            NodoAlumno aux2=primero;
            while (aux2.info!=x){
                aux2=aux2.sig;
            }
            aux2.notas.append(y);;
        }
    }

    @Override
    public ListaTDA VerNotas(int x) {
        NodoAlumno aux = primero;
        while (aux.sig != null && aux.info != x){
            aux = aux.sig;
        }
        return aux.notas;
    }

    @Override
    public float Promedio(int x) {
        ListaTDA notasAlumno = this.VerNotas(x);
        int cont = 0;
        float sum = 0;
        while (!notasAlumno.listaVacia()){
            notasAlumno.pop();
            cont++;
        }
        notasAlumno = this.VerNotas(x);
        for (int i =0; i<cont; i++){
            sum+=notasAlumno.recuperarPos(i);
        }
        return sum;
    }

    @Override
    public boolean Aprobo(int x) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Aprobo'");
    }

    @Override
    public ConjuntoTDA Alumnos() {
        return conjuntoID;
    }

    
}
