package org.example.conf;

import org.example.entities.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class HibernateConf<G> {
    private static SessionFactory factory;

    public static SessionFactory connect(){
        factory = new Configuration()
                .configure("config.xml")
                .addAnnotatedClass(Position.class)
                .addAnnotatedClass(TourType.class)
                .addAnnotatedClass(Program.class)
                .addAnnotatedClass(Tourist.class)
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(AviaClass.class)
                .addAnnotatedClass(Client.class)
                .addAnnotatedClass(Country.class)
                .addAnnotatedClass(HotelClass.class)
                .addAnnotatedClass(HotelNumberCategory.class)
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Tour.class)
                .addAnnotatedClass(Order.class)
                .addAnnotatedClass(Hotel.class)
                .addAnnotatedClass(Agreement.class)
                .addAnnotatedClass(Event.class)
                .addAnnotatedClass(Permit.class)
                .addAnnotatedClass(TourFlight.class)
                .addAnnotatedClass(AviaTicket.class)
                .addAnnotatedClass(AviaTicketPermit.class)
                .addAnnotatedClass(TicketForEvent.class)
                .addAnnotatedClass(HotelNumber.class)
                .addAnnotatedClass(PermitTicket.class)
                .addAnnotatedClass(HotelNumberPermit.class)
                .buildSessionFactory();

        return factory;
    }

    public static <G> void save(G genericObject){
        connect();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            session.save(genericObject);

            session.getTransaction().commit();
        }
        finally {
            close();
        }

    }

    public static <G> void saveAll(G ... genericObjects){
        for (G genericObject : genericObjects){
            connect();

            try {
                Session session = factory.getCurrentSession();
                session.beginTransaction();

                session.save(genericObject);
                session.getTransaction().commit();
            }
            finally {
                close();
            }

        }

    }

    public static <G> void update(G genericObject){
        connect();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            session.update(genericObject);
            session.getTransaction().commit();
        }
        finally {
            close();
        }
    }

    public static <G> void updateByQuery(String updateQuery){
        connect();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            session.createQuery(updateQuery).executeUpdate();

            session.getTransaction().commit();
        }
        finally {
            close();
        }
    }

    public static <G> void delete(G genericObject){
        connect();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            session.delete(genericObject);

            session.getTransaction().commit();
        }
        finally {
            close();
        }
    }

    public static <G> void deleteByQuery(String deleteQuery){
        connect();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            session.createQuery(deleteQuery).executeUpdate();

            session.getTransaction().commit();
        }
        finally {
            close();
        }
    }

    public static <G> G getById(Class c, Integer identificator){
        connect();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            G genericObject = (G) session.get(c, identificator);

            session.getTransaction().commit();
            return genericObject;
        }
        finally {
            close();
        }

    }

    public static <G> List<G> getByQuery(String selectQuery){
        connect();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            List<G> genericObjects = session.createQuery(selectQuery).getResultList();
            session.getTransaction().commit();

            return genericObjects;
        }
        finally {
            close();
        }

    }

    public static void close(){
        factory.close();
    }
}
