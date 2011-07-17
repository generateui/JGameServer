package server.lobbyActions;

import lobby.Lobby;
import lobby.actions.LobbyAction;

public interface ServerLobbyAction
{
    public LobbyAction getLobbyAction();

    public void sendToClients();

    public void perform(Lobby lobby);
}
