package org.example.crud_operations.impl;

import org.example.conf.HibernateConf;
import org.example.crud_operations.DeleteFromDB;
import org.example.crud_operations.InsertionsToDB;
import org.example.crud_operations.SelectFromDB;
import org.example.crud_operations.UpdateDB;
import org.example.entities.Client;
import org.example.entities.Employee;
import org.example.entities.Position;

import java.util.Scanner;

public class ClientCRUD implements InsertionsToDB, DeleteFromDB, UpdateDB, SelectFromDB {
    private Scanner in;

    public ClientCRUD(Scanner in) {
        this.in = in;
    }

    @Override
    public void insert() {
        Client client = new Client();
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void getAll() {

    }

    private Integer initAndGetClientNumber(){
        System.out.print("Введите номер клиента: ");
        Integer clientNumber = in.nextInt();
        in.nextLine();

        return clientNumber;
    }

    private void setValuesForEmployee(Employee employee){
        System.out.print("Введите полное имя сотрудника: ");
        String fullName = in.nextLine();
        employee.setFullName(fullName);

        System.out.print("Введите адрес сотрудника: ");
        String address = in.nextLine();
        employee.setAddress(address);

        System.out.println("Должности:\n" +
                "1. DEPUTY_DIRECTOR\n"+
                "2. TOUR_MANAGER\n"+
                "3. TOUR_PLANNER\n"+
                "4. DEPUTY_MANAGER\n"
        );

        System.out.print("Введите id должности: ");
        Integer positionId = in.nextInt();
        in.nextLine();

        Position position = HibernateConf.getById(Position.class, positionId);

        employee.setPosition(position);
    }
}
