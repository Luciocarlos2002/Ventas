package lucio.prueba;

import static lucio.prueba.constantes.Constantes.CINCO;
import static lucio.prueba.constantes.Constantes.UNO;

import lucio.prueba.constantes.Constantes;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print(Constantes.MENSAJE);

        for (int i = UNO; i <= CINCO; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println(Constantes.MENSAJE_2 + i);
        }
    }
}