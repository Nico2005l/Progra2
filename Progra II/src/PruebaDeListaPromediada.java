import algoritmos.metodosCola;
import api.ColaTDA;
import api.ListaPromediadaTDA;
import impl.ListaPromediadaDinamica;

public class PruebaDeListaPromediada {
    public static void main(String[] args) {
        ListaPromediadaTDA lista= new ListaPromediadaDinamica();

        lista.Inicializar();
        
        
        lista.Agregar(3);
        lista.Agregar(5);
        lista.Agregar(6);
        lista.Agregar(2);
        lista.Agregar(8);
        lista.Agregar(10);
        lista.Agregar(9);
        lista.Agregar(4);
        lista.Agregar(1);
        lista.Agregar(7);

        lista.Eliminar(1);
        lista.Eliminar(10);

        System.out.println(lista.Promedio());

        System.out.println(lista.estaVacia());

        ColaTDA menores = lista.Menores();
        ColaTDA mayores = lista.Mayores();

        metodosCola.imprimirCola(menores);
        metodosCola.imprimirCola(mayores);



    }

}
