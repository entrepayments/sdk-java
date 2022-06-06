package EntrePayments;

public class Card {
    public static final int CREDITCARD = 1;
    public static final int DEBITCARD = 2;
    public static final boolean USE_3DS = true;
    public static final int THREE_D_SECURE_VERSION_1 = 1;
    public static final int THREE_D_SECURE_VERSION_2 = 2;

    private int accountType;
    private String pan;
    private String expiration;
    private String holderName;
    private String cvv;
    private boolean threeDSecure;
    private int threeDSecureVersion = THREE_D_SECURE_VERSION_2;
    private int cardBrand;
    private int cardCountry;
    private String identifier;


    public Card(
            int accountType,
            String pan,
            String expirationYear,
            String expirationMonth,
            String holderName,
            String cvv
    ) {
        setAccountType(accountType);
        setHolderName(holderName);
        setPan(pan);
        setExpiration(expirationYear, expirationMonth);
        setCvv(cvv);
        setIdentifier(identifier);
    }

    public Card(
            int accountType,
            String identifier
    ) {
        setAccountType(accountType);
        setIdentifier(identifier);
    }

    public static Card creditCard(
            String pan,
            String expirationYear,
            String expirationMonth,
            String holderName,
            String cvv
    ) {
        return new Card(
                CREDITCARD,
                pan,
                expirationYear,
                expirationMonth,
                holderName,
                cvv
        );
    }

    public static Card debitCard(
            String pan,
            String expirationYear,
            String expirationMonth,
            String holderName,
            String cvv,
            int threeDSecureVersion
    ) {
        Card card = new Card(
                DEBITCARD,
                pan,
                expirationYear,
                expirationMonth,
                holderName,
                cvv
        );

        card.setThreeDSecureVersion(threeDSecureVersion);

        return card;
    }

    public static Card debitCard(
            String pan,
            String expirationYear,
            String expirationMonth,
            String holderName,
            String cvv
    ) {
        return debitCard(
                pan,
                expirationYear,
                expirationMonth,
                holderName,
                cvv,
                THREE_D_SECURE_VERSION_2
        );
    }

    public static Card token(String identifier) {
        return new Card(
                CREDITCARD,
                identifier
        );
    }

    public int getAccountType() {
        return accountType;
    }

    public Card setAccountType(int accountType) {
        this.accountType = accountType;
        return this;
    }

    public String getPan() {
        return pan;
    }

    public Card setPan(String pan) {
        this.pan = pan;
        return this;
    }

    public String getExpiration() {
        return expiration;
    }

    public Card setExpiration(String expirationYear, String expirationMonth) {
        this.expiration = expirationYear + expirationMonth;
        return this;
    }

    public String getHolderName() {
        return holderName;
    }

    public Card setHolderName(String holderName) {
        this.holderName = holderName;
        return this;
    }

    public String getCvv() {
        return cvv;
    }

    public Card setCvv(String cvv) {
        this.cvv = cvv;
        return this;
    }

    public boolean isThreeDSecure() {
        return threeDSecure;
    }

    public Card setThreeDSecure(boolean threeDSecure) {
        this.threeDSecure = threeDSecure;
        return this;
    }

    public int getThreeDSecureVersion() {
        return threeDSecureVersion;
    }

    public Card setThreeDSecureVersion(int threeDSecureVersion) {
        this.threeDSecureVersion = threeDSecureVersion;
        return this;
    }

    public int getCardBrand() {
        return cardBrand;
    }

    public Card setCardBrand(int cardBrand) {
        this.cardBrand = cardBrand;
        return this;
    }

    public int getCardCountry() {
        return cardCountry;
    }

    public Card setCardCountry(int cardCountry) {
        this.cardCountry = cardCountry;
        return this;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Card setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
}
