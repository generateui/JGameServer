package game.player;

import java.io.Serializable;

/*
 * Represents a player playing a game
 */
public interface GamePlayer extends Serializable
{
    public User getUser();

    public GamePlayer setColor(String color);

    public String getColor();

    public boolean isOnTurn();

    public GamePlayer setOnTurn(boolean isOnTurn);
}