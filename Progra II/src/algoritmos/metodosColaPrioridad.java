package algoritmos;

import api.ColaPrioridadTDA;
import api.ColaTDA;
import impl.ColaPrioridadDinamica;

public class metodosColaPrioridad {

    public static ColaPrioridadTDA Combinar (ColaPrioridadTDA c1, ColaPrioridadTDA c2){
        ColaPrioridadTDA aux1 = c1;
        ColaPrioridadTDA aux2 = c2;
        ColaPrioridadTDA aux3 = new ColaPrioridadDinamica();
        aux3.InicializarCola();

        while(!aux1.ColaVacia()){
            aux3.AcolarPrioridad(aux1.Primero(), aux1.Prioridad());
            aux1.Desacolar();
        }
        while(!aux2.ColaVacia()){
            aux3.AcolarPrioridad(aux2.Primero(), aux2.Prioridad());
            aux2.Desacolar();
        }
        return aux3;
    }

    public static boolean esIdentica (ColaPrioridadTDA c1, ColaPrioridadTDA c2){
        ColaPrioridadTDA aux1 = c1;
        ColaPrioridadTDA aux2 = c2;
        

        if ((aux1.ColaVacia() && (!aux2.ColaVacia())) || ((!aux1.ColaVacia()) && aux2.ColaVacia())){
            return false;
        }else {
            if(!(aux1.Primero() == aux2.Primero() && aux1.Prioridad() == aux2.Prioridad())){
            return false;
            }else if (!aux1.ColaVacia() && !aux2.ColaVacia() ){
                aux1.Desacolar();
                aux2.Desacolar();
                return esIdentica(aux1, aux2); 
            }else{
                return true;
            }
        }

    }

    public void Pasaje (ColaPrioridadTDA origen, ColaTDA Valores, ColaTDA Prioridad){
        
        while (!origen.ColaVacia()){
            Valores.Acolar(origen.Primero());
            Prioridad.Acolar(origen.Prioridad());
            origen.Desacolar();
        }
    }

}
