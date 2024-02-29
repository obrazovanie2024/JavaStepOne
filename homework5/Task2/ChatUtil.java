package homework5.Task2;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.List;

public final class ChatUtil {
    private ChatUtil() {

    }

    public static List<Member> getMembersWhoOlderEighteenFromAllChats (List<Chat> chatList) {
        List<Member> membersFromAllChats = new ArrayList<>();
        for (Chat chat : chatList) {
            membersFromAllChats.addAll(chat.getMemberList());
        }
        List<Member> membersOlderEighteen = new ArrayList<>();
        for (Member member : membersFromAllChats) {
            if (member.getAge() > 18) {
                membersOlderEighteen.add(member);
            }
        }
        return membersOlderEighteen;
    }

    public static BigDecimal getAverageAge (List<Member> memberList) {
        int allElementsSum = 0;
        int memberNumber = memberList.size();
        for (Member member : memberList) {
            allElementsSum += member.getAge();
        }
        return BigDecimal.valueOf(allElementsSum).divide(BigDecimal.valueOf(memberNumber), MathContext.DECIMAL32);
    }

}
