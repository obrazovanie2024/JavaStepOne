package homework5.Task2;

import java.util.List;

public final class Chat {
    private final String name;
    private final List<Member> memberList;

    public Chat(String name, List<Member> memberList) {
        this.name = name;
        this.memberList = memberList;
    }

    public String getName() {
        return name;
    }

    public List<Member> getMemberList() {
        return memberList;
    }
}
