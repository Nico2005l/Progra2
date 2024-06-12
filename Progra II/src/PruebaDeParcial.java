import api.ColaPrioridadTDA;
import api.ConjuntoTDA;
import api.DiccionarioMultipleTDA;
import api.GestordeReservasTDA;
import api.PilaTDA;
import impl.GestorDeReservasDinamico;

public class PruebaDeParcial {
    public static void main(String[] args) {
        GestordeReservasTDA sistema = new GestorDeReservasDinamico();
        sistema.Inicializar();

        sistema.agregarReserva(1,1,1,1,1);
        sistema.agregarReserva(2,1,2,2,2);
        sistema.agregarReserva(3,2,3,3,3);
        sistema.agregarReserva(4,3,1,4,5);
        sistema.agregarReserva(5,4,2,5,5);

        sistema.eliminarReserva(1);

        sistema.actualizarAsiento(2, 1);

        sistema.actualizarFecha(3,1);

        sistema.obtenerReserva(5);

        PilaTDA pilaReservas = sistema.listaDeReservas();

        while(!pilaReservas.PilaVacia()){
            System.out.println(pilaReservas.Tope());
            pilaReservas.Desapilar();
        }
        System.out.println();

        ColaPrioridadTDA IdsVuelo2 = sistema.reservasPorVuelo(2);

        while(!IdsVuelo2.ColaVacia()){
            System.out.println(IdsVuelo2.Primero());
            IdsVuelo2.Desacolar();
        }
        System.out.println();

        PilaTDA pilaReservasFecha = sistema.reservasPorFecha(5);

        while(!pilaReservasFecha.PilaVacia()){
            System.out.println(pilaReservasFecha.Tope());
            pilaReservasFecha.Desapilar();
        }
        System.out.println();

        DiccionarioMultipleTDA DiccVuelos = sistema.listarPorVuelo();

        ConjuntoTDA mis_claves = DiccVuelos.Claves();

        ConjuntoTDA mis_valores;

        int claves;

        int valores;


        while(!mis_claves.ConjuntoVacio()){
            claves=mis_claves.Elegir();
            System.out.println();
            System.out.println("Vuelo "+claves);
            
        
            mis_valores=DiccVuelos.Recuperar(claves);
            while (!mis_valores.ConjuntoVacio()) {
                valores=mis_valores.Elegir();
                System.out.println("ID Reserva"+valores);
                mis_valores.Sacar(valores);
            }
            mis_claves.Sacar(claves);
            
        }

        DiccionarioMultipleTDA DiccFechas = sistema.listarPorFecha();

        mis_claves = DiccFechas.Claves();

        while(!mis_claves.ConjuntoVacio()){
            claves=mis_claves.Elegir();
            System.out.println();
            System.out.println("Fecha "+claves);
            
        
            mis_valores=DiccFechas.Recuperar(claves);
            while (!mis_valores.ConjuntoVacio()) {
                valores=mis_valores.Elegir();
                System.out.println("ID Reserva"+valores);
                mis_valores.Sacar(valores);
            }
            mis_claves.Sacar(claves);
            
        }

    }

}
