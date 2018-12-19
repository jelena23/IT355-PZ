/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.metlife.controller;

import com.mycompany.metlife.dao.MetLifeDao;
import com.mycompany.metlife.entity.FitnesCentar;
import com.mycompany.metlife.entity.KategorijaFitnesCentra;
import com.mycompany.metlife.entity.Kontakt;
import com.mycompany.metlife.entity.Korisnik;
import com.mycompany.metlife.entity.Rola;
import com.mycompany.metlife.entity.Termin;
import com.mycompany.metlife.entity.ZakazivanjeTermina;
import com.mycompany.metlife.service.MetLifeService;
import java.security.Principal;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Jelena
 */
@Controller 
public class CRUDController {
     @Autowired
    MetLifeDao metLifeDao;
    
    @Autowired
    MetLifeService metLifeService;
    
    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView model = new ModelAndView();
        model.setViewName("home");
        return model;
    }
    
    @RequestMapping(value = {"/home"}, method = RequestMethod.GET)
    public ModelAndView homePage() {
        ModelAndView model = new ModelAndView();
        model.setViewName("home");
        return model;
    }
    
    @RequestMapping(value = "/galerija", method = RequestMethod.GET)
    public String galerija(Model model) {
        return "galerija";
    }
    
    
    @RequestMapping(value = "/onama", method = RequestMethod.GET)
    public String onama(Model model) {
        return "onama";
    }
    
    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("korisnik", new Korisnik());
        return "registration";
    }
    
    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public ModelAndView registration(@ModelAttribute("korisnik") Korisnik k, ModelAndView model) {
        k.setActive(true);
        Rola rola = new Rola();
        rola.setIdRola(2);
        k.setRola(rola);
        k = metLifeService.registration(k);
        model.addObject("successMsg", "Registracija je uspesna!");
        model.addObject("korisnik", k);
        return model;
        //dodati ucitavanje datuma registracije
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(@RequestParam(value = "error", required = false) String error,
            @RequestParam(value = "logout", required = false) String logout) {
        ModelAndView model = new ModelAndView();

        if (error != null) {
            model.addObject("error", "Uneti podaci su neispravni!");
        }
        if (logout != null) {
            model.addObject("msg", "Uspesno ste se odjavili");
        }
        model.setViewName("login");
        return model;
    }
    
    @RequestMapping(value = "/addKategorijaFitnesCentra", method = RequestMethod.GET)
    public String addKategorijaFitnesCentra(Model model) {
        model.addAttribute("kategorijaFitnesCentra", new KategorijaFitnesCentra());
        return "addKategorijaFitnesCentra";
    }
    
    @RequestMapping(value = "/addKategorijaFitnesCentra", method = RequestMethod.POST)
    public ModelAndView addKategorijaFitnesCentra(@ModelAttribute("kategorijaFitnesCentra") KategorijaFitnesCentra kfc,ModelAndView model) {
        
        if(kfc.getIdKategorijaFitnesCentra() == null){
            kfc = metLifeService.addKategorijaFitnesCentra(kfc);
        }else{
            metLifeService.editKategorijaFitnesCentra(kfc);
        }

        model.addObject("successMsg", "Kategorija fitnes centara je uspesno dodata!");
        return model;
    }
    
    
    @RequestMapping(value = "/viewKategorijeFitnesCentara", method = RequestMethod.GET)
    public ModelAndView getKategorijeFitnesCentara(ModelAndView model) {
        model.addObject("kategorijeFitnesCentara", metLifeService.getKategorijeFitnesCentara());
        model.addObject("kategorijaFitnesCentra", new KategorijaFitnesCentra());
        return model;
    }
    
    @RequestMapping(value = "/editKategorijaFitnesCentra/{idKategorijaFitnesCentra}", method = RequestMethod.GET)
    public String editKategorijaFitnesCentra(@PathVariable("idKategorijaFitnesCentra") int id, Model model) {
        KategorijaFitnesCentra kfc = metLifeService.getKategorijaFitnesCentraById(id);
        model.addAttribute("kategorijaFitnesCentra", kfc);
        return "addKategorijaFitnesCentra";
    }
    
    @RequestMapping(value = "/editKategorijaFitnesCentra", method = RequestMethod.POST)
    public ModelAndView editKategorijaFitnesCentra(@ModelAttribute("idKategorijaFitnesCentra") KategorijaFitnesCentra kfc, ModelAndView model) {
        metLifeService.editKategorijaFitnesCentra(kfc);
        model.addObject("successMsg", "Kategorija fitnes centra je uspesno izmenjena.");
        return model;
    }
    
    
    @RequestMapping(value = "/deleteKategorijaFitnesCentra/{idKategorijaFitnesCentra}", method = RequestMethod.GET)
    public String deleteKategorijaFitnesCentra(@PathVariable("idKategorijaFitnesCentra") int id, HttpServletRequest request) {
        System.out.println("Fetching & Deleting kategorija fitnes centra with id " + id);
 
        KategorijaFitnesCentra kfc = metLifeService.getKategorijaFitnesCentraById(id);
        if (kfc == null) {
            System.out.println("Nije moguce izvrsiti brisanje. Kategorija fitnes centra sa id " + id + " nije pronadjena.");
            String referer = request.getHeader("Referer");
            return "redirect:" + referer;
        }

       
        metLifeService.deleteKategorijaFitnesCentra(kfc);
        String referer = request.getHeader("Referer");
        return "redirect:" + referer;
    }
    
    @RequestMapping(value = "/addFitnesCentar", method = RequestMethod.GET)
    public String addFitnesCentar(Model model) {
        model.addAttribute("fitnesCentar", new FitnesCentar());
        model.addAttribute("kategorijeFitnesCentara", metLifeService.getKategorijeFitnesCentara());
        return "addFitnesCentar";
    }

    @RequestMapping(value = "/addFitnesCentar", method = RequestMethod.POST)
    public ModelAndView addFitnesCentar(@ModelAttribute("fitnesCentar") FitnesCentar fc, ModelAndView model) {
        
        if(fc.getIdFitnesCentar() == null){
            fc = metLifeService.addFitnesCentar(fc);
        }else{
            metLifeService.editFitnesCentar(fc);
        }
        
        model.addObject("kategorijeFitnesCentara", metLifeService.getKategorijeFitnesCentara());
        model.addObject("successMsg", "Fitnes centar je uspesno dodat!");
        model.addObject("fitnesCentar", fc);
        return model;
    }
    
    @RequestMapping(value = "/viewFitnesCentri", method = RequestMethod.GET)
    public ModelAndView getFitnesCentri(ModelAndView model) {
        model.addObject("fitnesCentri", metLifeService.getFitnesCentri());
        model.addObject("fitnesCentar", new FitnesCentar());
        return model;
    }
    
    @RequestMapping(value = "/editFitnesCentar/{idFitnesCentar}", method = RequestMethod.GET)
    public String editFitnesCentar(@PathVariable("idFitnesCentar") int id, Model model) {
        FitnesCentar fitnesCentar = metLifeService.getFitnesCentarById(id);
        model.addAttribute("kategorijeFitnesCentara", metLifeService.getKategorijeFitnesCentara());
        model.addAttribute("fitnesCentar", fitnesCentar);
        return "addFitnesCentar";
    }
    
    @RequestMapping(value = "/editFitnesCentar", method = RequestMethod.POST)
    public ModelAndView editFitnes(@ModelAttribute("idFitnesCentar") FitnesCentar fitnesCentar, ModelAndView model) {
        metLifeService.editFitnesCentar(fitnesCentar);
        model.addObject("successMsg", "Fitnes centar je uspesno izmenjen.");
        return model;
    }
    
    @RequestMapping(value = "/deleteFitnesCentar/{idFitnesCentar}", method = RequestMethod.GET)
    public String deleteFitnesCentar(@PathVariable("idFitnesCentar") int id, HttpServletRequest request) {
        System.out.println("Fetching & Deleting fitnes centar with id " + id);
 
        FitnesCentar fc = metLifeService.getFitnesCentarById(id);
        if (fc == null) {
            System.out.println("Nije moguce izvrsiti brisanje. Fitnes centar sa id " + id + " nije pronadjen.");
            String referer = request.getHeader("Referer");
            return "redirect:" + referer;
        }

       
        metLifeService.deleteFitnesCentar(fc);
        String referer = request.getHeader("Referer");
        return "redirect:" + referer;
    }
    
    @RequestMapping(value = "/zakazivanjeTermina", method = RequestMethod.GET)
    public String zakazivanjeTermina(Model model) {
        model.addAttribute("zakazivanjeTermina", new ZakazivanjeTermina());
        return "zakazivanjeTermina";
    }
   
    
    @RequestMapping(value = "/zakazivanjeTermina", method = RequestMethod.POST)
    public ModelAndView zakazivanjeTermina(@ModelAttribute("zakazivanjeTermina") ZakazivanjeTermina zt, ModelAndView model, Principal principal) {
        String name = principal.getName();
        Korisnik k = metLifeService.findUserByEmail(name);
        zt.setKorisnik(k);
        metLifeService.addZakazivanjeTermina(zt);
        model.addObject("successMsg", "Zahtev za rezervaciju termina je uspesno poslat!");
        return model;
    }
    
    @RequestMapping(value = "/addTermin", method = RequestMethod.GET)
    public String addTermin(Model model) {
        model.addAttribute("termin", new Termin());
        model.addAttribute("fitnesCentri", metLifeService.getFitnesCentri());
        model.addAttribute("zakazaniTermini",  metLifeService.getZakazaniTermini());
        model.addAttribute("zakazaniTermin", new ZakazivanjeTermina());
        return "addTermin";
    }

    @RequestMapping(value = "/addTermin", method = RequestMethod.POST)
    public ModelAndView addTermin(@ModelAttribute("termin") Termin t, ModelAndView model) {
        t = metLifeService.addTermin(t);
        model.addObject("fitnesCentri", metLifeService.getFitnesCentri());
        model.addObject("successMsg", "Termin je uspesno rezervisan!");
        model.addObject("termin", t);
        return model;
    }
    
    @RequestMapping(value = "/viewTermini", method = RequestMethod.GET)
    public ModelAndView getTermini(ModelAndView model) {
        model.addObject("termini", metLifeService.getTermini());
        model.addObject("termin", new Termin());
        return model;
    }
    
        @RequestMapping(value = "/editTermin/{idTermin}", method = RequestMethod.GET)
    public String editTermin(@PathVariable("idTermin") int id, Model model) {
        Termin termin = metLifeService.getTerminById(id);
        model.addAttribute("fitnesCentri", metLifeService.getFitnesCentri());
        model.addAttribute("termin", termin);
        return "addTermin";
    }
    
    @RequestMapping(value = "/editTermin", method = RequestMethod.POST)
    public ModelAndView editTermin(@ModelAttribute("idTermin") Termin termin, ModelAndView model) {
        metLifeService.editTermin(termin);
        model.addObject("successMsg", "Termin je uspesno izmenjen.");
        return model;
    }
    
    
    @RequestMapping(value = "/deleteTermin/{idTermin}", method = RequestMethod.GET)
    public String deleteTermin(@PathVariable("idTermin") int id, HttpServletRequest request) {
        System.out.println("Fetching & Deleting termin with id " + id);
        Termin t = metLifeService.getTerminById(id);
        if (t == null) {
            System.out.println("Nije moguce izvrsiti brisanje. Termin sa id " + id + " nije pronadjen.");
            String referer = request.getHeader("Referer");
            return "redirect:" + referer;
        }

       
        metLifeService.deleteTermin(t);
        String referer = request.getHeader("Referer");
        return "redirect:" + referer;
    }
    
    @RequestMapping(value = "/kontakt", method = RequestMethod.GET)
    public String kontakt(Model model) {
        model.addAttribute("kontakt", new Kontakt());
        return "kontakt";
    }
   
    
    @RequestMapping(value = "/kontakt", method = RequestMethod.POST)
    public ModelAndView kontakt(@ModelAttribute("kontakt") Kontakt k, ModelAndView model) {
        metLifeService.sendKontakt(k);
        model.addObject("successMsg", "Kontakt poruka je uspesno poslata!");
        return model;
    }
    
    @RequestMapping(value = "/viewKontaktPoruke", method = RequestMethod.GET)
    public ModelAndView getKontaktPoruke(ModelAndView model) {
        model.addObject("poruke", metLifeService.getKontaktPoruke());
        model.addObject("poruka", new Kontakt());
        return model;
    }
    
        @RequestMapping(value = "/deleteKontaktPoruka/{idKontakt}", method = RequestMethod.GET)
    public String deleteKontaktPoruka(@PathVariable("idKontakt") int id, HttpServletRequest request) {
        System.out.println("Fetching & Deleting kontakt poruka with id " + id);
 
        Kontakt k = metLifeService.getKontaktPorukaById(id);
        if (k == null) {
            System.out.println("Nije moguce izvrsiti brisanje. Kontakt poruka sa id " + id + " nije pronadjena.");
            String referer = request.getHeader("Referer");
            return "redirect:" + referer;
        }

       
        metLifeService.deleteKontaktPoruka(k);
        String referer = request.getHeader("Referer");
        return "redirect:" + referer;
    }
}
