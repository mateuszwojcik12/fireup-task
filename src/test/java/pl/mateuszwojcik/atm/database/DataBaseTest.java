package pl.mateuszwojcik.atm.database;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.mateuszwojcik.atm.entity.BankAccountEntity;
import pl.mateuszwojcik.atm.entity.TransactionEntity;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class DataBaseTest {

    private DataBase dataBase;

    @BeforeEach
    void setUp() {
        this.dataBase = new DataBase();
        addTestData();
    }

    private void addTestData() {
        for (int i = 0; i < 100; i++) {
            BankAccountEntity bankAccountEntity = new BankAccountEntity();
            bankAccountEntity.setName(i % 2 == 0 ? "Mariusz" : "Jarosław");
            bankAccountEntity.setLastName(i % 2 == 0 ? "Nowak" : "Kowalski");
            bankAccountEntity.setAccountBalance(new BigDecimal(i % 2 == 0 ? 1000 : 2500));
            this.dataBase.create(bankAccountEntity);
        }
    }

    @Test
    void shouldFindBankAccountWhenGetsLookingForObject() {
        // Given
        BankAccountEntity bankAccountEntity = this.dataBase.read().get(0);

        // When
        BankAccountEntity foundEntity = this.dataBase.findEntity(bankAccountEntity);

        // Then
        assertEquals(bankAccountEntity, foundEntity);
    }

    @Test
    void shouldUpdateAmountInSpecifyObject() {
        // Given
        BankAccountEntity bankAccountEntity = this.dataBase.read().get(0);
        BigDecimal newAmount = new BigDecimal(10);

        // When
        bankAccountEntity.setAccountBalance(newAmount);

        // Then
        assertEquals(this.dataBase.read().get(0).getAccountBalance(), newAmount);
    }

}
