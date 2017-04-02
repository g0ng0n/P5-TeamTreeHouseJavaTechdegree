package com.g0ng0n.countries.data;

import com.g0ng0n.countries.model.Country;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by g0ng0n.
 */
@Component
public class CountryRepository {

    private static final List<Country> ALL_COUNTRIES = Arrays.asList(
            new Country(1, "Ecuador","15.74 million", "Quito", Arrays.asList("Spanish","Kichwa","Shuar"),"/resources/flags/ecuador.png"),
            new Country(2,"France","66.03 million","Paris",Arrays.asList("French"),"/resources/flags/paris.png"),
            new Country(3,"India","1.252 billion","New Delhi",Arrays.asList("Hindi","English"),"/resources/flags/india.png"),
            new Country(4,"Italy","59.83 million","Rome",Arrays.asList("Italian"),"/resources/flags/italy.png"),
            new Country(5,"Kenya","44.35 million","Nairobi",Arrays.asList("English","Kiswahili"),"/resources/flags/kenya.png")

    );

    public List<Country> getAllCountries(){
        return ALL_COUNTRIES;
    }

}
