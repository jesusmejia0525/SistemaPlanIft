/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaplanift.BuscarRegistros;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public String modificarOperador(String operador) {
        String valor;
        Map<String, String> operadores = new HashMap<String, String>();
        operadores.put("ABIX", "ABI");
        operadores.put("ADDINTELI", "AGI");
        operadores.put("ALESTRA", "ALE");
        operadores.put("ALTÁN", "ALT");
        operadores.put("ALTCEL", "ALC");
        operadores.put("AT&T", "AT&");
        operadores.put("AT&T", "AT&");
        operadores.put("CABLEMAS", "CBM");
        operadores.put("CABLEVISIONRED", "CRD");
        operadores.put("CELMAX", "CEL");
        operadores.put("CENTERNEXT", "CEN");
        operadores.put("CL3ARCOM", "CRE");
        operadores.put("CLEARCOM", "CRE");
        operadores.put("COEFICIENTE", "COE");
        operadores.put("COMUNICALO", "COM");
        operadores.put("CONVERGIA", "CON");
        operadores.put("CORPORACIÓN NOVAVISIÓN", "NOV");
        operadores.put("DIALOGA", "DIA");
        operadores.put("DIRECTO", "DIR");
        operadores.put("ESMERO", "ESM");
        operadores.put("FREEDOMPOP", "FRD");
        operadores.put("IBO CELL", "IBO");
        operadores.put("IENTC", "IEN");
        operadores.put("INBTEL", "INB");
        operadores.put("IP MATRIX", "IPM");
        operadores.put("MARCATELCOM", "MAR");
        operadores.put("MCM", "MEG");
        operadores.put("MEGACABLE", "MEC");
        operadores.put("METRORED", "MXR");
        operadores.put("MOVISTAR", "MOV");
        operadores.put("NGX NETWORKS", "NGX");
        operadores.put("OPENIP", "OPE");
        operadores.put("OPERBES", "OPR");
        operadores.put("OXIO", "OXI");
        operadores.put("ROBOT", "ROB");
        operadores.put("SERVNET", "SER");
        operadores.put("TELCEL", "TEL");
        operadores.put("TELECOMUNICACIONES 360", "TL3");
        operadores.put("TELIGENTIA", "TGL");
        operadores.put("TELMEX", "TMX");
        operadores.put("TOTAL PLAY", "TPT");
        operadores.put("TV CABLE", "TVO");
        operadores.put("TV REY", "TVR");
        operadores.put("UC TELECOM", "UCT");
        operadores.put("VADSA", "VAD");
        operadores.put("VINOC", "VIN");
        operadores.put("VIRGIN", "VIR");
        operadores.put("YONDER", "YON");
        
        if (operadores.containsKey(operador)) {
            valor=operadores.get(operador);
            return valor;
        }else{
            return null;
        }
        
    }
    

}
