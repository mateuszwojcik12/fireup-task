package pl.mateuszwojcik.atm.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransactionEntity {

    private BigDecimal amount;
    private BigDecimal accountBalanceBeforeTransaction;
    private BigDecimal accountBalanceAfterTransaction;
    private LocalDateTime transactionDateTime;

    public TransactionEntity(BigDecimal amount, BigDecimal accountBalanceBeforeTransaction) {
        this.amount = amount;
        this.accountBalanceBeforeTransaction = accountBalanceBeforeTransaction;
        this.accountBalanceAfterTransaction.add(amount);
        this.transactionDateTime = LocalDateTime.now();
    }

    public BigDecimal getAccountBalanceBeforeTransaction() {
        return accountBalanceBeforeTransaction;
    }

    public BigDecimal getAccountBalanceAfterTransaction() {
        return accountBalanceAfterTransaction;
    }

    public LocalDateTime getTransactionDateTime() {
        return transactionDateTime;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setAccountBalanceBeforeTransaction(BigDecimal accountBalanceBeforeTransaction) {
        this.accountBalanceBeforeTransaction = accountBalanceBeforeTransaction;
    }
}
