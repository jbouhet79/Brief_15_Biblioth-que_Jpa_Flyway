package fr.simplon.Brief15Bibliotheque.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String genre;

    @ManyToMany(mappedBy = "genres")
    private List<Livre> livres;

    public Genre() {};
    public String getGenre() { return genre; }
}
