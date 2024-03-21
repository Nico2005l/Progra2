package algoritmos;

import api.PilaTDA;

import impl.PilaEstatica;

public class metodosPila {

    public static void copiarPila (PilaTDA origen, PilaTDA destino){
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

}
