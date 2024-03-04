package homework5.Task1;

final class Chat implements Comparable<Chat> {
    private final String chatName;
    private int membersNumber;

    public Chat(String chatName, int membersNumber) {
        this.chatName = chatName;
        this.membersNumber = membersNumber;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "chatName='" + chatName + '\'' +
                ", membersNumber=" + membersNumber +
                '}';
    }

    public String getChatName() {
        return chatName;
    }

    public int getMembersNumber() {
        return membersNumber;
    }

    @Override
    public int compareTo(Chat o) {
        return Integer.compare(membersNumber, o.membersNumber);
    }
}
