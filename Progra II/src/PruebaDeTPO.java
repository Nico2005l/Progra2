import api.TPOCiudadesTDA;
import impl.TPOCiudades;

public class PruebaDeTPO {
    public static void main(String[] args) {
        TPOCiudadesTDA sistema = new TPOCiudades();
        sistema.Inicializar();
        
        System.out.println(sistema.CalcularCamino("CABA", "La Plata"));
    
        
    }
}
