package pl.coderslab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.domain.entities.Country;
import pl.coderslab.repositories.CountryRepository;

@Service
public class CountryCreator {

    @Autowired
    private CountryRepository countryRepository;

    String countries = "Australia,Austria,Azerbaijan,Belarus,Belgium,Bermuda,Bulgaria,Canada,China,Czech Republic,Denmark," +
            "Ecuador,Estonia,Faroe Islands,Finland,France,French Guiana,Georgia,Germany,Gibraltar,Greece,Greenland,Hong Kong," +
            "Hungary,Iceland,India,Ireland,Israel,Italy,Japan,Kosovo,Kyrgyzstan,Latvia,Lithuania,Malaysia,Mexico,Monaco,Netherlands," +
            "New Zealand,Niue,Norway,Poland,Portugal,Puerto Rico,Romania,Singapore,Slovakia,Slovenia,South Africa,South Korea,Spain," +
            "Sweden,Switzerland,Taiwan,Tajikistan,Thailand,Turkmenistan,United Kingdom,United States,Uzbekistan,";

    public void createCountryArray() {
        String[] array = countries.split(",");
        for (String st : array
                ) {
            Country country = new Country();
            country.setCountry_name(st);
            countryRepository.save(country);
            System.out.println(st);
        }
    }
}
