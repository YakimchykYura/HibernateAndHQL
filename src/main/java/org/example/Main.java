package org.example;


import org.example.CRUDService.ClientCrudService;
import org.example.CRUDService.PlanetCrudService;
import org.example.CRUDService.TicketCrudService;
import org.example.Entity.Ticket;
import org.example.Hibernate.HibernateUtils;

public class Main {
    public static void main(String[] args) {

        ClientCrudService client = new ClientCrudService();
        PlanetCrudService planet = new PlanetCrudService();
        TicketCrudService ticket = new TicketCrudService();
//        client.getAllClient();
//        client.addClient("John");
//        client.getAllClient();
//        client.getClient(5L);
//        client.updateClient(11L, "Marc");
//        client.deleteClient(11L);
//        client.getAllClient();
//
//
//        planet.getAllPlanet();
//        planet.addPlanet("URAN", "Uranus");
//        planet.getPlanet("URAN");
//        planet.updatePlanet("URAN", "URANUS");
//        planet.deletePlanet("URAN");
//        planet.getAllPlanet();
        Ticket ticket1 = new Ticket();

        ticket1.setCreated_at("2023-01-01 00:00:00");
        ticket1.setClient(client.getClient(3L));
        ticket1.setFromPlanetId(planet.getPlanet("MARS"));
        ticket1.setToPlanetId(planet.getPlanet("JUP"));
//       ticket.addPTicket(ticket1);
//        Ticket getTicket = ticket.getTicket(4L);
//        ticket.updateTicket(ticket1, 1L);
//        ticket.deleteTicket(6L);
        HibernateUtils.getInstance().closeSessionFactory();
    }
}