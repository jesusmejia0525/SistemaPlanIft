/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaplanift;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import sistemaplanift.BuscarRegistros.BuscarRegistros;
import sistemaplanift.ConexionBD.Conexion;
import sistemaplanift.Excel.Excel;
import sistemaplanift.dto.ListaNF;
import sistemaplanift.dto.PlanIftDto;

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
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        Conexion con = new Conexion();
        Excel excel = new Excel();
        List<PlanIftDto> listPlan = new ArrayList<>();
        listPlan = excel.leerExcel();
        System.out.println("NUmero de datos en excel "+ listPlan.size());
        List<ListaNF> listanf=new ArrayList<>();

        try {
            if (con != null) {
                System.out.println("DB2 Database Connected");
            } else {
                System.out.println("Db2 connection Failed ");
            }
            for (int i = 0; i < listPlan.size(); i++) {
                if (!listPlan.get(i).getNir().isEmpty() && !listPlan.get(i).getSerie().isEmpty()) {
                    System.out.println(i+ " ----------------------------");
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
                    int contador = Integer.parseInt(prefijoI);
                    pstmt = con.getConexionBD().prepareStatement("SELECT * FROM MOBPRC.TRCFM_RT_CNTR_MSTR WHERE RAT_CNTR_CD BETWEEN '" + prefijoI + "' AND '" + prefijoF + "' AND MKT_ID = 'CPT' AND RAT_CNTR_TYP ='1'");
                    rset = pstmt.executeQuery();
                    
                    if (rset != null) {
                        ArrayList<String> datosBD = new ArrayList<>();
                        while (rset.next()) {
                            datosBD.add(rset.getString("RAT_CNTR_CD"));
                        }
                        
                        BuscarRegistros buscar = new BuscarRegistros();
                        List<String> registrosF=new ArrayList<>();
                        registrosF=buscar.registrosFaltantes(prefijoI, prefijoF, datosBD);
                        if(!registrosF.isEmpty()){
                            for (int j = 0; j < registrosF.size(); j++) {
                                ListaNF lista=new ListaNF();
                                System.out.println("registros faltantes \n  dato      Razon Social                Nombre Corto    \n"
                                        +registrosF.get(j)+"   "+listPlan.get(i).getRazonSocial()+"     "+listPlan.get(i).getNombreCorto());
                                lista.setPrefijo(registrosF.get(j));
                                lista.setRazonSocial(listPlan.get(i).getRazonSocial());
                                lista.setNombreCorto(listPlan.get(i).getNombreCorto());
                                listanf.add(lista);
                            }
                        }
                        con.getClosed();
                        //rset.close();
                        //con.getConexionBD().close();

                    }
                    
                    //  for (int j = nI; j <= nF; j++) {
                    //  System.out.println("prefijo "+nirSe+""+j );
                    //  }
                }
            }
            excel.crearEcel(listanf);
            
        } catch (Exception e) {
            System.out.println("Error al realizar la consulta de la serie"+e.getStackTrace().toString());
        }
    }
}
