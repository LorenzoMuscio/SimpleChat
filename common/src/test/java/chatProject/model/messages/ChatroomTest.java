package chatProject.model.messages;

import chatProject.model.user.Status;
import chatProject.model.user.UserAccount;
import chatProject.model.user.UserInfo;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ChatroomTest {

    @Test
    public void getName() {
        final Chatroom chatroom = new Chatroom("name", null, null);

        assertEquals("The chatroom name is not the one set in the constructor",
                "name", chatroom.getName());
    }

    @Test
    public void getOwner() {
        Status status = Status.ACTIVE;
        UserInfo owner = new UserInfo(new UserAccount(0, "username"), status);
        final Chatroom chatroom = new Chatroom("name", owner, null);

        assertEquals("The chatroom owner is not the one set in the constructor",
                owner, chatroom.getOwner());
    }

    @Test
    public void getCurrentMessages() {
        ArrayList<Message> messages = new ArrayList<Message>();
        Chatroom chatroom = new Chatroom("name", null, messages);

        assertEquals("The current messages is not the one set in the constructor",
                messages, chatroom.getCurrentMessages());
    }

    @Test
    public void addMessage() {
        ArrayList<Message> messages = new ArrayList<Message>();
        Chatroom chatroom = new Chatroom("name", null, messages);
        Message message = new Message(0, null, "salut");

        assertEquals("The current message is not the one set in the constructor",
                message, chatroom.addMessage(message));
    }

    @Test
    public void addMessage1() {
        ArrayList<Message> messages = new ArrayList<Message>();
        Chatroom chatroom = new Chatroom("name", null, messages);
        Message message = new Message(0, null, "salut");

        assertEquals("The current message is not the one set in the constructor",
                message, chatroom.addMessage(null, "salut"));
    }
}
