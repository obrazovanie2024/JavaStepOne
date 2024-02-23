package homework4.homework.Task1;

public class Atm {
    private int numberOfBanknote10inAtm;
    private int numberOfBanknote20inAtm;
    private int numberOfBanknote50inAtm;
    private static final int DENOMINATION_10 = 10;
    private static final int DENOMINATION_20 = 20;
    private static final int DENOMINATION_50 = 50;
    private String errorCode;
    private static final String NEGATIVE_NUMBER_ERROR = "На клавиатуре банкомата нет знака минус. Как вам это удалось?";
    private static final String NOT_MULTIPLE_OF_50_20_10_ERROR = "В банкомате есть только банкноты номиналом 50, 20 и 10 евро. За мелочью идите в магазин к кассиру.";
    private static final String REQUESTED_NOTHING_ERROR = "Если вам ничего не нужно, зачем подошли к банкомату?";
    private static final String NO_ENOUGH_MONEY_IN_ATM_ERROR = "Денег нет, но вы держитесь.";
    private static final String NOT_ENOUGH_CONCRETE_DENOMINATION_ERROR = "В банкомате не хватает банкнот нужного номинала.";
    private int numberOfBanknote10toWithdraw;
    private int numberOfBanknote20toWithdraw;
    private int numberOfBanknote50toWithdraw;

    public Atm(int banknote10, int banknote20, int banknote50) {
        this.numberOfBanknote10inAtm = banknote10;
        this.numberOfBanknote20inAtm = banknote20;
        this.numberOfBanknote50inAtm = banknote50;
    }

    public void addBanknote10(int banknote10) {
        this.numberOfBanknote10inAtm = this.numberOfBanknote10inAtm + banknote10;
    }

    public void addBanknote20(int banknote20) {
        this.numberOfBanknote20inAtm = this.numberOfBanknote20inAtm + banknote20;
    }

    public void addBanknote50(int banknote50) {
        this.numberOfBanknote50inAtm = this.numberOfBanknote50inAtm + banknote50;
    }

    public void withdrawCash(int requiredAmount) {

        if (!isValid(requiredAmount)) {
            System.out.println(errorCode);
            return;
        }

        printInfo(this.numberOfBanknote50toWithdraw, this.numberOfBanknote20toWithdraw, this.numberOfBanknote10toWithdraw);

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
            this.errorCode = NEGATIVE_NUMBER_ERROR;
            return false;
        }
        if (!(requiredAmount % 50 == 0 || requiredAmount % 20 == 0 || requiredAmount % 10 == 0)) {
            this.errorCode = NOT_MULTIPLE_OF_50_20_10_ERROR;
            return false;
        }

        if (requiredAmount == 0) {
            this.errorCode = REQUESTED_NOTHING_ERROR;
            return false;
        }

        if (requiredAmount > getRemainAmount()) {
            this.errorCode = NO_ENOUGH_MONEY_IN_ATM_ERROR;
            return false;
        }

        int b50w = 0;
        int b20w = 0;
        int b10w = 0;
        if (requiredAmount >= DENOMINATION_50) {
            b50w = requiredAmount / DENOMINATION_50;
            if (this.numberOfBanknote50inAtm / b50w == 0) {
                int diff = b50w - this.numberOfBanknote50inAtm;
                requiredAmount = requiredAmount % DENOMINATION_50 + diff * DENOMINATION_50;
                this.numberOfBanknote50toWithdraw = this.numberOfBanknote50inAtm;
            } else {
                requiredAmount %= DENOMINATION_50;
                this.numberOfBanknote50toWithdraw = b50w;
            }
        }
        if (requiredAmount >= DENOMINATION_20) {
            b20w = requiredAmount / DENOMINATION_20;
            if (this.numberOfBanknote20inAtm / b20w == 0) {
                int diff = b20w - this.numberOfBanknote20inAtm;
                requiredAmount = requiredAmount % DENOMINATION_20 + diff * DENOMINATION_20;
                this.numberOfBanknote20toWithdraw = this.numberOfBanknote20inAtm;
            } else {
                requiredAmount %= DENOMINATION_20;
                this.numberOfBanknote20toWithdraw = b20w;
            }
        }
        if (requiredAmount >= DENOMINATION_10) {
            b10w = requiredAmount / DENOMINATION_10;
            if (this.numberOfBanknote10inAtm / b10w == 0) {
                int diff = b10w - this.numberOfBanknote10inAtm;
                this.numberOfBanknote10toWithdraw = this.numberOfBanknote10inAtm;
                requiredAmount = requiredAmount % DENOMINATION_10 + diff * DENOMINATION_10;
            } else {
                requiredAmount %= DENOMINATION_10;
                this.numberOfBanknote10toWithdraw = b10w;
            }
        }

        if (requiredAmount != 0) {
            this.errorCode = NOT_ENOUGH_CONCRETE_DENOMINATION_ERROR;
            return false;
        }

        return true;
    }

    private int getRemainAmount() {
        return this.numberOfBanknote10inAtm * DENOMINATION_10 + this.numberOfBanknote20inAtm * DENOMINATION_20 + this.numberOfBanknote50inAtm * DENOMINATION_50;
    }

}
