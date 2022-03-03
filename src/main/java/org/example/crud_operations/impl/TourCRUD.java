package org.example.crud_operations.impl;

import org.example.conf.HibernateConf;
import org.example.crud_operations.DeleteFromDB;
import org.example.crud_operations.InsertionsToDB;
import org.example.crud_operations.SelectFromDB;
import org.example.crud_operations.UpdateDB;
import org.example.entities.*;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TourCRUD implements InsertionsToDB, DeleteFromDB, UpdateDB, SelectFromDB {
    private Scanner in;

    public TourCRUD(Scanner in) {
        this.in = in;
    }

    @Override
    public void insert(){
        Tour tour = new Tour();

        tour.setTourNumber(initAndGetTourNumber());

        setValuesForTour(tour);

        HibernateConf.save(tour);

    }

    @Override
    public void update(){
        Tour tour = HibernateConf.getById(Tour.class, initAndGetTourNumber());

        setValuesForTour(tour);

        HibernateConf.update(tour);
    }

    @Override
    public void delete(){
        Tour tour = HibernateConf.getById(Tour.class, initAndGetTourNumber());

        HibernateConf.delete(tour);
    }

    @Override
    public void getAll(){
        List<Tour> tours = HibernateConf.getByQuery("from Tour");

        String format = "%20s | %20s | %20s | %20s | %20s | %40s | %20s | %20s";
        System.out.println(String.format(format, "Номер тура", "Тип тура", "Страна", "Дата начала", "Дата завершения", "Программа", "Название тура", "Статус тура"));
        System.out.println("-------------------------------------------------------------------------------------------------------");

        for (Tour tour : tours){
            System.out.println(String.format(format,
                    tour.getTourNumber().toString(),
                    tour.getTourType().getTourTypeEnum().toString(),
                    tour.getCountry().getCountriesEnum().toString(),
                    tour.getStartDate().toString(),
                    tour.getEndDate().toString(),
                    tour.getProgram().getDescription(),
                    tour.getName(),
                    tour.getStatus()
                    ));
        }
    }

    private Integer initAndGetTourNumber(){
        System.out.print("Введите номер тура: ");
        Integer tourNumber = in.nextInt();
        in.nextLine();

        return tourNumber;
    }

    private void setValuesForTour(Tour tour){
        System.out.println("Типы тура:\n" +
                "1. SPORT\n"+
                "2. SHOP\n"+
                "3. SIGHTSEEING\n"
        );
        System.out.print("Введите id типа тура: ");
        Integer tourTypeId = in.nextInt();
        in.nextLine();
        TourType tourType = HibernateConf.getById(TourType.class, tourTypeId);
        tour.setTourType(tourType);



        System.out.println("Страны:\n" +
                "1. KYRGYZSTAN\n"+
                "2. GERMANY\n"+
                "3. USA\n"
        );
        System.out.print("Введите id страны: ");
        Integer coutryId = in.nextInt();
        in.nextLine();
        Country country = HibernateConf.getById(Country.class, coutryId);
        tour.setCountry(country);

        System.out.print("Введите дату начала(день-месяц-год:): ");
        String startDateString = in.nextLine();

        System.out.print("Введите дату завершения(день-месяц-год:): ");
        String endDateString = in.nextLine();

        String[] tempDate = null;
        String[] tempDate2 = null;

        if (startDateString.contains("-") && endDateString.contains("-")){
            tempDate = startDateString.split("-");
            tempDate2 = endDateString.split("-");
        }

        if (tempDate != null && tempDate2 != null){
            Integer year = Integer.parseInt(tempDate[2]);
            Integer month = Integer.parseInt(tempDate[1]);
            Integer day = Integer.getInteger(tempDate[0]);
            Date startDate = new Date();
            startDate.setYear(year);
            startDate.setMonth(month);
            startDate.setDate(day);

            Integer year2 = Integer.parseInt(tempDate2[2]);
            Integer month2 = Integer.parseInt(tempDate2[1]);
            Integer day2 = Integer.getInteger(tempDate2[0]);
            Date endDate = new Date();
            endDate.setYear(year2);
            endDate.setMonth(month2);
            endDate.setDate(day2);

            tour.setStartDate(startDate);
            tour.setEndDate(endDate);
        }


        System.out.println("Программы:\n" +
                "111. Однодневный тур в природный парк Ала-Арча\n"+
                "123. Тур по базарам в Бишкеке\n"+
                "222. Бюджетный тур по Кыргызстану\n"
        );
        System.out.print("Введите номер программы: ");
        Integer programNumber = in.nextInt();
        in.nextLine();
        Program program = HibernateConf.getById(Program.class, programNumber);
        tour.setProgram(program);

        System.out.print("Введите название тура: ");
        String name = in.nextLine();
        tour.setName(name);

        System.out.print("Введите статус тура: ");
        String status = in.nextLine();
        tour.setStatus(status);
    }

}
