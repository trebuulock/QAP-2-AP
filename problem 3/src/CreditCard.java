public class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditLimit;

    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.creditLimit = new Money(creditLimit.getAmount());
        this.balance = new Money(0.0);
    }

    public Person getOwner() {
        return owner;
    }

    public Money getBalance() {
        return new Money(balance.getAmount());
    }

    public Money getCreditLimit() {
        return new Money(creditLimit.getAmount());
    }

    public void charge(Money amount) {
        if (balance.getAmount() + amount.getAmount() <= creditLimit.getAmount()) {
            balance = new Money(balance.getAmount() + amount.getAmount());
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    public void payment(Money amount) {
        balance = new Money(balance.getAmount() - amount.getAmount());
        System.out.println("Payment: " + amount);
    }

   
}
