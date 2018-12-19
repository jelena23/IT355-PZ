/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.metlife.dao;

import com.mycompany.metlife.entity.FitnesCentar;
import com.mycompany.metlife.entity.KategorijaFitnesCentra;
import com.mycompany.metlife.entity.Kontakt;
import com.mycompany.metlife.entity.Korisnik;
import com.mycompany.metlife.entity.Termin;
import com.mycompany.metlife.entity.ZakazivanjeTermina;
import java.util.List;

/**
 *
 * @author Jelena
 */
public interface MetLifeDao {
    public List<FitnesCentar> getFitnesCentri();
    
    public FitnesCentar getFitnesCentarById(int id);
    
    public List<KategorijaFitnesCentra> getKategorijeFitnesCentara();

    public KategorijaFitnesCentra getKategorijaFitnesCentraById(int id);

    public List<FitnesCentar> getFitnesCentriByKategorijaFitnesCentra(KategorijaFitnesCentra kategorijaFitnesCentra);
    
    public KategorijaFitnesCentra addKategorijaFitnesCentra(KategorijaFitnesCentra kategorijaFitnesCentra);
    
    public FitnesCentar addFitnesCentar(FitnesCentar FitnesCentar);

    public Korisnik registration(Korisnik korisnik);
    
    public List<Korisnik> getKorisnici();
    
    public Korisnik getKorisnikById(int id);
    
    public void editKategorijaFitnesCentra(KategorijaFitnesCentra kategorijaFitnesCentra);
    
    public void deleteKategorijaFitnesCentra(KategorijaFitnesCentra kategorijaFitnesCentra);
    
    public void editFitnesCentar(FitnesCentar fitnesCentar);
    
    public void deleteFitnesCentar(FitnesCentar fitnesCentar);
    
    public List<Termin> getTermini();
    
    public Termin getTerminById(int id);
    
    public List<Termin> getTerminByFitnesCentar(FitnesCentar fitnesCentar);
    
    public Termin addTermin(Termin termin);
    
    public void editTermin(Termin termin);
    
    public void deleteTermin(Termin termin);
    
    public ZakazivanjeTermina addZakazivanjeTermina(ZakazivanjeTermina zt);
    
    public List<ZakazivanjeTermina> getZakazaniTermini();
    
    public void deleteZakazaniTermin(ZakazivanjeTermina zt);
    
    public Korisnik findUserByEmail(String email);
    
    public Kontakt sendKontakt(Kontakt kontakt);
    
    public List<Kontakt> getKontaktPoruke();
    
    public void deleteKontaktPoruka(Kontakt kontakt);
    
    public Kontakt getKontaktPorukaById(int id); 
}
