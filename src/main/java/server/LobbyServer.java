package server;

import game.player.User;
import lobby.Lobby;
import lobby.actions.LobbyAction;

public interface LobbyServer extends Server
{
    public void performLobbyAction(LobbyAction lobbyAction);

    public abstract void sendToAllExcept(User excludedUser, LobbyAction action);

    public abstract void sendToAll(LobbyAction action);

    public void sendToUser(User exclusiveUser, LobbyAction action);

    public void sayError(User user, String error);

    public Lobby getLobby();
}
