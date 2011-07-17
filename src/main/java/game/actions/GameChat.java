package game.actions;

import game.Game;
import game.phase.GamePhase;
import game.turn.TurnPhase;
import meta.Meta;

/*
 * A player is saying something in this game using a text chat interface
 */
public class GameChat extends AbstractGameAction
{
    private static final long serialVersionUID = -3710258112524872173L;
    private String chatMessage;

    /** @return the chatMessage */
    public String getChatMessage()
    {
        return chatMessage;
    }

    /** @param chatMessage
     *            the chatMessage to set */
    public GameChat setChatMessage(String chatMessage)
    {
        this.chatMessage = chatMessage;

        return this;
    }

    @Override
    public void perform(Game game)
    {
        // // Add the chat message to the chat log of this game
        // game.getChatLog().say(this);
        //
        // message = ": " + chatMessage;

        super.perform(game);
    }

    @Override
    public boolean isAllowed(GamePhase gamePhase)
    {
        return true;
    }

    /*
     * (non-Javadoc)
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