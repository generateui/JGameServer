package game;

import game.phase.GamePhase;

import java.io.Serializable;

public interface Game extends Serializable
{
    public ValidateResult isValid(GameAction action);

    public ValidateResult isAllowed(GameAction action);

    public ValidateResult perform(GameAction action);

    public GamePhase getCurrentPhase();
}
