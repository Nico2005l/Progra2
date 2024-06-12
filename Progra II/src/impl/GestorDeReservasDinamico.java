package impl;

import api.ColaPrioridadTDA;
import api.ConjuntoTDA;
import api.DiccionarioMultipleTDA;
import api.GestordeReservasTDA;
import api.PilaTDA;

public class GestorDeReservasDinamico implements GestordeReservasTDA {

    NodoReserva primero;

    ConjuntoTDA conjutoReservas;

    @Override
    public void Inicializar() {
        primero = null;
        conjutoReservas = new ConjuntoDinamico();
        conjutoReservas.InicializarConjunto();
    }

    @Override
    public void agregarReserva(int id_reserva, int id_pasajero, int nro_vuelo, int nro_asiento, int fecha) {
        NodoReserva aux = new NodoReserva();
        aux.idReserva = id_reserva;
        aux.idPasajero = id_pasajero;
        aux.nroVuelo = nro_vuelo;
        aux.nroAsiento = nro_asiento;
        aux.Fecha = fecha;

        if (primero==null){
            primero = aux;
            conjutoReservas.Agregar(aux.idReserva);
        }else{
            if (!conjutoReservas.Pertenece(aux.idReserva)){
                aux.sig = primero;
                primero =aux;
            }
        }
    }

    @Override
    public void eliminarReserva(int id_reserva) {
        NodoReserva aux = primero;
        if(primero.idReserva == id_reserva){
            primero = primero.sig;
        }else{
            while (aux.sig.sig != null && aux.sig.idReserva != id_reserva ){
                aux = aux.sig;
            }
            if (aux.sig.idReserva==id_reserva){
                aux.sig = aux.sig.sig;
            }
        }
    }

    @Override
    public void actualizarAsiento(int id_reserva, int nro_asiento) {
        NodoReserva aux = primero;
        while (aux.sig!=null && aux.idReserva!=id_reserva){
            aux = aux.sig;
        }
        if (aux.idReserva==id_reserva){
            aux.nroAsiento = nro_asiento;
        }
    }

    @Override
    public void actualizarVuelo(int id_reserva, int nro_vuelo) {
        NodoReserva aux = primero;
        while (aux.sig!=null && aux.idReserva!=id_reserva){
            aux = aux.sig;
        }
        if (aux.idReserva==id_reserva){
            aux.nroVuelo = nro_vuelo;
        }
    }

    @Override
    public void actualizarFecha(int id_reserva, int fecha) {
        NodoReserva aux = primero;
        while (aux.sig!=null && aux.idReserva!=id_reserva){
            aux = aux.sig;
        }
        if (aux.idReserva==id_reserva){
            aux.Fecha = fecha;
        }
    }

    @Override
    public void obtenerReserva(int id_reserva) {
        NodoReserva aux = primero;
        while (aux.sig!=null && aux.idReserva!=id_reserva){
            aux = aux.sig;
        }
        if (aux.idReserva==id_reserva){
            System.out.println("Reserva: "+aux.idReserva+" pasajero: "+aux.idPasajero+" Nro. Vuelo: "+aux.nroVuelo+" Nro. Asiento: "+aux.nroAsiento);
        }
    }

    @Override
    public PilaTDA listaDeReservas() {
        PilaTDA Reservas = new PilaDinamica();
        Reservas.InicializarPila();
        NodoReserva aux = primero;
        while (aux!=null){
            Reservas.Apilar(aux.idReserva);
            aux = aux.sig;
        }
        return Reservas;
        
    }

    @Override
    public ColaPrioridadTDA reservasPorVuelo(int nro_vuelo) {
        ColaPrioridadTDA Reservas = new ColaPrioridadDinamica();
        Reservas.InicializarCola();
        NodoReserva aux = primero;
        while (aux!=null){
            if(aux.nroVuelo==nro_vuelo){
                Reservas.AcolarPrioridad(aux.idReserva, aux.idReserva);
            }
            aux = aux.sig;
        }
        return Reservas;
    }

    @Override
    public PilaTDA reservasPorFecha(int fecha) {
        PilaTDA Reservas = new PilaDinamica();
        Reservas.InicializarPila();
        NodoReserva aux = primero;
        while (aux!=null){
            if (aux.Fecha==fecha){
                Reservas.Apilar(aux.idReserva);
            }
            
            aux = aux.sig;
        }
        return Reservas;
    }

    @Override
    public DiccionarioMultipleTDA listarPorVuelo() {
        DiccionarioMultipleTDA Vuelos = new DiccionarioMultipleDinamico();
        Vuelos.InicializarDiccionario();
        NodoReserva aux = primero;
        while (aux!=null){
            Vuelos.Agregar(aux.nroVuelo, aux.idReserva);
            
            aux = aux.sig;
        }
        return Vuelos;

    }

    @Override
    public DiccionarioMultipleTDA listarPorFecha() {
        DiccionarioMultipleTDA Fechas = new DiccionarioMultipleDinamico();
        Fechas.InicializarDiccionario();
        NodoReserva aux = primero;
        while (aux!=null){
            Fechas.Agregar(aux.Fecha, aux.idReserva);
            
            aux = aux.sig;
        }
        return Fechas;

    }

}
