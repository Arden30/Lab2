package pockemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Mamoswine extends Pokemon {
    public Mamoswine(String name, int level)  {
        super(name, level);
        setType(Type.ICE, Type.GROUND);
        setStats(110, 130, 80, 70, 60, 80);
    }
}
