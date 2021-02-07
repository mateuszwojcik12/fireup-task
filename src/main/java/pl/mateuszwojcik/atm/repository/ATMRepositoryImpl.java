package pl.mateuszwojcik.atm.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.mateuszwojcik.atm.database.DataBase;
import pl.mateuszwojcik.atm.entity.BankAccountEntity;

@Repository
@RequiredArgsConstructor
public class ATMRepositoryImpl implements ATMRepository {

    private final DataBase dataBase;

    @Override
    public BankAccountEntity add(BankAccountEntity bankAccountEntity) {
        return dataBase.create(bankAccountEntity);
    }
}
