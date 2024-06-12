package impl;

import api.HeapTDA;

public class MaxHeap implements HeapTDA{

    
    int[] valores;
    int cont;
    int n;

    @Override
    public void InicializarHeap() {
        
        n=100;
        valores = new int[n];
        cont = 0;
    }

    @Override
    public void Agregar(int x) {

        valores[cont]=x;
        cont++;
        Ordenar(cont-1);

        if(cont+1 > n){
            n*=10;
            int[] aux = new int[n];
            for (int i = 0; i < valores.length; i++) {
                aux[i] = valores[i];
            }
            valores = aux;
        }
    }

    @Override
    public void Sacar() {
        
        valores[0]=valores[cont];
        cont--;
        OrdenarParaAbajo(0);

        

    
    }

    @Override
    public int Primero() {
        return valores[0];
    }

    @Override
    public boolean HeapVacio() {
        return (cont==0);
    }

    private void Ordenar (int cont){

        int IndicePadre = (cont-1)/2;
        
        if (valores[cont]>valores[IndicePadre]){
            int aux = valores[IndicePadre];
            valores[IndicePadre] = valores[cont];
            valores[cont] = aux;
            Ordenar(IndicePadre);
        }
    }

    private void OrdenarParaAbajo (int cont){

        int indiceHjoI= 2*cont+1;
        int indiceHjoD= 2*cont+2;
        int indiceAIntercambiar;


        if (valores[indiceHjoI]<valores[indiceHjoD]){
            indiceAIntercambiar = indiceHjoD;
        }else{
            indiceAIntercambiar = indiceHjoI;
        }
        
        if (valores[cont]<valores[indiceAIntercambiar]){
            int aux = valores[cont];
            valores[cont] = valores[indiceAIntercambiar];
            valores[indiceAIntercambiar] = aux;
            OrdenarParaAbajo(indiceAIntercambiar);
        }
        

       
    }
    

}
