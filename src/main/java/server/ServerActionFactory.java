package server;

import game.GameAction;

public class ServerActionFactory implements GameServerActionFactory
{
    private GameServer gameServer;

    public ServerActionFactory(GameServer gameServer)
    {
        super();
        this.gameServer = gameServer;
    }

    @Override
    public ServerAction createDefaultServerAction(GameAction action)
    {
        return new DefaultAction(gameServer, action);
    }
}