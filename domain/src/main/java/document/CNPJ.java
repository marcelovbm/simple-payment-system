package document;

public class CNPJ {

    private final int document;

    private CNPJ(final int aDocument) {
        this.document = aDocument;
    }

    public static CNPJ create(final int value) {
        if (String.valueOf(value).length() != 12) {
            throw new RuntimeException("Value with incorrect size. It must have 12 digits.");
        }

        return new CNPJ(value);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(document).insert(2, ".")
                .insert(6, ".")
                .insert(10, "/")
                .insert(15, "-");
        return "CNPJ " + stringBuilder;
    }
}
