import algoritmos.metodosCola;
import api.ColaTDA;
import impl.ColaDinamica;
import impl.ColaDinamicaMA;
import impl.ColaEstatica;

public class PruebaDeCola {
    public static void main (String[] args){

        ColaTDA cola2 = new ColaDinamica();

        ColaTDA mi_cola = new ColaDinamicaMA();

        mi_cola.InicializarCola();

        for (int i=1; i<6;i++){
            mi_cola.Acolar(i);
        }
        for (int i=5; i>0;i--){
            mi_cola.Acolar(i);
        }

        metodosCola.imprimirCola(mi_cola);

        
        

        

        

        
        
    }
}
