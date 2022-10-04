package pokemons;

import moves.special.Thunderbolt;
import moves.status.BabyDollEyes;
import moves.status.DoubleTeam;
import moves.status.Swagger;
import ru.ifmo.se.pokemon.Type;

public class Jolteon extends Eevee {
    public Jolteon(String name, int level)  {
        super(name, level);
        super.setType(Type.ELECTRIC);
        super.setStats(65, 65, 60, 110, 95, 130);
        super.setMove(new Swagger(), new BabyDollEyes(), new DoubleTeam(), new Thunderbolt());
    }
}