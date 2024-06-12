package algoritmos;

import api.PilaTDA;

import impl.PilaEstatica;

public class metodosPila {

    public static void pasarPila (PilaTDA origen, PilaTDA destino){
        PilaTDA aux = new PilaEstatica();
        aux.InicializarPila();

        while(!origen.PilaVacia()){
            aux.Apilar(origen.Tope());
            destino.Apilar(origen.Tope());
            origen.Desapilar();
        }

        while(!aux.PilaVacia()){
            origen.Apilar(aux.Tope());
            aux.Desapilar();
        }
    }

    public static void copiarPila (PilaTDA origen, PilaTDA destino){
        PilaTDA aux = new PilaEstatica();
        aux.InicializarPila();

        while(!origen.PilaVacia()){
            aux.Apilar(origen.Tope());
            origen.Desapilar();
        }

        while(!aux.PilaVacia()){
            origen.Apilar(aux.Tope());
            destino.Apilar(aux.Tope());
            aux.Desapilar();
        }
    }

    public static void invertirPila (PilaTDA origen){
        PilaTDA aux = new PilaEstatica();
        aux.InicializarPila();

        copiarPila(origen, aux);

        while (!origen.PilaVacia()) {
            origen.Desapilar();   
        }

        while(!aux.PilaVacia()){
            origen.Apilar(aux.Tope());
            aux.Desapilar();
        }
    }

    public static int contarElemPila (PilaTDA origen){

        int cont=0;

        PilaTDA aux = new PilaEstatica();
        aux.InicializarPila();

        while(!origen.PilaVacia()){
            aux.Apilar(origen.Tope());
            origen.Desapilar();
            cont++;
        }

        while(!aux.PilaVacia()){
            origen.Apilar(aux.Tope());
            aux.Desapilar();
        }

        return cont;
    }

    public static int sumarElemPila (PilaTDA origen){

        int suma=0;

        PilaTDA aux = new PilaEstatica();
        aux.InicializarPila();

        while(!origen.PilaVacia()){
            aux.Apilar(origen.Tope());
            suma+=origen.Tope();
            origen.Desapilar();
            
        }

        while(!aux.PilaVacia()){
            origen.Apilar(aux.Tope());
            aux.Desapilar();
        }

        return suma;
    }

    public static float promedioElemPila (PilaTDA origen){
        return (float)sumarElemPila(origen)/contarElemPila(origen); 
    }

}
