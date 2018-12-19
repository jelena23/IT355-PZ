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
import javax.persistence.Table;

/**
 *
 * @author Jelena
 */
@Entity
@Table(name = "KATEGORIJAFITNESCENTRA")
public class KategorijaFitnesCentra {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDKATEGORIJAFITNESCENTRA")
    private Integer idKategorijaFitnesCentra;

    @Column(name = "NAZIVKATEGORIJA")
    private String nazivKategorija;

    public Integer getIdKategorijaFitnesCentra() {
        return idKategorijaFitnesCentra;
    }

    public void setIdKategorijaFitnesCentra(Integer idKategorijaFitnesCentra) {
        this.idKategorijaFitnesCentra = idKategorijaFitnesCentra;
    }

    public String getNazivKategorija() {
        return nazivKategorija;
    }

    public void setNazivKategorija(String nazivKategorija) {
        this.nazivKategorija = nazivKategorija;
    }

    @Override
    public String toString() {
        return "KategorijaFitnesCentra{" + "idKategorijaFitnesCentra=" + idKategorijaFitnesCentra + ", nazivKategorija=" + nazivKategorija + '}';
    }
    
}
