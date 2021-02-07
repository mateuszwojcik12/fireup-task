package pl.mateuszwojcik.atm.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class BankAccountEntity extends BaseEntity{

    private String name;
    private String lastName;
    private BigDecimal accountBalance;
    private List<TransactionEntity> transactionHistory;

    @Override
    public boolean equals(Object obj) {
        if (! (obj instanceof BankAccountEntity)) {
            return false;
        }
        BankAccountEntity bankAccountEntity = (BankAccountEntity) obj;
        return this.getId().equals(bankAccountEntity.getId());
    }
}
