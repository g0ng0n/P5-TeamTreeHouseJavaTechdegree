package com.g0ng0n.countries.model;

import java.util.List;

/**
 * Created by g0ng0n.
 */
public class Country {

    private int id;
    private String name;
    private String population;
    private String capitalCity;
    private List<String> languages;
    private String flagImage;


    public Country(int id, String name, String population, String capitalCity, List<String> languages, String flagImage) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.capitalCity = capitalCity;
        this.languages = languages;
        this.flagImage = flagImage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public String getFlagImage() {
        return flagImage;
    }

    public void setFlagImage(String flagImage) {
        this.flagImage = flagImage;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", population='" + population + '\'' +
                ", capitalCity='" + capitalCity + '\'' +
                ", languages=" + languages +
                ", flagImage='" + flagImage + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (id != country.id) return false;
        if (name != null ? !name.equals(country.name) : country.name != null) return false;
        if (population != null ? !population.equals(country.population) : country.population != null) return false;
        if (capitalCity != null ? !capitalCity.equals(country.capitalCity) : country.capitalCity != null) return false;
        if (languages != null ? !languages.equals(country.languages) : country.languages != null) return false;
        return flagImage != null ? flagImage.equals(country.flagImage) : country.flagImage == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (population != null ? population.hashCode() : 0);
        result = 31 * result + (capitalCity != null ? capitalCity.hashCode() : 0);
        result = 31 * result + (languages != null ? languages.hashCode() : 0);
        result = 31 * result + (flagImage != null ? flagImage.hashCode() : 0);
        return result;
    }
}
