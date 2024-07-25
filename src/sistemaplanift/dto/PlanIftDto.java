/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaplanift.dto;

/**
 *
 * @author VIQG01X
 */
public class PlanIftDto {
    
    private String poblacion;
    private String estado;
    private String nir;
    private String serie;
    private String numI;
    private String numF;
    private String cpp;
    private String razonSocial;
    private String nombreCorto;
    private String prefijo;

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

    public String getNir() {
        return nir;
    }

    public void setNir(String nir) {
        this.nir = nir;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNumI() {
        return numI;
    }

    public void setNumI(String numI) {
        this.numI = numI;
    }

    public String getNumF() {
        return numF;
    }

    public void setNumF(String numF) {
        this.numF = numF;
    }

    public String getCpp() {
        return cpp;
    }

    public void setCpp(String cpp) {
        this.cpp = cpp;
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

    public String getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }

    @Override
    public String toString() {
        return "PlanIftDto{" + "poblacion=" + poblacion + ", estado=" + estado + ", nir=" + nir + ", serie=" + serie + ", numI=" + numI + ", numF=" + numF + ", cpp=" + cpp + ", razonSocial=" + razonSocial + ", nombreCorto=" + nombreCorto + ", prefijo=" + prefijo + '}';
    }

 


      
}
