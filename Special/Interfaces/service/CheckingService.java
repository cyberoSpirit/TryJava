package Interfaces.service;

import java.math.BigDecimal;

import Interfaces.pojo.Checking;
import Interfaces.repository.AccountRepository;

public class CheckingService implements AccountService {
    AccountRepository accountRepository;

    public CheckingService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }  


    public void createAccount(Checking account) {
        this.accountRepository.createAccount(account);
    }

    public Checking retrieveAccount(String id) {
        return (Checking) this.accountRepository.retrieveAccount(id);
    }

    public void updateAccount(Checking account) {
        this.accountRepository.updateAccount(account);
    }

    public void deleteAccount(String id) {
        this.accountRepository.deleteAccount(id);
    }

    @Override
    public void deposit(String id, BigDecimal amount) {
        Checking account = retrieveAccount(id);
        account.setBalance(account.getBalance().add(amount));
        updateAccount(account);
    }

    @Override
    public void withdraw(String id, BigDecimal amount) {
        Checking account = retrieveAccount(id);
        account.setBalance(account.getBalance().subtract(amount));
        updateAccount(account);
    }
}
