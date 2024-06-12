package algoritmos;

import api.ConjuntoTDA;
import api.DiccionarioMultipleTDA;
import api.DiccionarioSimpleTDA;
import api.PilaTDA;
import impl.ConjuntoDinamico;

public class metodosDiccionario {

    public void PasajeAMultple (DiccionarioSimpleTDA DicSim, DiccionarioMultipleTDA DicMul){
        ConjuntoTDA claves = new ConjuntoDinamico();
        claves.InicializarConjunto();
        claves = DicSim.Claves();
        while (!claves.ConjuntoVacio()){
            int clave = claves.Elegir();
            int valor = DicSim.Recuperar(clave);
            DicMul.Agregar(clave, valor);
            claves.Sacar(clave);
        }
    }

    public void PasajeAPila  (DiccionarioSimpleTDA Dic, PilaTDA Valores){
        ConjuntoTDA claves = new ConjuntoDinamico();
        claves.InicializarConjunto();
        claves = Dic.Claves();
        while (!claves.ConjuntoVacio()){
            int clave = claves.Elegir();
            Valores.Apilar(Dic.Recuperar(clave));
            claves.Sacar(clave);
        }
    }
}
