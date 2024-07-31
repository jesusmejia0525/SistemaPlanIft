/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaplanift;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import sistemaplanift.BuscarRegistros.BuscarRegistros;
import sistemaplanift.ConexionBD.Conexion;
import sistemaplanift.Excel.Excel;
import sistemaplanift.dto.ListaNF;
import sistemaplanift.dto.PlanIftDto;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author VIQG01X
 */
public class SistemaPlanIft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date hoy1 = new Date();
        SimpleDateFormat sdfhoy = new SimpleDateFormat("dd/MM/yyyy");
        String fechahoy = sdfhoy.format(hoy1);
        String dia = fechahoy.substring(0, 2);
        String mes = fechahoy.substring(3, 5);
        String anio = fechahoy.substring(6, 10);
        String hoy = "224" + mes + dia;
        int hora, minutos, segundos;
        Calendar calendario = new GregorianCalendar();
        hora = calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
        String txtHora = String.valueOf(hora);
        String txtMin = String.valueOf(minutos);
        String txtSeg = String.valueOf(segundos);
        String regHora = txtHora + txtMin + txtSeg;
        String hraFinal = regHora + "0";
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        PreparedStatement pstmtIn = null;
        ResultSet rsetIn = null;
        Conexion con = new Conexion();
        Excel excel = new Excel();
        List<PlanIftDto> listPlan = new ArrayList<>();
        listPlan = excel.leerExcel();
        System.out.println("NUmero de datos en excel " + listPlan.size());
        List<ListaNF> listanf = new ArrayList<>();
        String user = "VIQ2DAF";
        String cpp = "";
        int cont = 0;

        try {
            if (con != null) {
                System.out.println("DB2 Database Connected");
            } else {
                System.out.println("Db2 connection Failed ");
            }
            for (int i = 1; i < listPlan.size(); i++) {
                if (!listPlan.get(i).getNir().isEmpty() && !listPlan.get(i).getSerie().isEmpty()) {
                    System.out.println(i + " ----------------------------");
                    int indice1 = listPlan.get(i).getNir().indexOf(".");
                    int indice2 = listPlan.get(i).getSerie().indexOf(".");

                    String nirSe = Integer.parseInt(listPlan.get(i).getNir().substring(0, indice1)) + ""
                            + Integer.parseInt(listPlan.get(i).getSerie().substring(0, indice2));
                    //System.out.println("Numero nir + serie " + nirSe);

                    String nI = listPlan.get(i).getNumI().substring(0, 1);
                    String nF = listPlan.get(i).getNumF().substring(0, 1);

                    String prefijoI = nirSe + nI;
                    String prefijoF = nirSe + nF;
                    System.out.println("NI " + prefijoI);
                    System.out.println("NF " + prefijoF);
                    pstmt = con.getConexionBD().prepareStatement("SELECT * FROM MOBPRC.TRCFM_RT_CNTR_MSTR WHERE RAT_CNTR_CD BETWEEN '" + prefijoI + "' AND '" + prefijoF + "' AND MKT_ID = 'CPT' AND RAT_CNTR_TYP ='1'");
                    rset = pstmt.executeQuery();
                    if (rset != null) {
                        ArrayList<String> datosBD = new ArrayList<>();
                        while (rset.next()) {
                            datosBD.add(rset.getString("RAT_CNTR_CD"));
                        }

                        BuscarRegistros buscar = new BuscarRegistros();
                        List<String> registrosF = new ArrayList<>();
                        registrosF = buscar.registrosFaltantes(prefijoI, prefijoF, datosBD);
                        if (!registrosF.isEmpty()) {
                            for (int j = 0; j < registrosF.size(); j++) {
                                ListaNF lista = new ListaNF();
                                switch (listPlan.get(i).getNombreCorto().toUpperCase()) {
                                    case "TELCEL":
                                        cpp = "T";
                                        break;
                                    case "TELMEX":
                                        cpp = "F";
                                        break;
                                    default:
                                        cpp = "O";
                                }
                                String poblacion;
                              //  if (listPlan.get(i).getPoblacion().length() > 20) {
                                    poblacion = StringUtils.substring(listPlan.get(i).getPoblacion(), 0, 20);
                                    
                                //} else {
                                  //  poblacion = listPlan.get(i).getPoblacion();
                                //}
                                String estado;
                                //if (listPlan.get(i).getEstado().length() > 4) {
                                 estado = StringUtils.substring(listPlan.get(i).getEstado(), 0, 4);
                                 //System.out.println("poblacion "+ poblacion +"  "+"estado "+estado);
                                //} else {
                                  //  estado = listPlan.get(i).getEstado();
                                //}
                                String valor = buscar.modificarOperador(listPlan.get(i).getNombreCorto());

                                String operadorEx = "False";
                                if (valor != null) {
                                    cont++;
                                    pstmtIn = con.getConexionBD().prepareStatement("INSERT INTO MOBPRC.TRCFM_RT_CNTR_MSTR (MKT_ID,RAT_CNTR_TYP,RAT_CNTR_CD,"
                                        + "DEST_RAT_AREA_VAL,POP_AREA_NAME,POP_AREA_ST_CD,NUM_DGTS_LADA_CD,ALT_LADA_CD,V_COORD_NUM,"
                                        + "H_COORD_NUM,WRLD_WD_LN,V_COORD_NUM_BRDR,H_COORD_NUM_BRDR,BRDR_RAT_BND,LATUD_MEX,"
                                        + "LATUD_MEX_DRCTN,LNGTD_MEX,LNGTD_MEX_DRCTN,CPP_IND,OPRTR_IND_NAME,LOCAREA,GRP_LOCAREA,"
                                        + "OPR_OWN,OPR_DONA,OPR_RECEP,AVAILABLE_CHAR1,AVAILABLE_CHAR2,AVAILABLE_DEC1,AVAILABLE_DEC2,"
                                        + "AUDIT_USER_ID,AUDIT_STAMP_DT,AUDIT_STAMP_TM) VALUES ('CPT','1','" + registrosF.get(j) + "'," + "'3','"
                                        + poblacion + "','" + estado + "','7','347','11096','2804','0','9683','4098','7','19.2','N',"
                                        + "'96.13','W','" + cpp + "','" + valor + "','347','H347','" + valor + "','','','','','0','0','" + user + "','" + hoy + "','" + hraFinal + "')");
                                    
                                    pstmtIn.executeUpdate();
                                    pstmtIn.close();
                                    con.getConexionBD().commit();
                                    operadorEx = "True";
                                    System.out.println("inserciones " + cont);
                                 

                                } else {
                                    valor = listPlan.get(i).getNombreCorto();
                                }
                                /*String insert = "INSERT INTO MOBPRC.TRCFM_RT_CNTR_MSTR (MKT_ID,RAT_CNTR_TYP,RAT_CNTR_CD,"
                                        + "DEST_RAT_AREA_VAL,POP_AREA_NAME,POP_AREA_ST_CD,NUM_DGTS_LADA_CD,ALT_LADA_CD,V_COORD_NUM,"
                                        + "H_COORD_NUM,WRLD_WD_LN,V_COORD_NUM_BRDR,H_COORD_NUM_BRDR,BRDR_RAT_BND,LATUD_MEX,"
                                        + "LATUD_MEX_DRCTN,LNGTD_MEX,LNGTD_MEX_DRCTN,CPP_IND,OPRTR_IND_NAME,LOCAREA,GRP_LOCAREA,"
                                        + "OPR_OWN,OPR_DONA,OPR_RECEP,AVAILABLE_CHAR1,AVAILABLE_CHAR2,AVAILABLE_DEC1,AVAILABLE_DEC2,"
                                        + "AUDIT_USER_ID,AUDIT_STAMP_DT,AUDIT_STAMP_TM) VALUES ('CPT','1','" + registrosF.get(j) + "'," + "'3','"
                                        + poblacion + "','" + estado + "','7','347','11096','2804','0','9683','4098','7','19.2','N',"
                                        + "'96.13','W','" + cpp + "','" + valor + "','347','H347','" + valor + "','','','','','0','0','" + user + "','" + hoy + "','" + hraFinal + "');";
                                // System.out.println("registros faltantes \n  dato      Razon Social                Nombre Corto               sentencia INsert\n"
                                //  + registrosF.get(j) + "   " + listPlan.get(i).getRazonSocial() + "     " + listPlan.get(i).getNombreCorto() + "     " + insert);
                                lista.setPrefijo(registrosF.get(j));
                                lista.setPoblacion(listPlan.get(i).getPoblacion());
                                lista.setEstado(listPlan.get(i).getEstado());
                                lista.setRazonSocial(listPlan.get(i).getRazonSocial());
                                lista.setNombreCorto(listPlan.get(i).getNombreCorto() + " / " + valor);
                                lista.setInsert(insert);
                                lista.setOperadorExiis(operadorEx);
                                listanf.add(lista);
*/

                            }
                        }
                        con.getClosed();
                    }
                }
            }
           // excel.crearEcel(listanf);

        } catch (Exception e) {
            //excel.crearEcel(listanf);
            System.out.println("Error al realizar la consulta" + e.getMessage());
        }
    }
}
