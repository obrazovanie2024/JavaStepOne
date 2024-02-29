package homework5.Task2;

/**
 * Дан список чатов с предыдущего задания, только вместо поля “количество пользователей”
 * будет список объектов типа Пользователь, который имеет 3 поля:
 * id (целочисленный идентификатор), имя и возраст.
 * Задача:
 * - Преобразовать список чатов в один список пользователей всех чатов, возраст которых больше 18 лет
 * - С помощью итератора посчитать средний возраст всех оставшихся пользователей.
 */

import java.util.List;

public class ChatRunner {
    public static void main(String[] args) {

        Member memberFromFirstChat1 = new Member(1, "Аркадий", 13);
        Member memberFromFirstChat2 = new Member(2, "Артур", 14);
        Member memberFromFirstChat3 = new Member(3, "Афанасий", 15);
        List<Member> memberListOfFirstChat = List.of(memberFromFirstChat1, memberFromFirstChat2, memberFromFirstChat3);
        Chat firstChat = new Chat("Первый чат", memberListOfFirstChat);

        Member memberFromSecondChat1 = new Member(4, "Бенджамин", 32);
        Member memberFromSecondChat2 = new Member(5, "Богдан", 35);
        Member memberFromSecondChat3 = new Member(6, "Борис", 38);
        List<Member> memberListOfSecondChat = List.of(memberFromSecondChat1, memberFromSecondChat2, memberFromSecondChat3);
        Chat secondChat = new Chat("Второй чат", memberListOfSecondChat);

        Member memberFromThirdChat1 = new Member(7, "Вадим", 41);
        Member memberFromThirdChat2 = new Member(8, "Виктор", 44);
        Member memberFromThirdChat3 = new Member(9, "Владимир", 47);
        List<Member> memberListOfThirdChat = List.of(memberFromThirdChat1, memberFromThirdChat2, memberFromThirdChat3);
        Chat thirdChat = new Chat("Третий чат", memberListOfThirdChat);

        List<Chat> chatList = List.of(firstChat, secondChat, thirdChat);

        List<Member> membersWhoOlderEighteenFromAllChats = ChatUtil.getMembersWhoOlderEighteenFromAllChats(chatList);

        System.out.println(membersWhoOlderEighteenFromAllChats);
        System.out.println("Участники старше 18:");
        for (Member member : membersWhoOlderEighteenFromAllChats) {
            member.printInfo();
        }
        System.out.println("Средний возраст участников: " + ChatUtil.getAverageAge(membersWhoOlderEighteenFromAllChats));

    }

}
