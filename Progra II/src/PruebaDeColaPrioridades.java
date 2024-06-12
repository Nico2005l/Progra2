import impl.ColaPrioridadDinamica;
import impl.ColaPrioridadEstatica;
import algoritmos.metodosCola;
import algoritmos.metodosColaPrioridad;
import api.ColaPrioridadTDA;

public class PruebaDeColaPrioridades {
    public static void main (String[] args){
        ColaPrioridadTDA mi_cola = new ColaPrioridadDinamica();

        mi_cola.InicializarCola();
        
        mi_cola.AcolarPrioridad(1, -1);
        mi_cola.AcolarPrioridad(2, -2);
        mi_cola.AcolarPrioridad(3,-3);

        ColaPrioridadTDA c2 = new ColaPrioridadDinamica();
        c2.InicializarCola();
        c2.AcolarPrioridad(1, -1);
        c2.AcolarPrioridad(3,-3);
        c2.AcolarPrioridad(2, -2);
        

        

        

        while (!c2.ColaVacia()){
            System.out.println(c2.Primero());
            c2.Desacolar();
        }
        

        

    }
}

        
