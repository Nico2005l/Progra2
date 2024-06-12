package impl;

import api.BibliotecaTDA;

public class BibliotecaDinamica implements BibliotecaTDA{

    NodoLibro primero;

    public void InicializarBiblioteca (){
        primero = null;
    }

    @Override
    public void eliminarLibro(int id) {
        NodoLibro aux = primero;

        if (aux.id==id){
            primero = primero.sig;
        }
        
        while (aux.sig.sig!=null && aux.sig.id!=id){
            aux = aux.sig;
        }
        if (aux.sig.id==id){
            aux.sig = aux.sig.sig; 
        }
    }

    @Override
    public String buscarLibro(int id) {
        NodoLibro aux = primero;
        
        while (aux.sig!=null && aux.id!=id){
            aux = aux.sig;
        }
        return aux.titulo;
    }

    @Override
    public void listarLibros() {
        NodoLibro aux = primero;
        
        while (aux!=null){
            System.out.println(aux.id + aux.titulo + aux.autor + aux.año);
            System.out.println();
            aux = aux.sig;
            
        }
        
    }

    @Override
    public int contarLibros() {
        NodoLibro aux = primero;
        int cont = 0;
        while (aux.sig!=null){
            aux = aux.sig;
            cont++;
        }
        return cont;
    }

    @Override
    public void agregarLibro(int id, String autor, String titulo, int año) {
        NodoLibro libro = new NodoLibro();
        libro.autor = autor;
        libro.año =año;
        libro.id = id;
        libro.titulo = titulo;
        libro.sig = null;

        libro.sig = primero;
        primero = libro;
    }

}
