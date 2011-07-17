package server.lobbyActions;

import lobby.actions.LobbyAction;

public interface ServerLobbyActionFactory
{
    public ServerLobbyAction createJoinedAction(LobbyAction lobbyAction);

    public ServerLobbyAction createGameRemovedAction(LobbyAction lobbyAction);

    public ServerLobbyAction createLobbyChatAction(LobbyAction lobbyAction);

    public ServerLobbyAction createGameStatusChangedAction(
                    LobbyAction lobbyAction);

    public ServerLobbyAction createNewGameAction(LobbyAction lobbyAction);

    public ServerLobbyAction createDefaultAction(LobbyAction lobbyAction);
}
