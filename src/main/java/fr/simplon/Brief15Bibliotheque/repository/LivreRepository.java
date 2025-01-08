package fr.simplon.Brief15Bibliotheque.repository;

import fr.simplon.Brief15Bibliotheque.entity.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivreRepository extends JpaRepository <Livre, Long> {
}
