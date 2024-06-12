import api.ConjuntoTDA;
import impl.ConjuntoDinamico;
import impl.ConjuntoEstatico;

public class PruebaDeConjuntos {
    public static void main( String[] args){
        ConjuntoTDA mi_conjunto = new ConjuntoDinamico();

        mi_conjunto.InicializarConjunto();
        System.out.println(mi_conjunto.ConjuntoVacio());

        mi_conjunto.Agregar(5);
        mi_conjunto.Agregar(699);
        mi_conjunto.Agregar(699);
        mi_conjunto.Agregar(6);
        mi_conjunto.Agregar(9);

        System.out.println(mi_conjunto.Elegir());

        mi_conjunto.Sacar(699);

        System.out.println(mi_conjunto.ConjuntoVacio());

        


    }

}
