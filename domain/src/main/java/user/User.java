package user;

import java.math.BigDecimal;
import java.util.Objects;

public class User {

    private final String name;
    private final String email;
    private final String password;
    private BigDecimal amount;

    protected User(final String aName, final String anEmail, final String aPassword) {
        super();
        this.name = aName;
        this.email = anEmail;
        this.password = aPassword;
        this.amount = BigDecimal.ZERO;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    protected void addAmount(final BigDecimal value) {
        this.amount = this.amount.add(value);
    }

    protected void subtractAmount(final BigDecimal value) {
        this.amount = this.amount.subtract(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(getName(), user.getName())
                && Objects.equals(getEmail(), user.getEmail())
                && Objects.equals(getPassword(), user.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getEmail(), getPassword());
    }
}
