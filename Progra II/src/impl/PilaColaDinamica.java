package impl;

import api.PilaColaTDA;

public class PilaColaDinamica implements PilaColaTDA {

    int contPar;
    Nodo primero;
    Nodo ultimo;

    @Override
    public void Inicializar() {
        contPar = 0;
        primero = null;
        ultimo = null;
    }

    @Override
    public void Cargar(int x) {
        Nodo aux = new Nodo();
        if (this.EstaVacio()){
            aux.info = x;
            primero=aux;
            ultimo = aux;
        }else{
            aux.info= x;
            ultimo.sig =aux;
            ultimo=aux;
        }
        if(x % 2 == 0){
            contPar++;
        }
    }

    @Override
    public void Quitar() {
        int n=this.Mostrar();
        if (contPar<=10){
            primero = primero.sig;
        }else{
            Nodo aux = primero;
            while (aux.sig!=ultimo){
                aux = aux.sig;
            }
            ultimo=aux;
            ultimo.sig=null;
        }

        if(n % 2 == 0){
            contPar--;
        }
        
    }

    @Override
    public int Mostrar() {
        if (contPar<=10){
            return primero.info;
        }else{
            return ultimo.info;
        }
    }

    @Override
    public boolean EstaVacio() {
        return (primero==null);
    }

    @Override
    public void Imprimir() {
        Nodo aux = primero;
        while (aux!=null){
            System.out.print(aux.info + " ");
            aux = aux.sig;
        }
        System.out.println();
    }


}
