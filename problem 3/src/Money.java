public class Money {
    private double amount;

    public Money(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public boolean equals(Money other) {
        return this.amount == other.amount;
    }

    public int compareTo(Money other) {
        if (this.amount < other.amount) {
            return -1;
        } else if (this.amount > other.amount) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "$" + String.format("%.2f", amount);
    }
}
