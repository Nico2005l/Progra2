package impl;

import api.ColaTDA;

public class ColaEstatica implements ColaTDA {

    int[] vector;
    int fin;
    @Override
    public void InicializarCola() {
        vector = new int[100];
        fin = 0;

    }

    @Override
    public boolean ColaVacia() {
        return(fin == 0);
    }

    @Override
    public void Acolar(int x) {
        
        vector[fin] = x;
        fin++;
    }

    @Override
    public void Desacolar() {
        fin--;
        for(int i = 0; i < fin; i++){
            vector[i] = vector[i+1];
        }
        
    }

    @Override
    public int Primero() {
        return vector[0];
    }



}
