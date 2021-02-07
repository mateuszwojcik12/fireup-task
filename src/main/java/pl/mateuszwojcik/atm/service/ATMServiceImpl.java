package pl.mateuszwojcik.atm.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.mateuszwojcik.atm.dto.CreateBankAccount;
import pl.mateuszwojcik.atm.repository.ATMRepository;

@Service
@RequiredArgsConstructor
public class ATMServiceImpl implements ATMService {

    private final ATMRepository atmRepository;

    @Override
    public CreateBankAccount.Response createNewBankAccount(CreateBankAccount.Request customerData) {

        return null;
    }
}
