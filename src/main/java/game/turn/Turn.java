package game.turn;

import game.player.GamePlayer;

import java.io.Serializable;

public interface Turn extends Serializable
{
    public GamePlayer getPlayer();

    public int getID();

    public Turn setID(int id);

    public TurnPhase getTurnPhase();

    public void setTurnPhase(TurnPhase phase);

    /** @param player
     *            the player to set */
    public Turn setPlayer(GamePlayer player);
}