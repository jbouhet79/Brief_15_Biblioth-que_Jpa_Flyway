package fr.simplon.Brief15Bibliotheque.repository;

import fr.simplon.Brief15Bibliotheque.entity.Emprunteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmprunteurRepository extends JpaRepository <Emprunteur, Long> {
}
