/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.metlife.converter;

import com.mycompany.metlife.dao.MetLifeDao;
import com.mycompany.metlife.entity.FitnesCentar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jelena
 */
@Component
public class IntegerToFitnesCentar implements Converter<String, FitnesCentar> {
     @Autowired
    MetLifeDao metLifeDao;
    
    
    @Override
    public FitnesCentar convert(String s) {
        if (s.isEmpty()) {
            return null;
        }
        Integer value = Integer.valueOf(s);
        System.out.println("Konvertujem u fitnes centar");
        FitnesCentar fitnesCentar = metLifeDao.getFitnesCentarById(value);
        return fitnesCentar;
    }
}
