package server;

import game.GameAction;

/*
 * Creates a server side action for given GameAction. Returning null is not allowed,
 * instead return a null object or a simple wrapper like DefaultAction
 */
public interface GameServerActionFactory
{
    /*
     * Returns associated server action for given GameAction.
     */
    public ServerAction createDefaultServerAction(GameAction action);
}