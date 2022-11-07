package com.example.demo.Repository;

import com.example.demo.pokemon.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokeRepository extends JpaRepository<Pokemon, Integer> {
}
