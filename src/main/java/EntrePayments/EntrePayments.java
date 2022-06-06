package EntrePayments;

import EntrePayments.Request.Environment;

public class EntrePayments {
    /**
     * The SDK Version
     */
    public static final String VERSION = "1.0.0";

    private Environment environment;

    public EntrePayments(Environment environment) {
        this.environment = environment;
    }

    public static EntrePayments create(Merchant merchant, boolean production) {
        return new EntrePayments(
                production ?
                        SoapEnvironment.production(merchant) :
                        SoapEnvironment.test(merchant)
        );
    }

    public static EntrePayments create(Merchant merchant) {
        return create(merchant, true);
    }

    public Environment getEnvironment() {
        return environment;
    }

    public Payment authorize(Payment payment, boolean capture, boolean tokenize) {
        return environment.authorize(payment, capture, false, tokenize);
    }

    public Payment authorize(Payment payment, boolean capture) {
        return authorize(payment, capture, true);
    }

    public Payment authorize(Payment payment) {
        return authorize(payment, true, true);
    }

    public Payment consult(Payment payment, String transactionType) {
        return environment.consult(payment, transactionType);
    }

    public Payment consult(Payment payment) {
        return consult(payment, "1");
    }

    public Payment zeroDolar(Payment payment) {
        try {
            Payment newPayment = (Payment) payment.clone();
            newPayment.getOrder().setAmount(0);

            return authorize(newPayment, true);
        } catch (CloneNotSupportedException e) {
        }

        return null;
    }

    public Payment capture(Payment payment) {
        return environment.capture(payment);
    }


    public Payment cancel(Payment payment) {
        return environment.cancel(payment, false);
    }

    public Payment voidPayment(Payment payment) {
        return environment.cancel(payment, true);
    }
}
