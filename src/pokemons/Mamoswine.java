package pokemons;

import moves.special.AncientPower;
import moves.special.MudBomb;
import moves.status.Amnesia;
import moves.status.ScaryFace;
import ru.ifmo.se.pokemon.Type;

public class Mamoswine extends Piloswine {
    public Mamoswine(String name, int level)  {
        super(name, level);
        super.setType(Type.ICE, Type.GROUND);
        super.setStats(110, 130, 80, 70, 60, 80);
        super.setMove(new AncientPower(), new MudBomb(), new Amnesia(), new ScaryFace());
    }
}
