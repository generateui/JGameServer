package game.phase;

import game.Game;
import game.GameAction;
import game.turn.Turn;

import java.io.Serializable;

import meta.HasMeta;

public interface GamePhase extends Serializable, HasMeta
{
    public void performAction(GameAction action, Game game);

    public void start(Game game);

    public GamePhase next(Game game);

    public Turn nextTurn(Game game);

    public boolean isAllowed(GameAction action);

    public String getName();

    public String getMessage();

    public boolean isLobby();

    // public boolean isInitialPlacement();

    public boolean isPlayTurns();

    public boolean isEnded();

    // public boolean isDetermineFirstPlayer();
}