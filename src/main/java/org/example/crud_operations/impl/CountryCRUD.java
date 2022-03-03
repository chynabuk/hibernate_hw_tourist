package org.example.crud_operations.impl;

import org.example.conf.HibernateConf;
import org.example.crud_operations.InsertionsToDB;
import org.example.entities.Country;
import org.example.enums.CountriesEnum;

public class CountryCRUD implements InsertionsToDB {
    @Override
    public void insert(){
        Country kyrgyzstan = new Country();
        kyrgyzstan.setCountriesEnum(CountriesEnum.KYRGYZSTAN);

        Country germany = new Country();
        germany.setCountriesEnum(CountriesEnum.GERMANY);

        Country usa = new Country();
        usa.setCountriesEnum(CountriesEnum.USA);

        HibernateConf.saveAll(kyrgyzstan, germany, usa);
    }
}
