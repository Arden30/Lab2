package pockemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Piloswine extends Pokemon {
    public Piloswine(String name, int level)  {
        super(name, level);
        setType(Type.ICE, Type.GROUND);
        setStats(100, 100, 80, 60, 60, 50);
    }
}

