package game;

import game.player.User;

import java.util.List;

public interface GameInfo
{
    public int getID();

    public String getName();

    public User getHost();

    public List<User> getPlayers();

    public String getBoardId();

    // public GameSettings getSettings();
}
