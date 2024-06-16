package dto;

import java.math.BigDecimal;
import java.util.Objects;

public class TransferRequest {

    private final BigDecimal value;
    private final int payer;
    private final int payee;


    public TransferRequest(final BigDecimal aValue, final int aPayer, final int aPayee) {
        this.value = aValue;
        this.payer = aPayer;
        this.payee = aPayee;
    }

    public BigDecimal getValue() {
        return value;
    }

    public int getPayer() {
        return payer;
    }

    public int getPayee() {
        return payee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransferRequest that = (TransferRequest) o;
        return getPayer() == that.getPayer() && getPayee() == that.getPayee() && Objects.equals(getValue(), that.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue(), getPayer(), getPayee());
    }

    @Override
    public String toString() {
        return "TransferRequest{" +
                "value=" + value +
                ", payer=" + payer +
                ", payee=" + payee +
                '}';
    }
}

