/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificatep;

/**
 *
 * @author Crippa_Andrea
 */
public class InfoRegione {

   
    private String anno;
    private String codice;
    private String regioni;
    private String olive_superficie__ha_;
    private String olive_superficie_in_produzione__ha_;
    private String olive_produzione__quintali_;
    private String olive_da_tavola_produzione_raccolta__quintali_;
    private String olive_da_tavola_produzione__quintali_;
    private String olive_da_olio_produzione__quintali_;
    private String olio_di_pressione_resa_di_produzione__quintali_;
    private String olio_di_pressione_produzione__quintali_;
    
    

    public InfoRegione() {
        this.anno = "";
        this.codice = "";
        this.regioni = "";
        this.olive_superficie__ha_ = "";
        this.olive_superficie_in_produzione__ha_ = "";
        this.olive_produzione__quintali_ = "";
        this.olive_da_tavola_produzione_raccolta__quintali_ = "";
        this.olive_da_tavola_produzione__quintali_ = "";
        this.olive_da_olio_produzione__quintali_ = "";
        this.olio_di_pressione_resa_di_produzione__quintali_ = "";
        this.olio_di_pressione_produzione__quintali_ = "";
    }

    public InfoRegione(String anno, String codice, String regioni, String olive_superficie__ha_, String olive_superficie_in_produzione__ha_,
            String olive_produzione__quintali_, String olive_da_tavola_produzione_raccolta__quintali_, String olive_da_tavola_produzione__quintali_, String olive_da_olio_produzione__quintali_, String olio_di_pressione_resa_di_produzione__quintali_, String olio_di_pressione_produzione__quintali_) {
        this.anno = anno;
        this.codice = codice;
        this.regioni = regioni;
        this.olive_superficie__ha_ = olive_superficie__ha_;
        this.olive_superficie_in_produzione__ha_ = olive_superficie_in_produzione__ha_;
        this.olive_produzione__quintali_ = olive_produzione__quintali_;
        this.olive_da_tavola_produzione_raccolta__quintali_ = olive_da_tavola_produzione_raccolta__quintali_;
        this.olive_da_tavola_produzione__quintali_ = olive_da_tavola_produzione__quintali_;
        this.olive_da_olio_produzione__quintali_ = olive_da_olio_produzione__quintali_;
        this.olio_di_pressione_resa_di_produzione__quintali_ = olio_di_pressione_resa_di_produzione__quintali_;
        this.olio_di_pressione_produzione__quintali_ = olio_di_pressione_produzione__quintali_;
    }

    public InfoRegione(InfoRegione VerificaTep) {
        this.anno = VerificaTep.anno;
        this.codice = VerificaTep.codice;
        this.regioni = VerificaTep.regioni;
        this.olive_superficie__ha_ = VerificaTep.olive_superficie__ha_;
        this.olive_superficie_in_produzione__ha_ = VerificaTep.olive_superficie_in_produzione__ha_;
        this.olive_produzione__quintali_ = VerificaTep.olive_produzione__quintali_;
        this.olive_da_tavola_produzione_raccolta__quintali_ = VerificaTep.olive_da_tavola_produzione_raccolta__quintali_;
        this.olive_da_tavola_produzione__quintali_ = VerificaTep.olive_da_tavola_produzione__quintali_;
        this.olive_da_olio_produzione__quintali_ = VerificaTep.olive_da_olio_produzione__quintali_;
        this.olio_di_pressione_resa_di_produzione__quintali_ = VerificaTep.olio_di_pressione_resa_di_produzione__quintali_;
        this.olio_di_pressione_produzione__quintali_ = VerificaTep.olio_di_pressione_produzione__quintali_;
    }

    public String getanno() {
        return anno;
    }

    public String getcodice() {
        return codice;
    }

    public String getregioni() {
        return regioni;
    }

    public String getolive_superficie__ha_() {
        return olive_superficie__ha_;
    }
    
    public String getolive_superficie_in_produzione__ha_() {
        return olive_superficie_in_produzione__ha_;
    }
    
    public String getolive_produzione__quintali_() {
        return olive_produzione__quintali_;
    }
    
    public String getolive_da_tavola_produzione_raccolta__quintali_() {
        return olive_da_tavola_produzione_raccolta__quintali_;
    }
    
    public String getolive_da_tavola_produzione__quintali_() {
        return olive_da_tavola_produzione__quintali_;
    }
    
    public String getolive_da_olio_produzione__quintali_() {
        return olive_superficie_in_produzione__ha_;
    }
    
    public String getolio_di_pressione_resa_di_produzione__quintali_() {
        return olive_superficie_in_produzione__ha_;
    }
    
    public String getolio_di_pressione_produzione__quintali_() {
        return olio_di_pressione_produzione__quintali_;
    }

    public void setanno(String anno) {
        this.anno = anno;
    }

    public void setdocente(String codice) {
        this.codice = codice;
    }

    public void setgiorno(String regioni) {
        this.regioni = regioni;
    }

    public void setOra(String olive_superficie__ha_) {
        this.olive_superficie__ha_ = olive_superficie__ha_;
    }
    
    public void setolive_superficie_in_produzione__ha_(String olive_superficie_in_produzione__ha_) {
        this.olive_superficie_in_produzione__ha_ = olive_superficie_in_produzione__ha_;
    }
    
    public void setolive_produzione__quintali_(String olive_produzione__quintali_) {
        this.olive_produzione__quintali_ = olive_produzione__quintali_;
    }
    
    public void setolive_da_tavola_produzione_raccolta__quintali_(String olive_da_tavola_produzione_raccolta__quintali_) {
        this.olive_da_tavola_produzione_raccolta__quintali_ = olive_da_tavola_produzione_raccolta__quintali_;
    }
    
    public void setolive_da_tavola_produzione__quintali_(String olive_da_tavola_produzione__quintali_) {
        this.olive_da_tavola_produzione__quintali_ = olive_da_tavola_produzione__quintali_;
    }
    
    public void setolive_da_olio_produzione__quintali_(String olive_da_olio_produzione__quintali_) {
        this.olive_da_olio_produzione__quintali_ = olive_da_olio_produzione__quintali_;
    }
    
    public void setolio_di_pressione_resa_di_produzione__quintali_(String olio_di_pressione_resa_di_produzione__quintali_) {
        this.olio_di_pressione_resa_di_produzione__quintali_ = olio_di_pressione_resa_di_produzione__quintali_;
    }
    
    public void setolio_di_pressione_produzione__quintali_(String olio_di_pressione_produzione__quintali_) {
        this.olio_di_pressione_produzione__quintali_ = olio_di_pressione_produzione__quintali_;
    }

    public String toString() {
        return anno + " , " + codice + " , " + regioni + " , " +olive_superficie__ha_ + " , " +olive_superficie_in_produzione__ha_ + " , " +olive_produzione__quintali_ + " , " +olive_da_tavola_produzione_raccolta__quintali_ + " , " +olive_da_tavola_produzione__quintali_ + " , " +olive_da_olio_produzione__quintali_ + " , " + olio_di_pressione_resa_di_produzione__quintali_+" , " + olio_di_pressione_produzione__quintali_ ; 
    }
}
