package server.lobbyActions;

import lobby.Lobby;
import lobby.actions.LobbyAction;
import server.LobbyServer;

/*
 * Default implementation for a ServerLobbyAction
 */
public class DefaultServerLobbyAction implements ServerLobbyAction
{
    private LobbyAction lobbyAction;
    private LobbyServer lobbyServer;

    public DefaultServerLobbyAction(LobbyAction lobbyAction,
                    LobbyServer lobbyServer)
    {
        super();
        this.lobbyAction = lobbyAction;
        this.lobbyServer = lobbyServer;
    }

    @Override
    public LobbyAction getLobbyAction()
    {
        return lobbyAction;
    }

    /*
     * by default, it sends encapsulated LobbyAction to each user on the server
     * 
     * @see soc.common.server.lobbyActions.ServerLobbyAction#sendToClients()
     */
    @Override
    public void sendToClients()
    {
        lobbyServer.sendToAll(lobbyAction);
    }

    /*
     * Calls perform on the encapsualted LobbyAction
     * 
     * @see soc.common.server.lobbyActions.ServerLobbyAction#perform(soc.common.lobby.Lobby)
     */
    @Override
    public void perform(Lobby lobby)
    {
        lobbyAction.perform(lobby);
    }
}