import algoritmos.metodosPila;
import api.GrafoTDA;
import api.PilaTDA;
import impl.PilaDinamica;
import impl.PilaEstatica;

public class App {
    public static void main(String[] args) throws Exception {
        PilaTDA p1 = new PilaDinamica();
        PilaTDA p2 = new PilaDinamica();
        p1.InicializarPila();
        p2.InicializarPila();
        /* 
        p1.Apilar(1);
        p1.Apilar(2);
        p1.Apilar(3);
        p1.Apilar(4);
    */@Override
    public int CalcularCamino(String x, String y) {

        int origen = ciudades.DevolverInt(x);
        int fin = ciudades.DevolverInt(y);

        int[] resultado = dijkstra (miGrafo,origen);

        return resultado[fin];
        
        
    }
    private int[] dijkstra(GrafoTDA grafo, int origen) {
        int n = contVert;
        int[] distancias = new int[n];
        boolean[] visitados = new boolean[n];
 
        // Inicialización de distancias y visitados
        for (int k=0; k<n; k++){
            distancias[k]=INFINITO;
        }

        distancias[origen] = 0;

        for (int i = 0; i < n  ; i++) {
            // Selección del vértice no visitado con la distancia mínima
            int u = seleccionarMinimo(distancias, visitados);
            
            visitados[u] = true;

            // Actualización de las distancias de los vértices adyacentes al vértice seleccionado
            for (int v = 0; v < n; v++) {
                if (grafo.ExisteArista(u,v) && !visitados[v] && distancias[u] != INFINITO
                    && distancias[u] + grafo.PesoArista(u,v) < distancias[v]) {
                    
                    distancias[v] = distancias[u] + grafo.PesoArista(u,v);
                }
            }
            
        }

        return distancias;
    }

    // Selecciona el vértice no visitado con la distancia mínima
    private int seleccionarMinimo(int[] distancias, boolean[] visitados) {
        int min = INFINITO, minIndex = -1;
        for (int v = 0; v < contVert; v++) {
            if (!visitados[v] && distancias[v] < min) {
                min = distancias[v];
                minIndex = v;
            }
        }
        return minIndex;
    }
        metodosPila.copiarPila(p1,p2);/* 
        while(!p2.PilaVacia()){
            System.out.println(p2.Tope());
            p2.Desapilar();*/
        }
    }

