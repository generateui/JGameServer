package game.actions;

import game.Game;
import game.GameAction;
import game.player.GamePlayer;
import game.status.GameStatus;
import game.turn.Turn;

import java.util.Date;

import server.GameServerActionFactory;
import server.ServerAction;
import util.ClassUtils;

/*
 * A GameAction performed in a game
 */
public abstract class AbstractGameAction extends AbstractAction implements
                GameAction
{
    private static final long serialVersionUID = -2161422971683389585L;
    protected transient GamePlayer player;
    protected transient String invalidMessage;
    protected transient String toDoMessage;
    protected Turn turnExecuted;
    protected int id;

    /*
     * Returns the ID of the action
     * 
     * @see soc.common.actions.gameAction.GameAction#getID()
     */
    @Override
    public int getID()
    {
        return id;
    }

    /*
     * Sets the ID of the action
     * 
     * @see soc.common.actions.gameAction.GameAction#setID(int)
     */
    @Override
    public GameAction setID(int ID)
    {
        this.id = ID;
        return null;
    }

    /** @return Message explaining why this action is in invalid state */
    public String getInvalidMessage()
    {
        return invalidMessage;
    }

    /** @return Message set after this action is performed */
    public String getMessage()
    {
        return message;
    }

    /** @return the player */
    public GamePlayer getPlayer()
    {
        if (sender == 0 && player == null)
        {
            // player = new GamePlayerImpl().setUser(Core.get().getServerUser());
        }
        return player;
    }

    /** @param player
     *            the player to set */
    public GameAction setPlayer(GamePlayer player)
    {
        this.player = player;
        this.sender = player.getUser().getId();

        return this;
    }

    /*
     * Subclasses should call this method after they have performed their
     * specific implementation (at the end of the method)
     */
    public void perform(Game game)
    {
        // Set the dateTime when this action is performed
        dateTimeExecuted = new Date();

        // Add this action to the gamelog
        // game.getGameLog().addAction(this);
    }

    /*
     * Returns true when this action is allowed Since we're deserializing raw
     * send data, we want to check it
     */
    @Override
    public boolean isValid(Game game)
    {
        if (!isAllowed(game.getCurrentPhase()))
        {
            invalidMessage = getName() + " is not allowed during "
                            + game.getCurrentPhase().getName();
            return false;
        }

        return true;
    }

    // TODO: implement in subclasses and return i18n constants
    public String getName()
    {
        return ClassUtils.getSimpleClassName(this.getClass().getName());
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * soc.common.actions.gameAction.GameAction#isAllowed(soc.common.game.statuses
     * .IGameStatus)
     */
    @Override
    public boolean isAllowed(GameStatus gameStatus)
    {
        if (gameStatus.isGameBlocking())
        {
            return false;
        }

        return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see soc.common.actions.gameAction.GameAction#isServer()
     */
    @Override
    public boolean isServer()
    {
        return sender == 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see soc.common.actions.gameAction.GameAction#mustExpected()
     */
    @Override
    public boolean mustExpected()
    {
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * soc.common.actions.gameAction.GameAction#isExpectedQueueType(soc.common
     * .actions.gameAction.GameAction)
     */
    @Override
    public boolean isExpectedQueueType(GameAction actualAction)
    {
        return this.getClass() == actualAction.getClass();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * soc.common.actions.gameAction.GameAction#createServerAction(soc.common
     * .server.actions.ServerActionFactory)
     */
    @Override
    public ServerAction createServerAction(GameServerActionFactory factory)
    {
        return factory.createDefaultServerAction(this);
    }
}
