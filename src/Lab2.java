package lab2;

import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import Pockemons.*;

public class Lab2 {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Pokemon("×óæîé", 1);
        Pokemon pheromosa = new Pheromosa("pher", 1);
        b.addAlly(p1);
        b.addFoe(pheromosa);
        b.go();
    }
}
