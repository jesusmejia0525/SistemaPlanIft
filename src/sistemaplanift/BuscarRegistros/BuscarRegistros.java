/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaplanift.BuscarRegistros;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VIQG01X
 */
public class BuscarRegistros {

    public List registrosFaltantes(String nI, String nF, List<String> datosBD) {
        int numI = Integer.parseInt(nI);
        int numF = Integer.parseInt(nF);
        List<String> faltantes = new ArrayList<>();

        for (int i = numI; i <= numF; i++) {
            String n = i + "";
            boolean ans = datosBD.contains(n);
            if (!ans) {
                faltantes.add(n);
            }
            
        }

        return faltantes;
    }

}
