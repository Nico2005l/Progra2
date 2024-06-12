package impl;

import api.ColaPrioridadTDA;
import api.ConjuntoTDA;
import api.DefinitivoTDA;
import api.ListaTDA;

public class DefinitivoDinamico implements DefinitivoTDA {

    NodoClaveValor primero;
    ConjuntoTDA conjuntoClaves;

    @Override
    public void Inicializar() {
        primero = null;
        conjuntoClaves = new ConjuntoDinamico();
        conjuntoClaves.InicializarConjunto();
    }

    @Override
    public void Agregar(int x, int y) {
        NodoClaveValor aux = new NodoClaveValor();
            aux.clave = x;
            aux.valor = y;
            aux.sig = null;
        if (primero==null){
            primero = aux;
            conjuntoClaves.Agregar(x);
        }
        else if (!conjuntoClaves.Pertenece(x)){
            aux.sig = primero;
            primero = aux;
            conjuntoClaves.Agregar(x);
        }
        
    }
    

    @Override
    public void Eliminar(int x) {
        if (conjuntoClaves.Pertenece(x)){
            if (primero.clave==x){
                primero = primero.sig;
                conjuntoClaves.Sacar(x);
            }else{
                NodoClaveValor aux = primero;
                while (aux.sig.sig!=null && aux.sig.clave!=x){
                    aux = aux.sig;
                }

                if (aux.sig.clave==x){
                    aux.sig = aux.sig.sig;
                    conjuntoClaves.Sacar(x);
                }
            }
        }
    }

    @Override
    public boolean EstaVacio() {
        return (primero==null);
    }

    @Override
    public int Contar() {
        NodoClaveValor aux = primero;
        int cont = 0;

        while (aux!=null){
            cont++;
            aux = aux.sig;
        }

        return cont;
    }

    @Override
    public float Sumar() {
        NodoClaveValor aux = primero;
        float sum = 0;

        while (aux!=null){
            sum+= aux.valor;
            aux = aux.sig;
        }

        return sum;
    }

    @Override
    public float Promediar() {
        return (Sumar()/Contar());
    }

    @Override
    public void ImprimirMenorAMayor() {
        NodoClaveValor aux = primero;
        ColaPrioridadTDA c1 = new ColaPrioridadDinamica();
        c1.InicializarCola();
        while(aux!=null){

            c1.AcolarPrioridad(aux.clave, -aux.valor);
            aux = aux.sig;

        }

        while (!c1.ColaVacia()){
            System.out.println(c1.Primero());
            c1.Desacolar();
        }
    }

    @Override
    public void ImprimirMayorAMenor() {
        NodoClaveValor aux = primero;
        ColaPrioridadTDA c1 = new ColaPrioridadDinamica();
        c1.InicializarCola();
        while(aux!=null){

            c1.AcolarPrioridad(aux.clave, aux.valor);
            aux = aux.sig;

        }

        while (!c1.ColaVacia()){
            System.out.println(c1.Primero());
            c1.Desacolar();
        }
    }

    @Override
    public ConjuntoTDA Claves() {
        return conjuntoClaves;
    }

    @Override
    public ListaTDA Valores() {
        ListaTDA l1 = new ListaDinamica();
        l1.inicializarLista();
        NodoClaveValor aux = primero;

        while(aux!=null){

            l1.append(aux.valor);
            aux = aux.sig;

        }
        return l1;
    }

}
