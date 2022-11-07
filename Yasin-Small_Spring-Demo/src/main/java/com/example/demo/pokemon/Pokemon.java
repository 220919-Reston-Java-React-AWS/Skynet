package com.example.demo.pokemon;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
public class Pokemon {

    @Id
    @SequenceGenerator(
            name = "poke_sequence",
            sequenceName = "poke_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "poke_sequence"
    )
    private int id;
    private int nPokedex;
    private String name;
    private String image;

    public Pokemon() {
    }

    public Pokemon(int nPokedex, String name, String image) {
        this.nPokedex = nPokedex;
        this.name = name;
        this.image = image;
    }

    public int getnPokedex() {
        return nPokedex;
    }

    public void setnPokedex(int nPokedex) {
        this.nPokedex = nPokedex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return nPokedex == pokemon.nPokedex && name.equals(pokemon.name) && image.equals(pokemon.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nPokedex, name, image);
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nPokedex=" + nPokedex +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
