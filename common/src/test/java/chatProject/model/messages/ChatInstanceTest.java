package chatProject.model.messages;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class ChatInstanceTest {

    @Test
    public void getCurentChatrooms() {
        ArrayList<Chatroom> chatrooms = new ArrayList<Chatroom>();
        ChatInstance chatInstance = new ChatInstance(chatrooms, null);

        assertEquals("The current chatroom is not the one set in the constructor",
                chatrooms, chatInstance.getCurentChatrooms());
    }

    @Test
    public void addChatroom() {
        ArrayList<Chatroom> chatrooms = new ArrayList<Chatroom>();
        ChatInstance chatInstance = new ChatInstance(chatrooms, null);
        Chatroom chatroom = new Chatroom("name", null, null);

        assertEquals("The chatroom is not the one set in the constructor",
                0, chatInstance.addChatroom(chatroom));
    }

    /*@Test
    public void addUser() {
        ArrayList<Chatroom> chatrooms = new ArrayList<Chatroom>();
        Map<UserInfo, LocalTime> users = new Map<UserInfo, LocalTime>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public LocalTime get(Object key) {
                return null;
            }

            @Override
            public LocalTime put(UserInfo key, LocalTime value) {
                return null;
            }

            @Override
            public LocalTime remove(Object key) {
                return null;
            }

            @Override
            public void putAll(Map<? extends UserInfo, ? extends LocalTime> m) {

            }

            @Override
            public void clear() {

            }

            @Override
            public Set<UserInfo> keySet() {
                Set<UserInfo> set = new Set<UserInfo>() {
                    @Override
                    public int size() {
                        return 0;
                    }

                    @Override
                    public boolean isEmpty() {
                        return false;
                    }

                    @Override
                    public boolean contains(Object o) {
                        return false;
                    }

                    @Override
                    public Iterator<UserInfo> iterator() {
                        return null;
                    }

                    @Override
                    public Object[] toArray() {
                        return new Object[0];
                    }

                    @Override
                    public <T> T[] toArray(T[] a) {
                        return null;
                    }

                    @Override
                    public boolean add(UserInfo userInfo) {
                        return false;
                    }

                    @Override
                    public boolean remove(Object o) {
                        return false;
                    }

                    @Override
                    public boolean containsAll(Collection<?> c) {
                        return false;
                    }

                    @Override
                    public boolean addAll(Collection<? extends UserInfo> c) {
                        return false;
                    }

                    @Override
                    public boolean retainAll(Collection<?> c) {
                        return false;
                    }

                    @Override
                    public boolean removeAll(Collection<?> c) {
                        return false;
                    }

                    @Override
                    public void clear() {

                    }
                };
                return set;
            }

            @Override
            public Collection<LocalTime> values() {
                return null;
            }

            @Override
            public Set<Entry<UserInfo, LocalTime>> entrySet() {
                return null;
            }
        };
        ChatInstance chatInstance = new ChatInstance(chatrooms, users);
        UserInfo user = new UserInfo(new UserAccount(0, "toto"), Status.ACTIVE);

        assertEquals("The user is not the one set in the constructor",
                true, chatInstance.addUser(user));
    }*/
}
