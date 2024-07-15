/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaplanift.Excel;

import java.io.*;
import java.lang.reflect.Field;
import java.util.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import sistemaplanift.dto.ListaNF;

import sistemaplanift.dto.PlanIftDto;

/**
 *
 * @author VIQG01X
 */
public class Excel {
    public String n1="Plan IFT 03 junio";
    public String n2="completo";

    public List<PlanIftDto> leerExcel() {
        Cell nir = null;
        Cell serie = null;
        List<PlanIftDto> listPlan = new ArrayList<>();
        File archivo = new File("C:/Users/VIQG01X/Downloads/"+n1+".xlsx");

        try {
            if (archivo == null) {
                System.out.println("No hay archivo");
            } else {
                InputStream input = new FileInputStream(archivo);
                Workbook libro = new XSSFWorkbook(input);
               Sheet hoja = libro.getSheetAt(0);
                Iterator<Row> filas = hoja.rowIterator();

                while (filas.hasNext()) {
                    Row fila = filas.next();
                    PlanIftDto plan = new PlanIftDto();
                    plan.setNir(fila.getCell(0).toString());
                    plan.setSerie(fila.getCell(1).toString());
                    plan.setNumI(fila.getCell(2).toString());
                    plan.setNumF(fila.getCell(3).toString());
                    plan.setRazonSocial(fila.getCell(4).toString());
                    plan.setNombreCorto(fila.getCell(5).toString());
                    listPlan.add(plan);
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listPlan;
    }

    public void crearEcel(List<ListaNF> numerosF) {
        Field[] campos = ListaNF.class.getDeclaredFields();
        XSSFWorkbook libro = new XSSFWorkbook();
        XSSFSheet hoja = libro.createSheet("Numeros Faltantes");
        XSSFRow fila = null;
        XSSFCell celda = null;

        for (int i = 0; i < numerosF.size(); i++) {
            if (i == 0) {
                fila = hoja.createRow(0);
                for (int j = 0; j < campos.length; j++) {
                    celda = fila.createCell(j);
                    celda.setCellValue(campos[j].getName());
                }
            }
            ListaNF listado= numerosF.get(i);
            List<String> atributos= listado.obteneterAtributos();
            fila=hoja.createRow(i+1);
            for (int a = 0; a < atributos.size(); a++) {
                celda=fila.createCell(a);
                celda.setCellValue(atributos.get(a));
                
            }
        }
        try {
            OutputStream output = new FileOutputStream("PrefijosFaltantes"+n2+".xlsx");
            libro.write(output);
            libro.close();
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error al crear el documento");
        }

    }

}
