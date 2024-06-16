package user;

import document.CNPJ;

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
}
