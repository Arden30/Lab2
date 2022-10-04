package pockemons;

import moves.physical.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Swinub extends Pokemon {
    public Swinub(String name, int level)  {
        super(name, level);
        setType(Type.ICE, Type.GROUND);
        setStats(50, 50, 40, 30, 30, 50);
    }
}