package user;

import document.CPF;

import java.math.BigDecimal;
import java.util.Objects;

public class CommonUser extends User {

    private final CPF document;

    private CommonUser(final String aName, final int aDocument, final String anEmail, final String aPassword) {
        super(aName, anEmail, aPassword);
        this.document = CPF.create(aDocument);
    }

    public static CommonUser create(final String aName, final int aDocument, final String anEmail, final String aPassword) {
        return new CommonUser(aName, aDocument, anEmail, aPassword);
    }

    public void transferAmount(final BigDecimal value, final User user) {
        if (Objects.isNull(value) || BigDecimal.ZERO.compareTo(value) > 0 || super.getAmount().compareTo(value) < 0) {
            return;
        }
        user.addAmount(value);
        subtractAmount(value);
    }

    public CPF getDocument() {
        return document;
    }
}
