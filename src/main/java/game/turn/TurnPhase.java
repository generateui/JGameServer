package game.turn;

import game.Game;
import game.GameAction;

import java.io.Serializable;

import meta.HasMeta;

public interface TurnPhase extends Serializable, HasMeta
{
    public TurnPhase next();

    public TurnPhase processAction(GameAction action, Game game);

    public boolean isAllowed(GameAction action);

    public String getName();

    public String getMessage();
}