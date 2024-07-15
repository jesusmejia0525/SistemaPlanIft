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
    private String nir;
    private String serie;
    private String numI;
    private String numF;
    private String razonSocial;
    private String nombreCorto;
    private String prefijo;

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
        return "PlanIftDto{" + "nir=" + nir + ", serie=" + serie + ", numI=" + numI + ", numF=" + numF + ", razonSocial=" + razonSocial + ", nombreCorto=" + nombreCorto + ", prefijo=" + prefijo + '}';
    }
    
    


    
}
