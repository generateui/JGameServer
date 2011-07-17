package game.actions;

import game.phase.GamePhase;
import game.turn.TurnPhase;
import meta.Meta;

/*
 * A generic message from the server. Currently used as error message
 * for debugging purposes. POssible future use is for example servers
 * rebooting.
 */
public class MessageFromServer extends AbstractGameAction
{
    private static final long serialVersionUID = -4467388096445126041L;
    private String serverMessage;

    /** @return the serverMessage */
    public String getServerMessage()
    {
        return serverMessage;
    }

    /** @param serverMessage
     *            the serverMessage to set */
    public MessageFromServer setServerMessage(String serverMessage)
    {
        this.serverMessage = serverMessage;

        return this;
    }

    /*
     * Returns true: message from server is always allowed
     * 
     * @see
     * soc.common.actions.gameAction.GameAction#isAllowed(soc.common.game.gamePhase
     * .turnPhase.TurnPhase)
     */
    @Override
    public boolean isAllowed(TurnPhase turnPhase)
    {
        return true;
    }

    /*
     * Returns true: message from server is always allowed
     * 
     * @see
     * soc.common.actions.gameAction.GameAction#isAllowed(soc.common.game.gamePhase
     * .GamePhase)
     */
    @Override
    public boolean isAllowed(GamePhase gamePhase)
    {
        return true;
    }

    @Override
    public String getToDoMessage()
    {
        return "";
    }

    @Override
    public Meta getMeta()
    {
        return null;
    }
}
