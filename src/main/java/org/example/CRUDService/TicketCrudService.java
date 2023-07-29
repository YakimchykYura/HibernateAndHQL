package org.example.CRUDService;

import org.example.Entity.Planet;
import org.example.Entity.Ticket;
import org.example.Hibernate.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class TicketCrudService {
    private static Session SESSION = HibernateUtils.getInstance().getSessionFactory().openSession();
    public void addPTicket(Ticket ticket) {
        Transaction transaction = SESSION.beginTransaction();
        SESSION.persist(ticket);
        transaction.commit();;
    }

    public Ticket getTicket(long id) {
        Ticket getTicket = SESSION.get(Ticket.class, id);
        return getTicket;
    }
    public void getAllTicket() {
        List<Ticket> ticket = SESSION.createQuery("from Ticket", Ticket.class).list();
    }
    public void updateTicket(Ticket ticket, Long id) {
        Transaction transaction = SESSION.beginTransaction();
        ticket.setId(id);
        SESSION.merge(ticket);
        transaction.commit();
    }
    public void deleteTicket(Long id){
        Transaction transaction = SESSION.beginTransaction();
        Ticket existing = SESSION.get(Ticket.class, id);
        SESSION.remove(existing);
        transaction.commit();
    }
}
