package pl.mateuszwojcik.atm.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransactionEntity {

    private BigDecimal amount;
    private BigDecimal accountBalanceBeforeTransaction;
    private BigDecimal accountBalanceAfterTransaction;
    private LocalDateTime transactionDateTime;

    public BigDecimal getAccountBalanceBeforeTransaction() {
        return accountBalanceBeforeTransaction;
    }

    public BigDecimal getAccountBalanceAfterTransaction() {
        return accountBalanceAfterTransaction;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
