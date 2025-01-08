package fr.simplon.Brief15Bibliotheque.repository;

import fr.simplon.Brief15Bibliotheque.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
