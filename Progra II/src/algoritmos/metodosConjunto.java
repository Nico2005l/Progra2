package algoritmos;

import api.ConjuntoTDA;

public class metodosConjunto {

    public boolean Incluye (ConjuntoTDA c1, ConjuntoTDA c2){
        boolean incluye = true;
        while (!c2.ConjuntoVacio() && incluye){
            int x = c2.Elegir();
            if (!c1.Pertenece(x)){
                incluye = false;
            }else{
                c2.Sacar(x);
            }
        }
        return incluye;
    }

}
