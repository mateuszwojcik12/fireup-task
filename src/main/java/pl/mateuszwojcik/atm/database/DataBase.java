package pl.mateuszwojcik.atm.database;

import org.springframework.context.annotation.Bean;
import pl.mateuszwojcik.atm.entity.BankAccountEntity;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private final List<BankAccountEntity> bankAccounts;

    public DataBase() {
        this.bankAccounts = new ArrayList<>();
    }

    public BankAccountEntity create(BankAccountEntity bankAccountEntity) {
        this.bankAccounts.add(bankAccountEntity);
        return bankAccountEntity;
    }

    public List<BankAccountEntity> read() {
        return this.bankAccounts;
    }

    public BankAccountEntity findEntity(BankAccountEntity bankAccountEntity) {
        return this.bankAccounts
                .stream()
                .filter(bankAccountEntityDb -> bankAccountEntityDb.equals(bankAccountEntity))
                .findAny()
                .orElse(null);
    }

    public void delete(BankAccountEntity bankAccountEntity) {
        this.bankAccounts.remove(bankAccountEntity);
    }
}
