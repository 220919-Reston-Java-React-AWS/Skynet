package com.example.demo.service;

import com.example.demo.Repository.PokeRepository;
import com.example.demo.pokemon.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokeService {

    @Autowired
    private PokeRepository pr;
    public List<Pokemon> getPokemon() {
       return pr.findAll();
    }

    public void addNewPokemon(Pokemon poke) {
        System.out.println(poke);
    }
}
