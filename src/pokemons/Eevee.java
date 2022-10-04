package pokemons;

import moves.status.BabyDollEyes;
import moves.status.DoubleTeam;
import moves.status.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Eevee extends Pokemon {
    public Eevee(String name, int level)  {
        super(name, level);
        super.setType(Type.NORMAL);
        super.setStats(55, 55, 50, 45, 65, 55);
        super.setMove(new Swagger(), new BabyDollEyes(), new DoubleTeam());
    }
}
