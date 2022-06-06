package EntrePayments;

public class Merchant {
    private String merchantKey;
    private String merchantCode;
    private String terminal;

    public Merchant(String merchantKey, String merchantCode, String terminal) {
        setMerchantKey(merchantKey);
        setMerchantCode(merchantCode);
        setTerminal(terminal);
    }

    public String getMerchantKey() {
        return merchantKey;
    }

    public Merchant setMerchantKey(String merchantKey) {
        this.merchantKey = merchantKey;
        return this;
    }

    public String getMerchantCode() {
        return merchantCode;
    }

    public Merchant setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
        return this;
    }

    public String getTerminal() {
        return terminal;
    }

    public Merchant setTerminal(String terminal) {
        this.terminal = terminal;
        return this;
    }
}
