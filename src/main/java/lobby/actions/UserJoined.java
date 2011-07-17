package lobby.actions;

import game.player.User;
import lobby.Lobby;

/*
 * A player has logged in and joined the server
 */
public class UserJoined extends AbstractLobbyAction
{
    private static final long serialVersionUID = -379055883044399903L;
    private User joinedUser;

    @Override
    public String getMessage()
    {
        return "";

        // return I18n.get().lobby().joined(user.getName());
    }

    @Override
    public void perform(Lobby lobby)
    {
        // lobby.getUsers().addUser(joinedUser);
    }

    public UserJoined setJoinedUser(User joinedUser)
    {
        this.joinedUser = joinedUser;
        return this;
    }

    public User getJoinedUser()
    {
        return joinedUser;
    }

}
