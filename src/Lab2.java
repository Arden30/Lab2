import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import pokemons.*;

public class Lab2 {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon pheromosa = new Pheromosa("Pher", 55);
        Pokemon eevee = new Eevee("Eev", 45);
        Pokemon jolteon = new Jolteon("Jolt", 50);
        Pokemon swinub = new Swinub("Swin", 30);
        Pokemon piloswine = new Piloswine("Pilos", 35);
        Pokemon mamoswine = new Mamoswine("Mamos", 37);
        b.addAlly(pheromosa);
        b.addAlly(eevee);
        b.addAlly(jolteon);
        b.addFoe(swinub);
        b.addFoe(piloswine);
        b.addFoe(mamoswine);
        b.go();
    }
}