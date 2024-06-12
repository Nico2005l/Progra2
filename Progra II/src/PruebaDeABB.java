import algoritmos.metodosABB;
import api.ABBTDA;
import impl.ABB;

public class PruebaDeABB {
    public static void main(String[] args) {
        ABBTDA mi_arbol = new ABB();

        mi_arbol.InicializarArbol();

        mi_arbol.AgregarElem(8);
        mi_arbol.AgregarElem(4);
        mi_arbol.AgregarElem(12);
        mi_arbol.AgregarElem(3);
        mi_arbol.AgregarElem(5);
        mi_arbol.AgregarElem(10);
        mi_arbol.AgregarElem(15);
        mi_arbol.AgregarElem(1);
        mi_arbol.AgregarElem(9);
        mi_arbol.AgregarElem(11);

        

        System.out.println(metodosABB.minimoAncestroComun(mi_arbol,3,5));

    }

}
