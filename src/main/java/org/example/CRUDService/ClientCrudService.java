package org.example.CRUDService;

import org.example.Hibernate.HibernateUtils;
import org.example.Entity.Client;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ClientCrudService {
    private static Session SESSION = HibernateUtils.getInstance().getSessionFactory().openSession();

    public void addClient(String name) {

        Transaction transaction = SESSION.beginTransaction();
        Client client = new Client();
        client.setName(name);
        SESSION.persist(client);
        transaction.commit();
    }
    public Client getClient(Long id) {
        Client getClient = SESSION.get(Client.class, id);
        return getClient;
    }
    public void getAllClient() {
        List<Client> workers = SESSION.createQuery("from Client", Client.class).list();
    }
    public void updateClient(Long id, String name) {
       Transaction transaction = SESSION.beginTransaction();
            Client existing = SESSION.get(Client.class, id);
            existing.setName(name);
        SESSION.persist(existing);
        transaction.commit();
    }
    public void deleteClient(Long id) {
        Transaction transaction = SESSION.beginTransaction();
        Client existing = SESSION.get(Client.class, id);
        SESSION.remove(existing);
        transaction.commit();
    }
}
