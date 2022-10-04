package pockemons;

import moves.physical.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public class Pheromosa extends Pokemon {
    public Pheromosa(String name, int level)  {
        super(name, level);
        setType(Type.BUG, Type.FIGHTING);
        setStats(71, 137, 37, 137, 37, 151);
        setMove(new DynamicPunch());
    }
}
