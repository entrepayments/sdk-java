package EntrePayments;

import EntrePayments.Request.Environment;

public class Payment implements Cloneable {
    public static final String AUTHORIZATION_WITHOUT_3DS = "A";
    public final String AUTHORIZATION_WITH_3DS = "1";
    public final String PRE_AUTHORIZATION = "1";
    public final String AUTHORIZATION_CONFIRMATION = "2";
    public final String CANCELMENT = "3";
    public final String PRE_AUTHORIZATION_CANCELMENT = "9";

    private Order order;
    private Card card;
    private Environment environment;
    private String softDescriptor;
    private int installments = 1;
    private Boolean securePayment = false;
    private String authenticationUrl = null;
    private String authorizationCode = null;
    private String language = null;
    private String nsu = null;
    private String processedPayMethod = null;
    private String response = null;
    private String respondeInt = null;
    private String paRequest = null;
    private String md = null;
    private String merchantData = null;
    private String state = null;
    private String transactionType = null;

    public Payment(Order order, Card card, String softDescriptor) {
        setOrder(order);
        setCard(card);
        setSoftDescriptor(softDescriptor);
    }

    public Payment(Order order) {
        this(order, null, "");
    }

    public Payment(Order order, Card card) {
        this(order, card, "");
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getAUTHORIZATION_WITHOUT_3DS() {
        return AUTHORIZATION_WITHOUT_3DS;
    }

    public String getAUTHORIZATION_WITH_3DS() {
        return AUTHORIZATION_WITH_3DS;
    }

    public String getPRE_AUTHORIZATION() {
        return PRE_AUTHORIZATION;
    }

    public String getAUTHORIZATION_CONFIRMATION() {
        return AUTHORIZATION_CONFIRMATION;
    }

    public String getCANCELMENT() {
        return CANCELMENT;
    }

    public String getPRE_AUTHORIZATION_CANCELMENT() {
        return PRE_AUTHORIZATION_CANCELMENT;
    }

    public Order getOrder() {
        return order;
    }

    public Payment setOrder(Order order) {
        this.order = order;
        return this;
    }

    public Card getCard() {
        return card;
    }

    public Payment setCard(Card card) {
        this.card = card;
        return this;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public Payment setEnvironment(Environment environment) {
        this.environment = environment;
        return this;
    }

    public String getSoftDescriptor() {
        return softDescriptor;
    }

    public Payment setSoftDescriptor(String softDescriptor) {
        this.softDescriptor = softDescriptor;
        return this;
    }

    public int getInstallments() {
        return installments;
    }

    public Payment setInstallments(int installments) {
        this.installments = installments;
        return this;
    }

    public Boolean getSecurePayment() {
        return securePayment;
    }

    public Payment setSecurePayment(Boolean securePayment) {
        this.securePayment = securePayment;
        return this;
    }

    public String getAuthenticationUrl() {
        return authenticationUrl;
    }

    public Payment setAuthenticationUrl(String authenticationUrl) {
        this.authenticationUrl = authenticationUrl;
        return this;
    }

    public String getAuthorizationCode() {
        return authorizationCode;
    }

    public Payment setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public Payment setLanguage(String language) {
        this.language = language;
        return this;
    }

    public String getNsu() {
        return nsu;
    }

    public Payment setNsu(String nsu) {
        this.nsu = nsu;
        return this;
    }

    public String getProcessedPayMethod() {
        return processedPayMethod;
    }

    public Payment setProcessedPayMethod(String processedPayMethod) {
        this.processedPayMethod = processedPayMethod;
        return this;
    }

    public String getResponse() {
        return response;
    }

    public Payment setResponse(String response) {
        this.response = response;
        return this;
    }

    public String getRespondeInt() {
        return respondeInt;
    }

    public Payment setRespondeInt(String respondeInt) {
        this.respondeInt = respondeInt;
        return this;
    }

    public String getPaRequest() {
        return paRequest;
    }

    public Payment setPaRequest(String paRequest) {
        this.paRequest = paRequest;
        return this;
    }

    public String getMd() {
        return md;
    }

    public Payment setMd(String md) {
        this.md = md;
        return this;
    }

    public String getMerchantData() {
        return merchantData;
    }

    public Payment setMerchantData(String merchantData) {
        this.merchantData = merchantData;
        return this;
    }

    public String getState() {
        return state;
    }

    public Payment setState(String state) {
        this.state = state;
        return this;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public Payment setTransactionType(String transactionType) {
        this.transactionType = transactionType;
        return this;
    }
}
