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
    private String poblacion;
    private String estado;
    private String razonSocial;
    private String nombreCorto;
    private String insert;

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

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getInsert() {
        return insert;
    }

    public void setInsert(String insert) {
        this.insert = insert;
    }
    

    public ListaNF() {
    }

    public ListaNF(String prefijo, String poblacion, String estado, String razonSocial, String nombreCorto, String insert) {
        this.prefijo = prefijo;
        this.poblacion = poblacion;
        this.estado = estado;
        this.razonSocial = razonSocial;
        this.nombreCorto = nombreCorto;
        this.insert = insert;
    }

    
    public  List<String> obteneterAtributos(){
        List<String> atributos = new ArrayList();
        atributos.add(this.prefijo);
        atributos.add(this.poblacion);
        atributos.add(this.estado);
        atributos.add(this.razonSocial);
        atributos.add(this.nombreCorto);
        atributos.add(this.insert);
        return atributos;
    }
    
}
