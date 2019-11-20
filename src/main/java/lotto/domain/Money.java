package lotto.domain;

public class Money {
    private static final int LOTTO_AMOUNT = 1000;
    private final int purchaseAmount;
    private int count;
    private int balance;

    public Money(int purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
        validate();
        this.count = purchaseAmount / LOTTO_AMOUNT;
        this.balance = purchaseAmount;
    }

    private void validate() {
        if (this.purchaseAmount < LOTTO_AMOUNT) {
            throw new IllegalArgumentException("금액이 부족합니다.");
        }
    }

    public int getPurchaseAmount() {
        return purchaseAmount;
    }

    public int getBalance() {
        return balance;
    }

    public int purchased(int purchasedCount) {
        this.count = count - purchasedCount;
        this.balance = balance - (purchasedCount * LOTTO_AMOUNT);
        return count;
    }

    public int purchaseCount() {
        return this.balance / LOTTO_AMOUNT;
    }
}
