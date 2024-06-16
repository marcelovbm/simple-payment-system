package document;

public class CPF {

    private final int document;

    private CPF(final int aDocument) {
        this.document = aDocument;
    }

    public static CPF create(final int value) {
        if (String.valueOf(value).length() != 9) {
            throw new RuntimeException("Value with incorrect size. It must have 12 digits.");
        }

        return new CPF(value);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(document).insert(3, ".")
                .insert(7, ".")
                .insert(11, "-");
        return "CPF " + stringBuilder;
    }
}
