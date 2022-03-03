package org.example.crud_operations.impl;

import org.example.conf.HibernateConf;
import org.example.crud_operations.InsertionsToDB;
import org.example.entities.Program;

public class ProgramCRUD implements InsertionsToDB {
    @Override
    public void insert() {
        Program ala_archa = new Program();
        ala_archa.setProgramNumber(111);
        ala_archa.setDescription("Однодневный тур в природный парк Ала-Арча");

        Program bazars = new Program();
        bazars.setProgramNumber(123);
        bazars.setDescription("Тур по базарам в Бишкеке");

        Program budget = new Program();
        budget.setProgramNumber(222);
        budget.setDescription("Бюджетный тур по Кыргызстану");

        HibernateConf.saveAll(ala_archa, bazars, budget);
    }
}
