package fr.simplon.Brief15Bibliotheque.entity;

import jakarta.persistence.*;

@Entity
public class Emprunt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name="emprunteur_id")
    private Emprunteur emprunteur;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "livre_id", referencedColumnName = "id")
    private Livre livre;
 }
