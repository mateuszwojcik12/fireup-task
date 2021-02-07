package pl.mateuszwojcik.atm.service;

import pl.mateuszwojcik.atm.dto.CreateBankAccount;

public interface ATMService {
    CreateBankAccount.Response createNewBankAccount(CreateBankAccount.Request customerData);
}
