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
@Table(name = "ZAKAZIVANJETERMINA")
public class ZakazivanjeTermina {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDZAKAZIVANJE")
    private Integer idZakazivanje;
    
    @ManyToOne
    @JoinColumn(name = "IDKORISNIK", referencedColumnName = "IDKORISNIK")
    private Korisnik korisnik;
    
    @Column(name = "PORUKA")
    private String poruka;

    public Integer getIdZakazivanje() {
        return idZakazivanje;
    }

    public void setIdZakazivanje(Integer idZakazivanje) {
        this.idZakazivanje = idZakazivanje;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }

    public String getPoruka() {
        return poruka;
    }

    public void setPoruka(String poruka) {
        this.poruka = poruka;
    }

    @Override
    public String toString() {
        return "ZakazivanjeTermina{" + "idZakazivanje=" + idZakazivanje + ", korisnik=" + korisnik + ", poruka=" + poruka + '}';
    }
 
}

