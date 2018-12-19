/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.metlife.service.impl;

import com.mycompany.metlife.dao.MetLifeDao;
import com.mycompany.metlife.entity.FitnesCentar;
import com.mycompany.metlife.entity.KategorijaFitnesCentra;
import com.mycompany.metlife.entity.Kontakt;
import com.mycompany.metlife.entity.Korisnik;
import com.mycompany.metlife.entity.Termin;
import com.mycompany.metlife.entity.ZakazivanjeTermina;
import com.mycompany.metlife.service.MetLifeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jelena
 */
@Service
public class MetLifeServiceImpl implements MetLifeService {
    
    @Autowired
    MetLifeDao metLifeDao;

    @Override
    public List<FitnesCentar> getFitnesCentri() {
        return metLifeDao.getFitnesCentri();
    }

    @Override
    public FitnesCentar getFitnesCentarById(int id) {
        return metLifeDao.getFitnesCentarById(id);
    }

    @Override
    public List<KategorijaFitnesCentra> getKategorijeFitnesCentara() {
        return metLifeDao.getKategorijeFitnesCentara();
    }

    @Override
    public KategorijaFitnesCentra getKategorijaFitnesCentraById(int id) {
        return metLifeDao.getKategorijaFitnesCentraById(id);
    }

    @Override
    public List<FitnesCentar> getFitnesCentriByKategorijaFitnesCentra(KategorijaFitnesCentra kategorijaFitnesCentra) {
        return metLifeDao.getFitnesCentriByKategorijaFitnesCentra(kategorijaFitnesCentra);
    }

    @Override
    public KategorijaFitnesCentra addKategorijaFitnesCentra(KategorijaFitnesCentra kategorijaFitnesCentra) {
        return metLifeDao.addKategorijaFitnesCentra(kategorijaFitnesCentra);
    }

    @Override
    public FitnesCentar addFitnesCentar(FitnesCentar fitnesCentar) {
        return metLifeDao.addFitnesCentar(fitnesCentar);
    }

    @Override
    public Korisnik registration(Korisnik korisnik) {
        return metLifeDao.registration(korisnik);
    }

    @Override
    public List<Korisnik> getKorisnici() {
        return metLifeDao.getKorisnici();
    }

    @Override
    public Korisnik getKorisnikById(int id) {
        return metLifeDao.getKorisnikById(id);
    }

    @Override
    public void editKategorijaFitnesCentra(KategorijaFitnesCentra kategorijaFitnesCentra) {
        metLifeDao.editKategorijaFitnesCentra(kategorijaFitnesCentra);
    }

    @Override
    public void deleteKategorijaFitnesCentra(KategorijaFitnesCentra kategorijaFitnesCentra) {
        metLifeDao.deleteKategorijaFitnesCentra(kategorijaFitnesCentra);
    }

    @Override
    public void editFitnesCentar(FitnesCentar fitnesCentar) {
        metLifeDao.editFitnesCentar(fitnesCentar);
    }

    @Override
    public void deleteFitnesCentar(FitnesCentar fitnesCentar) {
        metLifeDao.deleteFitnesCentar(fitnesCentar);
    }

    @Override
    public List<Termin> getTermini() {
        return metLifeDao.getTermini();
    }

    @Override
    public Termin getTerminById(int id) {
        return metLifeDao.getTerminById(id);
    }

    @Override
    public List<Termin> getTerminByFitnesCentar(FitnesCentar fitnesCentar) {
        return metLifeDao.getTerminByFitnesCentar(fitnesCentar);
    }

    @Override
    public Termin addTermin(Termin termin) {
        return metLifeDao.addTermin(termin);
    }

    @Override
    public void editTermin(Termin termin) {
        metLifeDao.editTermin(termin);
    }

    @Override
    public void deleteTermin(Termin termin) {
        metLifeDao.deleteTermin(termin);
    }

    @Override
    public ZakazivanjeTermina addZakazivanjeTermina(ZakazivanjeTermina zt) {
       return metLifeDao.addZakazivanjeTermina(zt);
    }

    @Override
    public List<ZakazivanjeTermina> getZakazaniTermini() {
        return metLifeDao.getZakazaniTermini();
    }

    @Override
    public void deleteZakazaniTermin(ZakazivanjeTermina zt) {
       metLifeDao.deleteZakazaniTermin(zt);
    }

    @Override
    public Korisnik findUserByEmail(String email) {
        return metLifeDao.findUserByEmail(email);
    }

    @Override
    public Kontakt sendKontakt(Kontakt kontakt) {
        return metLifeDao.sendKontakt(kontakt);
    }

    @Override
    public List<Kontakt> getKontaktPoruke() {
        return metLifeDao.getKontaktPoruke();
    }

    @Override
    public void deleteKontaktPoruka(Kontakt kontakt) {
        metLifeDao.deleteKontaktPoruka(kontakt);
    }

    @Override
    public Kontakt getKontaktPorukaById(int id) {
        return metLifeDao.getKontaktPorukaById(id);
    }
    
    
}
