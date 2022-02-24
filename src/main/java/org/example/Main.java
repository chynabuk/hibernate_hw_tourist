package org.example;

import org.example.entities.Employee;
import org.example.entities.Position;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main( String[] args ) {

        SessionFactory factory = new Configuration()
                .configure("config.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Position.class)
                .buildSessionFactory();
    }
}
