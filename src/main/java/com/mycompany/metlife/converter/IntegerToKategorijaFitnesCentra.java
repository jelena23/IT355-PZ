/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.metlife.converter;

import com.mycompany.metlife.dao.MetLifeDao;
import com.mycompany.metlife.entity.KategorijaFitnesCentra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jelena
 */
@Component
public class IntegerToKategorijaFitnesCentra implements Converter<String, KategorijaFitnesCentra> {
     @Autowired
    MetLifeDao metLifeDao;
    
    
    @Override
    public KategorijaFitnesCentra convert(String s) {
        if (s.isEmpty()) {
            return null;
        }
        Integer value = Integer.valueOf(s);
        System.out.println("Konvertujem u kategoriju fitnes centra");
        KategorijaFitnesCentra kfc = metLifeDao.getKategorijaFitnesCentraById(value);
        return kfc;
    }
    
}
