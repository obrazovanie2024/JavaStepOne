package homework5.Task1;

import java.util.*;

public final class ChatUtil {

    private ChatUtil() {

    }

    public static Map<String, Integer> getStringIntegerMap() {
        Map<String, Integer> chatList1 = new HashMap<>(15);
        chatList1.put("oneSmallChat1", 11);
        chatList1.put("oneSmallChat2", 22);
        chatList1.put("oneSmallChat3", 33);
        chatList1.put("oneSmallChat4", 44);
        chatList1.put("oneSmallChat5", 55);
        chatList1.put("oneMediumChat1", 111);
        chatList1.put("oneMediumChat2", 222);
        chatList1.put("oneMediumChat3", 333);
        chatList1.put("oneMediumChat4", 444);
        chatList1.put("oneMediumChat5", 555);
        chatList1.put("oneLargeChat1", 1111);
        chatList1.put("oneLargeChat2", 2222);
        chatList1.put("oneLargeChat3", 3333);
        chatList1.put("oneLargeChat4", 4444);
        chatList1.put("oneLargeChat5", 5555);
        return chatList1;
    }

    public static void removeChatsWhereLessThanThousandMembers (Map<String, Integer> map) {
        for (Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator(); iterator.hasNext(); ) {
            if (iterator.next().getValue() < 1000) {
                iterator.remove();
            }
        }
    }

    public static void removeChatsWhereLessThanThousandMembers2 (List<Chat> list) {
        for (Iterator<Chat> iterator = list.iterator(); iterator.hasNext(); ) {
            if (iterator.next().getMembersNumber() < 1000) {
                iterator.remove();
            }
        }
    }

}
