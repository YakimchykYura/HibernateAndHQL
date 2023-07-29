package org.example.CRUDService;

import org.example.Entity.Planet;
import org.example.Hibernate.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class PlanetCrudService {
    private static Session SESSION = HibernateUtils.getInstance().getSessionFactory().openSession();

    public void addPlanet(String id, String name) {
        Transaction transaction = SESSION.beginTransaction();
        Planet planet = new Planet();
        planet.setId(id);
        planet.setName(name);
        SESSION.persist(planet);
        transaction.commit();
    }
    public Planet getPlanet(String id) {
        Planet getPlanet = SESSION.get(Planet.class, id);
        return getPlanet;
    }
    public void getAllPlanet() {
        List<Planet> planets = SESSION.createQuery("from Planet", Planet.class).list();
    }
    public void updatePlanet(String id, String name) {
        Transaction transaction = SESSION.beginTransaction();
        Planet existing = SESSION.get(Planet.class, id);
        existing.setName(name);
        SESSION.persist(existing);
        transaction.commit();
    }
    public void deletePlanet(String id){
        Transaction transaction = SESSION.beginTransaction();
        Planet existing = SESSION.get(Planet.class, id);
        SESSION.remove(existing);
        transaction.commit();
    }
}
