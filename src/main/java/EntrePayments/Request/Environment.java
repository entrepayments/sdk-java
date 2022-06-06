package EntrePayments.Request;

import EntrePayments.Merchant;
import EntrePayments.Payment;

/**
 * Defines an environment to be used to request the API.
 */
public interface Environment {
    boolean isProduction();

    Merchant getMerchant();

    String getUserAgent();

    Payment authorize(
            Payment payment,
            boolean capture,
            boolean recurring,
            boolean tokenize
    );

    Payment consult(Payment $payment, String $transactionType);

    Payment capture(Payment $payment);

    Payment cancel(Payment $payment, boolean $preAuthorization);
}
