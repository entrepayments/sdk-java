package EntrePayments;

public class Currency {
    public static int BRL = 986;

    public static boolean isValid(int currency) {
        for (int testCurrency : allCurrencies()) {
            if (testCurrency == currency) {
                return true;
            }
        }

        return false;
    }

    public static int[] allCurrencies() {
        return new int[]{BRL};
    }
}
