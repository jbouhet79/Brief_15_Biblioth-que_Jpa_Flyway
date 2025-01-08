package fr.simplon.Brief15Bibliotheque.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Emprunteur {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nom;
    private String prenom;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Emprunt> emprunts;

    public Emprunteur () {};

    public Emprunteur (String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {return nom; }
    public String getPrenom() {return prenom; }




}
