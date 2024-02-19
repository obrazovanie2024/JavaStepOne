package homework4.homework.Task1;

public class ApplicationRunner {
    public static void main(String[] args) {
        Atm atm = new Atm(0, 0, 100);
        atm.withdrawCash(130);

        atm.addBanknote10(100);
        atm.addBanknote20(100);
        atm.addBanknote50(0);
        atm.withdrawCash(130);

    }
}
