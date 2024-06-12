import api.PilaColaTDA;
import impl.PilaColaDinamica;

public class PruebaDePilaCola {
    public static void main(String[] args) {
        PilaColaTDA miPilaCola = new PilaColaDinamica();

        for (int i = 1; i <= 22; i++) {
            miPilaCola.Cargar(i);
        }

        System.out.println(miPilaCola.EstaVacio());
        System.out.println(miPilaCola.Mostrar());
        for (int i = 0; i < 4; i++) {
            miPilaCola.Quitar();
        }
        miPilaCola.Imprimir();





    }
}
