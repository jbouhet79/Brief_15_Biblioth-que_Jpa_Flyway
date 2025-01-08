package fr.simplon.Brief15Bibliotheque.controller;

import fr.simplon.Brief15Bibliotheque.entity.Genre;
import fr.simplon.Brief15Bibliotheque.repository.GenreRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genre")
public class GenreController {
    private GenreRepository genreRepository1;

    private GenreController (GenreRepository genreRepository2) {
        this.genreRepository1 = genreRepository2;
    }

    @PostMapping(value = "/ajouterGenre")
    public Genre ajouterGenre (@RequestBody Genre genreAAjouter) {
        return genreRepository1.save(genreAAjouter);
    }

    @GetMapping(value = "/listGenres")
    public List<Genre> getListGenres () { return genreRepository1.findAll();}
}
