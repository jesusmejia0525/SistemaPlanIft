/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaplanift.dto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VIQG01X
 */
public class ListaNF {
    private String prefijo;
    private String razonSocial;
    private String nombreCorto;

    public String getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombreCorto() {
        return nombreCorto;
    }

    public void setNombreCorto(String nombreCorto) {
        this.nombreCorto = nombreCorto;
    }

    public ListaNF() {
    }

    public ListaNF(String prefijo, String razonSocial, String nombreCorto) {
        this.prefijo = prefijo;
        this.razonSocial = razonSocial;
        this.nombreCorto = nombreCorto;
    }
    
    public  List<String> obteneterAtributos(){
        List<String> atributos = new ArrayList();
        atributos.add(this.prefijo);
        atributos.add(this.razonSocial);
        atributos.add(this.nombreCorto);
        return atributos;
    }
    
}
