/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.metlife.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 *
 * @author Jelena
 */
@Entity
@Table(name = "FITNESCENTAR")
public class FitnesCentar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDFITNESCENTAR")
    private Integer idFitnesCentar;
    
    @ManyToOne
    @JoinColumn(name = "IDKATEGORIJAFITNESCENTRA", referencedColumnName = "IDKATEGORIJAFITNESCENTRA")
    private KategorijaFitnesCentra kategorijaFitnesCentra;
    
    @Column(name = "IMEFITNESCENTAR")
    private String imeFitnesCentar;
    
    @Column(name = "CLANARINA")
    private String clanarina;
    
    @Column(name = "OPIS")
    private String opis;
    
    @Column(name = "RADNOVREME")
    private String radnoVreme;

    public Integer getIdFitnesCentar() {
        return idFitnesCentar;
    }

    public void setIdFitnesCentar(Integer idFitnesCentar) {
        this.idFitnesCentar = idFitnesCentar;
    }

    public KategorijaFitnesCentra getKategorijaFitnesCentra() {
        return kategorijaFitnesCentra;
    }

    public void setKategorijaFitnesCentra(KategorijaFitnesCentra kategorijaFitnesCentra) {
        this.kategorijaFitnesCentra = kategorijaFitnesCentra;
    }

    public String getImeFitnesCentar() {
        return imeFitnesCentar;
    }

    public void setImeFitnesCentar(String imeFitnesCentar) {
        this.imeFitnesCentar = imeFitnesCentar;
    }

    public String getClanarina() {
        return clanarina;
    }

    public void setClanarina(String clanarina) {
        this.clanarina = clanarina;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getRadnoVreme() {
        return radnoVreme;
    }

    public void setRadnoVreme(String radnoVreme) {
        this.radnoVreme = radnoVreme;
    }

    @Override
    public String toString() {
        return "FitnesCentar{" + "idFitnesCentar=" + idFitnesCentar + ", kategorijaFitnesCentra=" + kategorijaFitnesCentra + ", imeFitnesCentar=" + imeFitnesCentar + ", clanarina=" + clanarina + ", opis=" + opis + ", radnoVreme=" + radnoVreme + '}';
    }
    
    
    
}
