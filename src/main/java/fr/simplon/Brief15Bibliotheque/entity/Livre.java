package fr.simplon.Brief15Bibliotheque.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String titre;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "livre_genre",
            joinColumns = @JoinColumn(name = "genre_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "livre_id", referencedColumnName = "id"))
    private List<Genre> genres = new ArrayList<>();

    @OneToOne(mappedBy = "livre")
    private Emprunt emprunt;

    public Livre () {};

    public Livre(String titre) {
        this.titre = titre;
    }

    public String getTitre() {return titre; }

}
