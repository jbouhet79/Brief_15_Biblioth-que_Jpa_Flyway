package fr.simplon.Brief15Bibliotheque.controller;

import fr.simplon.Brief15Bibliotheque.entity.Emprunteur;
import fr.simplon.Brief15Bibliotheque.repository.EmprunteurRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/emprunteur")
public class EmprunteurController {

    private EmprunteurRepository emprunteurRepository1;

    private EmprunteurController (EmprunteurRepository emprunteurRepository2) {
        this.emprunteurRepository1 = emprunteurRepository2;
    }

    @GetMapping(value = "/{id}")
    public Optional<Emprunteur> getEmprunteurById (@PathVariable Long id) {
        return emprunteurRepository1.findById(id);
    }

    @GetMapping(value = "/listEmprunteurs")
    public List<Emprunteur> getListEmprunteurs () {
        return emprunteurRepository1.findAll();
    }

    @PostMapping(value = "/ajouterEmprunteur")
    public Emprunteur ajouterEmprunteur (@RequestBody Emprunteur emprunteurASauvegarder) {
        return emprunteurRepository1.save(emprunteurASauvegarder);
    }


}
