package com.g0ng0n.countries.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by g0ng0n.
 */
@Controller
public class CountryController {

    @Autowired
    private CountryRepository countryRepository;

    @RequestMapping(value = "/countries")
    public String listCategories(ModelMap modelMap){
        List<Country> list = countryRepository.getAllCountries();
        modelMap.put("categories", list);
        return "categories";
    }
}
