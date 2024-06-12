import api.ConjuntoTDA;
import api.DefinitivoTDA;
import api.ListaTDA;
import impl.DefinitivoDinamico;

public class PruebaDeDefinitivo {
    public static void main(String[] args) {

        DefinitivoTDA d1 = new DefinitivoDinamico();

        d1.Inicializar();

        System.out.println(d1.EstaVacio());

        d1.Agregar(1, 1);
        d1.Agregar(2, 2);
        d1.Agregar(3, 3);
        d1.Agregar(4, 4);
        d1.Agregar(5, 5);

        d1.Eliminar(1);
        d1.Eliminar(5);

        System.out.println("cant"+d1.Contar()+"suma"+d1.Sumar()+"prom"+d1.Promediar());
        System.out.println();

        d1.ImprimirMayorAMenor();
        System.out.println();
        d1.ImprimirMenorAMayor();
        System.out.println();

        ConjuntoTDA claves = d1.Claves();

        while (!claves.ConjuntoVacio()) {
            int clave = claves.Elegir();
            System.out.println(clave);
            claves.Sacar(clave);
        }
        System.out.println();

        ListaTDA valores = d1.Valores();

        valores.mostrarLista();

    
}
}
