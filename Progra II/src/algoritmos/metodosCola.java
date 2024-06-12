package algoritmos;

import api.ColaTDA;
import impl.ColaEstatica;

public class metodosCola {

    public static void pasarCola (ColaTDA origen, ColaTDA destino){

        ColaTDA aux = new ColaEstatica();
        aux.InicializarCola();

        while (!origen.ColaVacia()){
            aux.Acolar(origen.Primero());
            destino.Acolar(origen.Primero());
            origen.Desacolar();
        }

        while (!aux.ColaVacia()){
            origen.Acolar(aux.Primero());
            aux.Desacolar();
        }
    }

    public static void imprimirCola (ColaTDA origen){

        ColaTDA aux = new ColaEstatica();
        aux.InicializarCola();


        while(!origen.ColaVacia()){
            aux.Acolar(origen.Primero());
            System.out.println(origen.Primero());
            origen.Desacolar();
        }

        while (!aux.ColaVacia()){
            origen.Acolar(aux.Primero());
            aux.Desacolar();
        }
    }

    public static int contarCola (ColaTDA origen){
        ColaTDA aux = new ColaEstatica();
        aux.InicializarCola();

        int cont = 0;

        while(!origen.ColaVacia()){
            aux.Acolar(origen.Primero());
            cont++;
            origen.Desacolar();
        }

        while (!aux.ColaVacia()){
            origen.Acolar(aux.Primero());
            aux.Desacolar();
        }
        return cont;
    }

    public static void invertirCola (ColaTDA origen){
        ColaTDA aux = new ColaEstatica();
        aux.InicializarCola();

        ColaTDA aux2 = new ColaEstatica();
        aux2.InicializarCola();

        int cantElemInicio = contarCola(origen);

        int ultimoElem=0;

        while (!origen.ColaVacia()){
            ultimoElem=origen.Primero();
            origen.Desacolar();
            if (!origen.ColaVacia()){
                aux.Acolar(ultimoElem);
            }   
        }
        origen.Acolar(ultimoElem);

        while (cantElemInicio!=contarCola(origen)){
            while (!aux.ColaVacia()){
                ultimoElem=aux.Primero();
                aux.Desacolar();
                if (!aux.ColaVacia()){
                    aux2.Acolar(ultimoElem);
                }else {
                    origen.Acolar(ultimoElem);
                }
            }
            pasarCola(aux2, aux);
            aux2.InicializarCola();
        }
    }

    public static void invertirColaRecursiva (ColaTDA origen){

        int aux = origen.Primero();
        origen.Desacolar();

        if (!origen.ColaVacia()){
            invertirColaRecursiva(origen);
        }
        origen.Acolar(aux);

    }

    public static boolean mismoFinal (ColaTDA origen, ColaTDA destino){
        
        invertirColaRecursiva(origen);
        invertirCola(destino);

        boolean resultado = (origen.Primero()==destino.Primero());

        invertirColaRecursiva(origen);
        invertirCola(destino);

        return resultado;
    }
    
    public static boolean esCapicua (ColaTDA origen){
        ColaTDA aux = new ColaEstatica();
        aux.InicializarCola();
        ColaTDA aux2 = new ColaEstatica();
        aux2.InicializarCola();

        boolean resultado = true;

        pasarCola(origen, aux);
        pasarCola(origen, aux2);

        invertirCola(aux);

        while (!aux.ColaVacia()){
            if (origen.Primero()!=aux.Primero()){
                resultado = false;
                break;
            }else{
                origen.Desacolar();
                aux.Desacolar();
            }
        }
        pasarCola(aux2, origen);
        
        return resultado;
    }

    public static boolean esInversa (ColaTDA origen, ColaTDA destino){
        ColaTDA aux = new ColaEstatica();
        aux.InicializarCola();
        ColaTDA aux2 = new ColaEstatica();
        aux2.InicializarCola();
        boolean resultado = true;

        pasarCola(origen, aux);
        pasarCola(destino, aux2);

        invertirColaRecursiva(aux);
        
        while (!aux.ColaVacia()){
            if (aux.Primero()!=aux2.Primero()){
                resultado = false;
                break;
            }else{
                aux.Desacolar();
                aux2.Desacolar();
            }
        }
        
        
        return resultado;
    }
}
