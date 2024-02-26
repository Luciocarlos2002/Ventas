package lucio.prueba;

import lucio.prueba.constantes.Constantes;

import static lucio.prueba.constantes.Constantes.DOS;
import static lucio.prueba.constantes.Constantes.UNO;

public class Main2 {
    public static void main(String[] args) {
        System.out.print(Constantes.MENSAJE);

        for (int i = UNO; i <= DOS; i++) {
            System.out.println(Constantes.MENSAJE_2 + i);
        }
    }
}
