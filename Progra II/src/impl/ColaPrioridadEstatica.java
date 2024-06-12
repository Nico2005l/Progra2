package impl;

import api.ColaPrioridadTDA;

public class ColaPrioridadEstatica implements ColaPrioridadTDA {
    int[] vector;
    int[] prioridades;
    int fin;

    @Override
    public void InicializarCola() {
        vector = new int[100];
        prioridades = new int[100];
        fin = 0;
    }

    @Override
    public boolean ColaVacia() {
        return(fin == 0);
    }

    @Override
    public void AcolarPrioridad(int x, int prioridad) {
        if (ColaVacia()){
            vector[fin] = x;
            prioridades[fin] = prioridad;
            fin++;
        }else{
            //Buscar posicion en la que ubicar elemento
            int index = 0;
            while (prioridad<=prioridades[index]){
                index++;
            }
            //Insertar segun Prioridad
            for (int i=fin; i>index; i--){
                vector[i]=vector[i-1];
                prioridades[i]=prioridades[i-1];
            }
            vector[index]=x;
            prioridades[index]=prioridad;
            fin++;
        }
    }
    @Override
    public void Desacolar() {
        fin--;
        for(int i = 0; i < fin; i++){
            vector[i] = vector[i+1];
        }
        for(int i = 0; i < fin; i++){
            prioridades[i] = prioridades[i+1];
        }
    }
    @Override
    public int Primero() {
        return vector[0];
    }
    @Override
    public int Prioridad() {
        return prioridades[0];
    }

}
