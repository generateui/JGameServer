package lobby.actions;

import game.ValidateResult;
import game.player.User;

import java.io.Serializable;

import lobby.Lobby;
import server.lobbyActions.ServerLobbyAction;
import server.lobbyActions.ServerLobbyActionFactory;

public interface LobbyAction extends Serializable
{
    public void perform(Lobby lobby);

    public User getUser();

    public String getMessage();

    public LobbyAction setUser(User user);

    public ServerLobbyAction createServerLobbyAction(
                    ServerLobbyActionFactory factory);

    public ValidateResult isValid(Lobby lobby, ValidateResult result);

    public int getUserId();

    public LobbyAction setUserId(int id);
}
