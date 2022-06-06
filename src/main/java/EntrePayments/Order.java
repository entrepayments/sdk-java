package EntrePayments;

public class Order {
    private String number;
    private int amount;
    private int currency = Currency.BRL;
    private String description;

    public Order(String number, int amount, int currency, String description) throws Exception {
        setNumber(number);
        setAmount(amount);
        setCurrency(currency);
        setDescription(description);
    }

    public Order(String number, int amount) throws Exception {
        this(number, amount, Currency.BRL, "");
    }

    public Order(String number, int amount, int currency) throws Exception {
        this(number, amount, currency, "");
    }

    public Order(String number, int amount, String description) throws Exception {
        this(number, amount, Currency.BRL, description);
    }

    public String getNumber() {
        return number;
    }

    public Order setNumber(String number) {
        this.number = number;
        return this;
    }

    public int getAmount() {
        return amount;
    }

    public Order setAmount(int amount) {
        this.amount = amount;
        return this;
    }

    public int getCurrency() {
        return currency;
    }

    public Order setCurrency(int currency) throws Exception {
        if (!Currency.isValid(currency)) {
            throw new Exception("Invalid currency");
        }

        this.currency = currency;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Order setDescription(String description) {
        this.description = description;
        return this;
    }
}
