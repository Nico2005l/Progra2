import algoritmos.metodosPila;
import api.PilaTDA;
import impl.PilaDinamica;
import impl.PilaEstatica;


public class EJ1 {
    public static void main (String[] args) throws Exception{
        PilaTDA p1 = new PilaDinamica();
        PilaTDA p2 = new PilaDinamica();
        p1.InicializarPila();

        p1.Apilar(1);
        p1.Apilar(2);
        p1.Apilar(3);
        p1.Apilar(4);

        metodosPila.invertirPila(p1);

        System.out.println(metodosPila.promedioElemPila(p1));

        while(!p1.PilaVacia()){
            System.out.println(p1.Tope());
            p1.Desapilar();

        }

        

    }
}
