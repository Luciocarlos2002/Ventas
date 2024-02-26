package lucio.prueba;

import static lucio.prueba.constantes.Constantes.TRES;
import static lucio.prueba.constantes.Constantes.UNO;

import lucio.prueba.constantes.Constantes;

/**
 * Prueba.
 *
 * @author Lucio Huaman.
 */
public class Main2 {

    /**
     * Mostrar mensaje 3 veces.
     */
    public static void main(String[] args) {
        System.out.print(Constantes.MENSAJE);

        for (int i = UNO; i <= TRES; i++) {

            System.out.println(Constantes.MENSAJE_2 + i);
        }
    }
}
