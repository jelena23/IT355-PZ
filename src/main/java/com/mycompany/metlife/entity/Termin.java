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
@Table(name = "TERMIN")
public class Termin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDTERMIN")
    private Integer idTermin;
    
    @ManyToOne
    @JoinColumn(name = "IDFITNESCENTAR", referencedColumnName = "IDFITNESCENTAR")
    private FitnesCentar fitnesCentar;
    

    @Column(name = "VREMEOD")
    private String vremeOd;
    

    @Column(name = "VREMEDO")
    private String vremeDo;

    public Integer getIdTermin() {
        return idTermin;
    }

    public void setIdTermin(Integer idTermin) {
        this.idTermin = idTermin;
    }

    public FitnesCentar getFitnesCentar() {
        return fitnesCentar;
    }

    public void setFitnesCentar(FitnesCentar fitnesCentar) {
        this.fitnesCentar = fitnesCentar;
    }

    public String getVremeOd() {
        return vremeOd;
    }

    public void setVremeOd(String vremeOd) {
        this.vremeOd = vremeOd;
    }

    public String getVremeDo() {
        return vremeDo;
    }

    public void setVremeDo(String vremeDo) {
        this.vremeDo = vremeDo;
    }

    @Override
    public String toString() {
        return "Termin{" + "idTermin=" + idTermin + ", fitnesCentar=" + fitnesCentar + ", vremeOd=" + vremeOd + ", vremeDo=" + vremeDo + '}';
    }
 
}
