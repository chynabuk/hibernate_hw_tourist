package org.example.crud_operations.impl;

import org.example.conf.HibernateConf;
import org.example.crud_operations.InsertionsToDB;
import org.example.entities.TourType;
import org.example.enums.TourTypeEnum;

public class TourTypeCRUD implements InsertionsToDB {
    @Override
    public void insert() {
        TourType sport = new TourType();
        sport.setTourTypeEnum(TourTypeEnum.SPORT);

        TourType shop = new TourType();
        shop.setTourTypeEnum(TourTypeEnum.SHOP);

        TourType sightseeing = new TourType();
        sightseeing.setTourTypeEnum(TourTypeEnum.SIGHTSEEING);

        HibernateConf.saveAll(sport, shop, sightseeing);
    }
}
