package game.actions;

import game.Game;
import game.phase.GamePhase;
import game.turn.TurnPhase;
import meta.Meta;

public class ChangeSettings extends AbstractGameAction
{
    private static final long serialVersionUID = -3965573991881671035L;

    @Override
    public boolean isAllowed(TurnPhase turnPhase)
    {
        return false;
    }

    @Override
    public boolean isAllowed(GamePhase gamePhase)
    {
        return gamePhase.isLobby();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * soc.common.actions.gameAction.AbstractGameAction#perform(soc.common.game
     * .Game)
     */
    @Override
    public void perform(Game game)
    {
        // // Invalidate all other players
        // LobbyGamePhase lobbyPhase = (LobbyGamePhase) game.getCurrentPhase();
        // lobbyPhase.resetPlayersWhoAcceptedSettings(getPlayer());

        super.perform(game);
    }

    @Override
    public String getToDoMessage()
    {
        return "";
    }

    @Override
    public Meta getMeta()
    {
        // TODO Auto-generated method stub
        return null;
    }

}
