package homework5.Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ChatRunner2 {
    public static void main(String[] args) {
        List<Chat> chats = new ArrayList<>();
        chats.add(new Chat("Small chat 1", 10));
        chats.add(new Chat("Small chat 2", 20));
        chats.add(new Chat("Small chat 3", 30));
        chats.add(new Chat("Medium chat 1", 400));
        chats.add(new Chat("Medium chat 2", 500));
        chats.add(new Chat("Medium chat 3", 600));
        chats.add(new Chat("Big chat 5", 8500));
        chats.add(new Chat("Big chat 4", 8500));
        chats.add(new Chat("Big chat 1", 7000));
        chats.add(new Chat("Big chat 2", 8000));
        chats.add(new Chat("Big chat 3", 9000));

        System.out.println();
        System.out.println(chats);
        ChatUtil.removeChatsWhereLessThanThousandMembers2(chats);
        System.out.println();
        chats.sort(Comparator.comparing(Chat::getMembersNumber).reversed().thenComparing(Chat::getChatName));
        System.out.println(chats);

        chats.sort(new chatNameComparator());
        System.out.println(chats);
    }

    public static class chatNameComparator implements Comparator<Chat> {

        @Override
        public int compare(Chat chat1, Chat chat2) {
            return chat1.getChatName().compareTo(chat2.getChatName());
        }
    }

}
