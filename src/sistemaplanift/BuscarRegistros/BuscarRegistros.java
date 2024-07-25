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

    public void modificarOperador() {
        Map<String, String> operadores = new HashMap<String, String>();
       operadores.put("ABIX TELECOMUNICACIONES, S.A. DE C.V.","");
operadores.put("AGREGADORA DE INTELIGENCIA  EN NEGOCIOS TECNOLOGICOS, S.A. DE C.V.","");
operadores.put("AJTEL COMUNICACIONES, S. DE R.L. DE C.V.","");
operadores.put("ALESTRA SERVICIOS MÓVILES, S.A. DE C.V.","");
operadores.put("ALTÁN REDES, S.A.P.I. DE C.V.","");
operadores.put("ALTATA TELECOMUNICACIONES DE MEXICO, S.A.P.I. DE C.V.","");
operadores.put("ALTCEL, S.A.P.I. DE C.V.","");
operadores.put("ANYNESS, S.A.P.I. DE C.V.","");
operadores.put("ARDO DE MÉXICO, S.A.P.I. DE C.V.","");
operadores.put("ASAL COMUNICACIONES, S.A. DE C.V.","");
operadores.put("AT&T COMERCIALIZACION MOVIL, S. DE R.L. DE C.V.","");
operadores.put("AXTEL, S.A.B. DE C.V. (ANTES AVANTEL, S. DE R.L. DE C.V.)","");
operadores.put("TV WEB Y MAS, S.A. DE C.V.","");
operadores.put("BUENAS NOTICIAS, S.A. DE C.V.","");
operadores.put("TV CABLE DE ORIENTE, S.A. DE C.V. (ANTES TELE AZTECA, S.A. DE C.V.)","");
operadores.put("CABLEMAS TELECOMUNICACIONES, S.A. DE C.V.","");
operadores.put("CABLETAMPS, S.A. DE C.V.","");
operadores.put("CABLEVISION, S.A. DE C.V.","");
operadores.put("CABLEVISION RED, S.A. DE C.V.","");
operadores.put("CELMAX MÓVIL, S.A. DE C.V.","");
operadores.put("CENTERNEXT CLOUD SERVICES, S.A. DE C.V.","");
operadores.put("CLEARCOM COMUNICACIONES, S.A.P.I. DE C.V. ","");
operadores.put("CLEARCOM COMUNICACIONES, S.A.P.I. DE C.V.","");
operadores.put("COEFICIENTE COMUNICACIONES, S.A. DE C.V.","");
operadores.put("COMUNICALO DE MEXICO, S.A. DE C.V.","");
operadores.put("CONNECT TELECOM, S. DE R.L. DE C.V.","");
operadores.put("CONVERGIA DE MEXICO, S.A. DE C.V.","");
operadores.put("CORPORACIÓN NOVAVISIÓN, S. DE R.L. DE C.V.","");
operadores.put("CTI CALL, S.A. DE C.V.","");
operadores.put("DIALOGA GROUP TELECOM, S.A. DE C.V.","");
operadores.put("DIGITAL COMUNICATIONS DE MÉXICO, S.A. DE C.V.","");
operadores.put("DIGYNETWORKS SOLUCIONES Y REDES, S.A. DE C.V.","");
operadores.put("DIRECTO TELECOM, S.A. DE C.V.","");
operadores.put("EII TELECOM, S.A. DE C.V.","");
operadores.put("EJA TELECOMM, S. DE R.L.","");
operadores.put("EL PODER DE INTERNET, S.A. DE C.V.","");
operadores.put("ENTRETENIMIENTO Y TELECOMUNICACIONES, S.A. DE C.V.","");
operadores.put("ESMERO SOLUTIONS MEXICO, S.A. DE C.V.","");
operadores.put("FLYNODE DE MÉXICO, S.A. DE C.V.","");
operadores.put("FOREVERFLOW, S. DE R.L. DE C.V.","");
operadores.put("FREEDOMPOP MÉXICO, S.A. DE C.V.","");
operadores.put("COMERCIALIZADORA GIRNET, S.A. DE C.V.","");
operadores.put("GRUPO HIDALGUENSE DE DESARROLLO, S.A. DE C.V. ","");
operadores.put("GURUCOMM, S.A.P.I. DE C.V.","");
operadores.put("SERVICIOS DE INFRAESTRUCTURA DE RADIOCOMUNICACIÓN Y REDES PRIVADAS DE DATOS HYPERNET","");
operadores.put("IBO CELL, S.A.P.I. DE C.V.","");
operadores.put("IDT TELECOM MÉXICO, S. DE R.L. DE C.V.","");
operadores.put("IENTC, S. DE R.L. DE C.V.","");
operadores.put("IMPULSORA BALDER, S.A. DE C.V.","");
operadores.put("INBTEL, S.A. DE C.V.","");
operadores.put("INFORMÁTICA ARQUISYSTEMS, S. DE R.L. DE C.V.","");
operadores.put("INTERNET POR FIBRA, S.A. DE C.V.","");
operadores.put("IP MATRIX, S.A. DE C.V.","");
operadores.put("JAPIFON, S.A. DE C.V.","");
operadores.put("KARLA ALICIA BARRIOS GUZMÁN","");
operadores.put("KIWI NETWORKS, S.A.P.I. DE C.V.","");
operadores.put("LANTOINTERNET, S.A. DE C.V.","");
operadores.put("LAYER7, S.A.P.I. DE C.V.","");
operadores.put("MIGUEL ANGEL GONZALEZ DOBARGANES","");
operadores.put("MARCATEL COM, S.A. DE C.V.","");
operadores.put("MARTHA NOEMI ÁVILA URBINA","");
operadores.put("MAXCOM TELECOMUNICACIONES, S.A.B. DE C.V.","");
operadores.put("MBT MÓVIL, S. DE R.L. DE C.V.","");
operadores.put("MEGACABLE COMUNICACIONES DE MEXICO, S.A. DE C.V.","");
operadores.put("MEGA CABLE, S.A. DE C.V. ","");
operadores.put("QUICKLY PHONE, S.A. DE C.V.","");
operadores.put("MEGA CABLE, S.A. DE C.V.","");
operadores.put("MEGANET TELECOMUNICACIONES, S.A. DE C.V.","");
operadores.put("MEXICO RED DE TELECOMUNICACIONES, S. DE R.L. DE C.V.","");
operadores.put("PEGASO PCS, S.A. DE C.V.","");
operadores.put("NEUROTECH DE LA LAGUNA, S.A. DE C.V.","");
operadores.put("NEUS MOBILE, S.A.P.I. DE C.V.","");
operadores.put("NEXT TELEKOM, S.A.P.I. DE C.V.","");
operadores.put("NGX NETWORKS, S. DE R.L. DE C.V.","");
operadores.put("OME TEL, S.A. DE C.V.","");
operadores.put("OPENIP COMUNICACIONES, S.A. DE C.V.","");
operadores.put("OPERBES, S.A. DE C.V. (ANTES BESTPHONE, S.A. DE C.V.) ","");
operadores.put("ORANGE BUSINESS SERVICES MÉXICO, S.A. DE C.V.","");
operadores.put("ORIÓNIDAS, S.A. DE C.V.","");
operadores.put("OXIO MOBILE, S.A. DE C.V.","");
operadores.put("PLINTRON MÉXICO, S.A. DE C.V.","");
operadores.put("PROCOM SERVICIOS INTELIGENTES, S.A. DE C.V.","");
operadores.put("PROTEL I-NEXT, S.A. DE C.V.","");
operadores.put("KUBO CEL, S.A.P.I. DE C.V.","");
operadores.put("QUALTEL, S.A. DE C.V.","");
operadores.put("ROBOT COMUNICACIONES, S. DE R.L. DE C.V.","");
operadores.put("ADMINISTRADORA DE SERVICIOS DE INTERNET SANDUR, S.A. DE C.V.","");
operadores.put("SERVICE TRENDS, S.A. DE C.V.","");
operadores.put("SERVICIO DE TELECABLE DE HUEJUTLA, S.A. DE C.V.","");
operadores.put("SERVICIOS TRONCALIZADOS, S.A. DE C.V.","");
operadores.put("SERVNET MEXICO, S.A. DE C.V.","");
operadores.put("SICLU TELECOM, S.A. DE C.V.","");
operadores.put("SIERRA MADRE INTERNET, S.A. DE C.V.","");
operadores.put("SPARKTELECOMM, S.A. DE C.V.","");
operadores.put("STARSATEL, S.A. DE C.V.","");
operadores.put("TALENTO NET, S. DE R.L. DE C.V.","");
operadores.put("RADIOMOVIL DIPSA, S.A. DE C.V.","");
operadores.put("JORGE BASURTO HERNÁNDEZ","");
operadores.put("TELECOMMERCE INFRAESTRUCTURA TELECOM HOLDING, S.A.P.I. DE C.V. ","");
operadores.put("TELECOMM ATLAS, S.A. DE C.V.","");
operadores.put("TELECOMMERCE ACCES SERVICE, S.A. DE C.V.","");
operadores.put("TELECOMMERCE INFRAESTRUCTURA TELECOM HOLDING, S.A.P.I. DE C.V.","");
operadores.put("TELECOMUNICACIONES 360, S.A. DE C.V.","");
operadores.put("TELE FACIL MEXICO, S.A. DE C.V.","");
operadores.put("TELIGENTIA, S.A. DE C.V. ","");
operadores.put("TELEFONOS DE MEXICO, S.A.B. DE C.V.","");
operadores.put("TELEFONOS DEL NOROESTE, S.A. DE C.V.","");
operadores.put("ALEJANDRO PÉREZ MACÍAS","");
operadores.put("TOTAL PLAY TELECOMUNICACIONES, S.A.P.I. DE C.V.","");
operadores.put("TV CABLE DE ORIENTE, S.A. DE C.V.","");
operadores.put("TELEVISION INTERNACIONAL, S.A. DE C.V.","");
operadores.put("TV REY DE OCCIDENTE, S.A. DE C.V.","");
operadores.put("TV CABLE DE ORIENTE, S.A. DE C.V. ","");
operadores.put("UC TELECOMUNICACIONES, S.A.P.I. DE C.V.","");
operadores.put("VALOR AGREGADO DIGITAL, S.A. DE C.V.","");
operadores.put("VAMRA COMUNICACIONES, S.A. DE C.V.","");
operadores.put("VIASAT TECNOLOGÍA, S.A. DE C.V.","");
operadores.put("VINOC, S.A.P.I. DE C.V.","");
operadores.put("VIRGIN MOBILE MÉXICO, S. DE R.L. DE C.V.","");
operadores.put("VOZTELECOM LATINOAMERICA, S.A. DE C.V.","");
operadores.put("VPN DE MEXICO, S.A. DE C.V.","");
operadores.put("WAL-MART INNOVACIÓN, S. DE R.L. DE C.V.","");
operadores.put("YONDER MEDIA MOBILE MÉXICO, S. DE R.L. DE C.V.","");

    }

}
