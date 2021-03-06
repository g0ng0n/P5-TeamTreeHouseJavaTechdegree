package com.g0ng0n.countries.controller;

import com.g0ng0n.countries.data.CountryRepository;
import com.g0ng0n.countries.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by g0ng0n.
 */
@Controller
public class CountryController {

    @Autowired
    private CountryRepository countryRepository;

    @RequestMapping(value = "/")
    public String listCountries(ModelMap modelMap){
        List<Country> list = countryRepository.getAllCountries();
        modelMap.put("countries", list);
        return "index";
    }

    @RequestMapping(value = "/", params = "sort")
    public String listCountriesSorted(@RequestParam("sort") String sort, ModelMap modelMap){

        List<Country> list = null;

        if (sort.equals("name")){
            list = countryRepository.getAllCountriesSortedByName();
        }else if (sort.equals("population")){
            list = countryRepository.getAllCountriesSortedByPopulation();
        }else {
            return null;
        }
        modelMap.put("countries", list);
        return "index";
    }


    @RequestMapping("/countries/{name}")
    public String getCountryById(@PathVariable String name, ModelMap modelMap){

        Country country = countryRepository.findByName(name);
        modelMap.put("country", country);

        return "country";
    }


    public CountryRepository getCountryRepository() {
        return countryRepository;
    }

    public void setCountryRepository(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }


}
