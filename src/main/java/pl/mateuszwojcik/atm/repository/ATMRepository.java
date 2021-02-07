package pl.mateuszwojcik.atm.repository;

import pl.mateuszwojcik.atm.entity.BankAccountEntity;

public interface ATMRepository {
    BankAccountEntity add(BankAccountEntity bankAccountEntity);
}
