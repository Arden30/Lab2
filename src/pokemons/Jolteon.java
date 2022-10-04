package pockemons;

import moves.physical.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Jolteon extends Pokemon {
    public Jolteon(String name, int level)  {
        super(name, level);
        setType(Type.ELECTRIC);
        setStats(65, 65, 60, 110, 95, 130);
    }
}