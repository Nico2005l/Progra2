package impl;

import api.ColaTDA;

public class ColaDinamica implements ColaTDA {

    Nodo primero;
    Nodo ultimo;

    @Override
    public void InicializarCola() {
        primero = null;
        ultimo = null;
    }

    @Override
    public boolean ColaVacia() {
        return (primero==null);
    }

    @Override
    public void Acolar(int x) {

        Nodo aux = new Nodo();
        if (this.ColaVacia()){
            aux.info = x;
            primero=aux;
            ultimo = aux;
        }else{
            aux.info= x;
            ultimo.sig =aux;
            ultimo=aux;
        }
    }

    @Override
    public void Desacolar() {
        primero = primero.sig;
        if (primero == null){
            ultimo = null;
        }
    }

    @Override
    public int Primero() {
        return primero.info;
    }


}
