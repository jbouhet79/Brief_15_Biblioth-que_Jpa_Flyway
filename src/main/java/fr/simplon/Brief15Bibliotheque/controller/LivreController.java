package fr.simplon.Brief15Bibliotheque.controller;

import fr.simplon.Brief15Bibliotheque.entity.Livre;
import fr.simplon.Brief15Bibliotheque.repository.LivreRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/livre")
public class LivreController {

    private LivreRepository livreRepository1;

    private LivreController (LivreRepository livreRepository2) {
        this.livreRepository1 = livreRepository2;
    }

    @GetMapping(value = "/{id}")
    public Optional<Livre> getLivreById (@PathVariable Long id) {
        return livreRepository1.findById(id);
    }

    @GetMapping(value = "/listLivres")
    public List<Livre> getListLivres () {
        return livreRepository1.findAll();
    }

    @PostMapping(value = "/ajouterLivre")
    public Livre ajouterLivre (@RequestBody Livre livreAEnregistrer) {
        return livreRepository1.save(livreAEnregistrer);
    }
}
