package com.example.demo.controller;

import com.example.demo.pokemon.Pokemon;
import com.example.demo.service.PokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//you can choose path to use for endpoint with request mapping
@RequestMapping(path="pokemon")
public class PokemonController {

    @Autowired
    private PokeService ps;

    @GetMapping
    public List<Pokemon> getPokemon() {
        return ps.getPokemon();
    }

    @PostMapping
    public void newPokemon(@RequestBody Pokemon poke) {
        ps.addNewPokemon(poke);
    }
}
