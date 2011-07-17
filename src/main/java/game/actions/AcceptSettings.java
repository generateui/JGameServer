package game.actions;

import game.Game;
import game.phase.GamePhase;
import game.turn.TurnPhase;
import meta.Meta;

/*
 * Opponents on the game table in the lobby phase, optionally must say "Ok, let's play!!"
 */
public class AcceptSettings extends AbstractGameAction
{
    private static final long serialVersionUID = 8181882830703417988L;

    @Override
    public boolean isAllowed(TurnPhase turnPhase)
    {
        return false;
    }

    /*
     * Returns true when the game is in the lobby
     * 
     * @see soc.common.actions.gameAction.GameAction#isAllowed(soc.common.game.phases.GamePhase)
     */
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
        // LobbyGamePhase lobbyPhase = (LobbyGamePhase) game.getCurrentPhase();
        // if (!lobbyPhase.getPlayersWhoAcceptedSettings().contains(getPlayer()))
        // {
        // lobbyPhase.getPlayersWhoAcceptedSettings().add(getPlayer());
        // }

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
