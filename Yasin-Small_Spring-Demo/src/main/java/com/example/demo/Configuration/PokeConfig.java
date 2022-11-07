package com.example.demo.Configuration;

import com.example.demo.Repository.PokeRepository;
import com.example.demo.pokemon.Pokemon;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PokeConfig {

    @Bean
    CommandLineRunner commandLineRunner(PokeRepository pr){
        return args -> {
            Pokemon Charizard = new Pokemon(3, "Charizard", "https://archives.bulbagarden.net/media/upload/thumb/7/7e/006Charizard.png/375px-006Charizard.png");
            pr.save(Charizard);
        };

    }
}
