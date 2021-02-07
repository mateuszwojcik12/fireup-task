package pl.mateuszwojcik.atm.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import pl.mateuszwojcik.atm.database.DataBase;
import pl.mateuszwojcik.atm.entity.BankAccountEntity;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ATMRepositoryImplTest {

    @Mock
    private DataBase dataBase;
    private ATMRepositoryImpl atmRepository;

    @BeforeEach
    void setUp() {
        this.dataBase = Mockito.mock(DataBase.class);
        this.atmRepository = new ATMRepositoryImpl(this.dataBase);
    }

    @Test
    void shouldReturnAddedObject() {
        // Given
        BankAccountEntity bankAccountEntity = new BankAccountEntity();

        // When
        Mockito.when(this.dataBase.create(Mockito.any())).thenReturn(bankAccountEntity);
        BankAccountEntity result = this.atmRepository.add(bankAccountEntity);

        // Then
        assertEquals(result, bankAccountEntity);
    }
}
