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

    public void transferAmount(final BigDecimal value, final User payee) {
        if (Objects.isNull(value) || BigDecimal.ZERO.compareTo(value) > 0 || super.getAmount().compareTo(value) < 0) {
            return;
        }
        payee.addAmount(value);
        subtractAmount(value);
    }

    public CPF getDocument() {
        return document;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CommonUser that = (CommonUser) o;
        return Objects.equals(getDocument(), that.getDocument());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDocument());
    }
}
