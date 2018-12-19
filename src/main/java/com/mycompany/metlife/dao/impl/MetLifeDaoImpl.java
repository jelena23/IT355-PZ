/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.metlife.dao.impl;

import com.mycompany.metlife.dao.MetLifeDao;
import com.mycompany.metlife.entity.FitnesCentar;
import com.mycompany.metlife.entity.KategorijaFitnesCentra;
import com.mycompany.metlife.entity.Kontakt;
import com.mycompany.metlife.entity.Korisnik;
import com.mycompany.metlife.entity.Termin;
import com.mycompany.metlife.entity.ZakazivanjeTermina;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jelena
 */
@Repository("metLifeDao")
@Service
public class MetLifeDaoImpl implements MetLifeDao{
     @Autowired
    private SessionFactory sessionFactory;

    
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    
    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    @Transactional
    public List<FitnesCentar> getFitnesCentri() {
    List<FitnesCentar> results = (List<FitnesCentar>) getSession().createCriteria(FitnesCentar.class).list();
        return results;    
    }

    @Override
    @Transactional
    public FitnesCentar getFitnesCentarById(int id) {
        FitnesCentar fitnesCentar = (FitnesCentar) getSession().createCriteria(FitnesCentar.class).add(Restrictions.eq("idFitnesCentar", id)).uniqueResult();
        return fitnesCentar;
    }

    @Override
    @Transactional
    public List<KategorijaFitnesCentra> getKategorijeFitnesCentara() {
        List<KategorijaFitnesCentra> results = (List<KategorijaFitnesCentra>) getSession().createCriteria(KategorijaFitnesCentra.class).list();
        return results;
    }

    @Override
    @Transactional
    public KategorijaFitnesCentra getKategorijaFitnesCentraById(int id) {
        KategorijaFitnesCentra kategorija = (KategorijaFitnesCentra) getSession().createCriteria(KategorijaFitnesCentra.class).add(Restrictions.eq("idKategorijaFitnesCentra", id)).uniqueResult();
        return kategorija;
    }

    @Override
    @Transactional
    public List<FitnesCentar> getFitnesCentriByKategorijaFitnesCentra(KategorijaFitnesCentra kategorijaFitnesCentra) {
       return (List<FitnesCentar>) getSession().createCriteria(FitnesCentar.class).add(Restrictions.eq("idKategorijaFitnesCentra", kategorijaFitnesCentra)).list();
    }

    @Override
    @Transactional
    public KategorijaFitnesCentra addKategorijaFitnesCentra(KategorijaFitnesCentra kategorijaFitnesCentra) {
        return (KategorijaFitnesCentra) getSession().merge(kategorijaFitnesCentra);
    }

    @Override
    @Transactional
    public FitnesCentar addFitnesCentar(FitnesCentar fitnesCentar) {
       return (FitnesCentar) getSession().merge(fitnesCentar);
    }

    @Override
    @Transactional
    public Korisnik registration(Korisnik korisnik) {
        return (Korisnik) getSession().merge(korisnik);
    }

    @Override
    @Transactional
    public List<Korisnik> getKorisnici() {
        List<Korisnik> results = (List<Korisnik>) getSession().createCriteria(Korisnik.class).list();
        return results;
    }

    @Override
    @Transactional
    public Korisnik getKorisnikById(int id) {
        Korisnik korisnik = (Korisnik) getSession().createCriteria(Korisnik.class).add(Restrictions.eq("idKorisnik", id)).uniqueResult();
        return korisnik;
    }

    @Override
    @Transactional
    public void editKategorijaFitnesCentra(KategorijaFitnesCentra kategorijaFitnesCentra) {
        getSession().update(kategorijaFitnesCentra);
    }

    @Override
    @Transactional
    public void deleteKategorijaFitnesCentra(KategorijaFitnesCentra kategorijaFitnesCentra) {
         getSession().delete(kategorijaFitnesCentra);
    }

    @Override
    @Transactional
    public void editFitnesCentar(FitnesCentar fitnesCentar) {
        getSession().update(fitnesCentar);
    }

    @Override
    @Transactional
    public void deleteFitnesCentar(FitnesCentar fitnesCentar) {
       getSession().delete(fitnesCentar);
    }

    @Override
    @Transactional
    public List<Termin> getTermini() {
        List<Termin> results = (List<Termin>) getSession().createCriteria(Termin.class).list();
        return results;
    }

    @Override
    @Transactional
    public Termin getTerminById(int id) {
        Termin servis = (Termin) getSession().createCriteria(Termin.class).add(Restrictions.eq("idTermin", id)).uniqueResult();
        return servis;
    }

    @Override
    @Transactional
    public List<Termin> getTerminByFitnesCentar(FitnesCentar fitnesCentar) {
         return (List<Termin>) getSession().createCriteria(FitnesCentar.class).add(Restrictions.eq("idFitnesCentar", fitnesCentar)).list();
    }

    @Override
    @Transactional
    public Termin addTermin(Termin termin) {
        return (Termin) getSession().merge(termin);
    }

    @Override
    @Transactional
    public void editTermin(Termin termin) {
        getSession().update(termin);
    }

    @Override
    @Transactional
    public void deleteTermin(Termin termin) {
        getSession().delete(termin);
    }

    @Override
    @Transactional
    public ZakazivanjeTermina addZakazivanjeTermina(ZakazivanjeTermina zt) {
        return (ZakazivanjeTermina) getSession().merge(zt);
    }

    @Override
    @Transactional
    public List<ZakazivanjeTermina> getZakazaniTermini() {
        List<ZakazivanjeTermina> results = (List<ZakazivanjeTermina>) getSession().createCriteria(ZakazivanjeTermina.class).list();
        return results;
    }

    @Override
    @Transactional
    public void deleteZakazaniTermin(ZakazivanjeTermina zt) {
        getSession().delete(zt);
    }

    @Override
    @Transactional
    public Korisnik findUserByEmail(String email) {
        Korisnik user = (Korisnik) getSession().createCriteria(Korisnik.class).add(Restrictions.eq("emailKorisnik", email)).uniqueResult();
        return user;
    }

    @Override
    @Transactional
    public Kontakt sendKontakt(Kontakt kontakt) {
        return (Kontakt) getSession().merge(kontakt);
    }

    @Override
    @Transactional
    public List<Kontakt> getKontaktPoruke() {
        List<Kontakt> results = (List<Kontakt>) getSession().createCriteria(Kontakt.class).list();
        return results;
    }

    @Override
    @Transactional
    public void deleteKontaktPoruka(Kontakt kontakt) {
        getSession().delete(kontakt);
    }

    @Override
    @Transactional
    public Kontakt getKontaktPorukaById(int id) {
        Kontakt kontakt = (Kontakt) getSession().createCriteria(Kontakt.class).add(Restrictions.eq("idKontakt", id)).uniqueResult();
        return kontakt;
    }
    
}
