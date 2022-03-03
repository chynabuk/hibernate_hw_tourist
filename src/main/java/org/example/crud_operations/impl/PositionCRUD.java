package org.example.crud_operations.impl;

import org.example.conf.HibernateConf;
import org.example.crud_operations.InsertionsToDB;
import org.example.entities.Position;
import org.example.enums.PositionTypeEnum;

public class PositionCRUD implements InsertionsToDB {
    @Override
    public void insert(){
        Position deputyDirector = new Position();
        deputyDirector.setPositionType(PositionTypeEnum.DEPUTY_DIRECTOR);

        Position tourManager = new Position();
        tourManager.setPositionType(PositionTypeEnum.TOUR_MANAGER);

        Position tourPlanner = new Position();
        tourPlanner.setPositionType(PositionTypeEnum.TOUR_PLANNER);

        Position deputyManager = new Position();
        deputyManager.setPositionType(PositionTypeEnum.DEPUTY_MANAGER);

        HibernateConf.saveAll(deputyDirector, tourManager, tourPlanner, deputyManager);
    }
}
