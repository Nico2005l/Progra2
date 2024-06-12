import api.HeapTDA;
import impl.MaxHeap;
import impl.MinHeap;

public class PruebaDeHeap {

    public static void main(String[] args) {
        HeapTDA mi_heap = new MaxHeap();
        mi_heap.InicializarHeap();

        mi_heap.HeapVacio();

        mi_heap.Agregar(2);
        mi_heap.Agregar(1);
        mi_heap.Agregar(2);
        mi_heap.Agregar(4);
        mi_heap.Agregar(7);
        mi_heap.Agregar(8);
        mi_heap.Agregar(5);
        mi_heap.Agregar(6);
        mi_heap.Agregar(9);
        mi_heap.Agregar(8);
        mi_heap.Agregar(10);
        mi_heap.Agregar(11);

        mi_heap.HeapVacio();

        
        while (!mi_heap.HeapVacio()) {
            System.out.println(mi_heap.Primero());
            mi_heap.Sacar();
        }
    }

}


