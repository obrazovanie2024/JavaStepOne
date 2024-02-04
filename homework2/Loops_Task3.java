package homework2;

/**
 * Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию Junior Java Developer с зарплатой 600$ в месяц.
 * Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
 * 300$ в месяц Ваня тратит на еду и развлечения.
 * 10% от зарплаты Ваня ежемесячно переводит на счёт брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
 * Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
 * Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты.
 */

public class Loops_Task3 {
    public static void main(String[] args) {
        var salary = 600.0;
        var percentOfSalary = 0.1;
        var profitPerMonth = 0.02;
        var numberOfMonths = 38; // 3 года и 2 месяца
        calculateWealth(salary, percentOfSalary, profitPerMonth, numberOfMonths);
    }

    private static void calculateWealth(double salary, double percentOfSalary, double profitPerMonth, int numberOfMonths) {
        var fee = salary * percentOfSalary;
        var foodAndEntertainments = 300.0;
        var brokerProfit = fee;
        var cash = 0.0;
        for (int i = 1; i <= numberOfMonths; i++) {
            brokerProfit += (brokerProfit * profitPerMonth) + fee;
            cash += salary - fee - foodAndEntertainments;
            if (isSixMonthsPassed(i)) {
                fee += 400 * percentOfSalary;
                salary += 400;
            }
            System.out.println("Broker profit after " + i + " month: " + brokerProfit);
            System.out.println("Cash after " + i + " month: " + cash);
        }
        System.out.println("Total broker profit: " + brokerProfit);
        System.out.println("Total cash: " + cash);
    }

    private static boolean isSixMonthsPassed (int currentMonth) {
        return (currentMonth % 6) == 0;
    }

}
