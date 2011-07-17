package server;

import game.Game;
import game.GameAction;
import random.Random;

public interface GameServer extends Server
{
    // public JoinResult join(UserCredentials credentials);

    public void sendAction(GameAction action);

    public void leave();

    public Random getRandom();

    public Game getGame();

    public ServerActionFactory createActionFactory();

    public void startGame(Game game);

    public void setBotTurnHandled(boolean handled);

    public boolean hasQueuedBotActions();

    public void performAction(GameAction serverAction);
}
