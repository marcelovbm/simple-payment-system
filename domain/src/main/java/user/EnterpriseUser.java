package user;

import document.CNPJ;

import java.util.Objects;

public class EnterpriseUser extends User {

    private final CNPJ document;

    protected EnterpriseUser(final String aName, final int aDocument, final String anEmail, final String aPassword) {
        super(aName, anEmail, aPassword);
        this.document = CNPJ.create(aDocument);
    }

    public static EnterpriseUser create(final String aName, final int aDocument, final String anEmail, final String aPassword) {
        return new EnterpriseUser(aName, aDocument, anEmail, aPassword);
    }

    public CNPJ getDocument() {
        return document;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EnterpriseUser that = (EnterpriseUser) o;
        return Objects.equals(getDocument(), that.getDocument());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDocument());
    }
}
