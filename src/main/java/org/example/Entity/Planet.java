package org.example.Entity;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import javax.persistence.FetchType;
import javax.persistence.CascadeType;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "planet")

public class Planet {
    @Id
    private String id;
    @Column
    private String name;
    @OneToMany(mappedBy="fromPlanetId", fetch = FetchType.LAZY, cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Ticket> ticketsFromPlanet = new HashSet<>();
    @OneToMany(mappedBy="toPlanetId", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Ticket> ticketsToPlanet = new HashSet<>();

    public void setId(String id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }

}
