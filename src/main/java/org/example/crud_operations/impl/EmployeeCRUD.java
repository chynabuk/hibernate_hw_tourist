package org.example.crud_operations.impl;

import org.example.conf.HibernateConf;
import org.example.crud_operations.DeleteFromDB;
import org.example.crud_operations.InsertionsToDB;
import org.example.crud_operations.SelectFromDB;
import org.example.crud_operations.UpdateDB;
import org.example.entities.Employee;
import org.example.entities.Position;

import java.util.List;
import java.util.Scanner;

public class EmployeeCRUD implements InsertionsToDB, DeleteFromDB, UpdateDB, SelectFromDB {
    private Scanner in;

    public EmployeeCRUD(Scanner in) {
        this.in = in;
    }

    @Override
    public void insert(){
        Employee employee = new Employee();

        employee.setPassportNumber(initAndGetPassportNumber());

        setValuesForEmployee(employee);

        HibernateConf.save(employee);

    }

    @Override
    public void update(){
        Employee employee = HibernateConf.getById(Employee.class, initAndGetPassportNumber());

        setValuesForEmployee(employee);

        HibernateConf.update(employee);
    }

    @Override
    public void delete(){
        Employee employee = HibernateConf.getById(Employee.class, initAndGetPassportNumber());

        HibernateConf.delete(employee);
    }

    @Override
    public void getAll(){
        List<Employee> employees = HibernateConf.getByQuery("from Employee");

        String format = "%20s | %20s | %20s | %20s";
        System.out.println(String.format(format, "Passport Number", "Full name", "address", "position"));
        System.out.println("-----------------------------------------------------------------------------------------");

        for (Employee employee : employees){
            System.out.println(String.format(format,
                    employee.getPassportNumber().toString(),
                    employee.getFullName(),
                    employee.getAddress(),
                    employee.getPosition().getPositionType().toString()));
        }

    }

    private Integer initAndGetPassportNumber(){
        System.out.print("Введите номер паспорта сотрудника: ");
        Integer passportNumber = in.nextInt();
        in.nextLine();

        return passportNumber;
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
