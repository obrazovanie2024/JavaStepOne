package homework4.homework.Task1;

public class Atm {
    private int banknote10;
    private int banknote20;
    private int banknote50;
    final private int YE10 = 10;
    final private int YE20 = 20;
    final private int YE50 = 50;
    private char errorCode;
    private int b10W;
    private int b20W;
    private int b50W;

    public Atm(int banknote10, int banknote20, int banknote50) {
        this.banknote10 = banknote10;
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
    }

    public void addBanknote10(int banknote10) {
        this.banknote10 = this.banknote10 + banknote10;
    }

    public void addBanknote20(int banknote20) {
        this.banknote20 = this.banknote20 + banknote20;
    }

    public void addBanknote50(int banknote50) {
        this.banknote50 = this.banknote50 + banknote50;
    }

    public void withdrawCash(int requiredAmount) {

        if (!isValid(requiredAmount)) {
            switch (this.errorCode) {
                case 'M' -> System.out.println("На клавиатуре банкомата нет знака минус. Как вам это удалось?");
                case 'C' -> System.out.println("В банкомате есть только банкноты номиналом 50, 20 и 10 евро. За мелочью идите в магазин к кассиру.");
                case 'Z' -> System.out.println("Если вам ничего не нужно, зачем подошли к банкомату?");
                case 'W' -> System.out.println("Денег нет, но вы держитесь.");
                case 'X' -> System.out.println("В банкомате не хватает банкнот нужного номинала.");
            }
            return;
        }

        printInfo(this.b50W, this.b20W, this.b10W);

    }

    private void printInfo(int b50w, int b20w, int b10w) {
        String[] resultArray = new String[3];
        resultArray[0] = b50w == 0 ? "" : "Выдано " + b50w + " шт. номиналом 50";
        resultArray[1] = b20w == 0 ? "" : "Выдано " + b20w + " шт. номиналом 20";
        resultArray[2] = b10w == 0 ? "" : "Выдано " + b10w + " шт. номиналом 10";

        for (String result : resultArray) {
            if (!result.equals("")) {
                System.out.println(result);
            }
        }
    }

    private boolean isValid(int requiredAmount) {
        if (requiredAmount < 0) {
            this.errorCode = 'M';
            return false;
        }
        if (!(requiredAmount % 50 == 0 || requiredAmount % 20 == 0 || requiredAmount % 10 == 0)) {
            this.errorCode = 'C';
            return false;
        }

        if (requiredAmount == 0) {
            this.errorCode = 'Z';
            return false;
        }

        if (requiredAmount > getRemainAmount()) {
            this.errorCode = 'W';
            return false;
        }

        int b50w = 0;
        int b20w = 0;
        int b10w = 0;
        if (requiredAmount >= YE50) {
            b50w = requiredAmount / YE50;
            if (this.banknote50 / b50w == 0) {
                int diff = b50w - this.banknote50;
                requiredAmount = requiredAmount % YE50 + diff * YE50;
                this.b50W = this.banknote50;
            } else {
                requiredAmount %= YE50;
                this.b50W = b50w;
            }
        }
        if (requiredAmount >= YE20) {
            b20w = requiredAmount / YE20;
            if (this.banknote20 / b20w == 0) {
                int diff = b20w - this.banknote20;
                requiredAmount = requiredAmount % YE20 + diff * YE20;
                this.b20W = this.banknote20;
            } else {
                requiredAmount %= YE20;
                this.b20W = b20w;
            }
        }
        if (requiredAmount >= YE10) {
            b10w = requiredAmount / YE10;
            if (this.banknote10 / b10w == 0) {
                int diff = b10w - this.banknote10;
                this.b10W = this.banknote10;
                requiredAmount = requiredAmount % YE10 + diff * YE10;
            } else {
                requiredAmount %= YE10;
                this.b10W = b10w;
            }
        }

        if (requiredAmount != 0) {
            this.errorCode = 'X';
            return false;
        }

        return true;
    }

    private int getRemainAmount() {
        return this.banknote10 * YE10 + this.banknote20 * YE20 + this.banknote50 * YE50;
    }

}
