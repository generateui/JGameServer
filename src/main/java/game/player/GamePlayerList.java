package game.player;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GamePlayerList implements Iterable<GamePlayer>, Serializable
{
    private static final long serialVersionUID = -2615032265282784616L;
    private List<GamePlayer> players = new ArrayList<GamePlayer>();

    @Override
    public Iterator<GamePlayer> iterator()
    {
        return players.iterator();
    }

    public GamePlayer get(int index)
    {
        return players.get(index);
    }

    public void add(GamePlayer player)
    {
        players.add(player);
    }

    public int size()
    {
        return players.size();
    }

    public int indexOf(GamePlayer player)
    {
        return players.indexOf(player);
    }

    /*
     * Reorders the players, by setting the given player on first position while
     * maintaining the order
     */
    public void setStartPlayer(GamePlayer starter)
    {
        int index = players.indexOf(starter);
        // Only reorder players when starter is not already at first place
        if (index != 0)
        {
            for (int i = 0; i < index; i++)
            {
                // Grab player at first position
                GamePlayer toMove = players.get(0);

                // remove it from the list
                players.remove(toMove);

                // add player back to the last position
                players.add(toMove);
            }

        }
    }

    public GamePlayerList getOpponents(GamePlayer ofPlayer)
    {
        GamePlayerList opponents = new GamePlayerList();

        for (GamePlayer opponent : players)
            if (!opponent.equals(ofPlayer))
                opponents.add(opponent);

        return opponents;
    }

    public boolean contains(GamePlayer player)
    {
        return players.contains(player);
    }
}
