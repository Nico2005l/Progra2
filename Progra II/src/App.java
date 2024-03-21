import algoritmos.metodosPila;
import api.PilaTDA;
import impl.PilaDinamica;
import impl.PilaEstatica;

public class App {
    public static void main(String[] args) throws Exception {
        PilaTDA p1 = new PilaDinamica();
        PilaTDA p2 = new PilaDinamica();
        p1.InicializarPila();
        p2.InicializarPila();

        p1.Apilar(1);
        p1.Apilar(2);
        p1.Apilar(3);
        p1.Apilar(4);

        metodosPila.copiarPila(p1,p2);
        while(!p2.PilaVacia()){
            System.out.println(p2.Tope());
            p2.Desapilar();
        }
    }
}
