package service;

import java.math.BigDecimal;
import java.util.NoSuchElementException;

import pojo.CashAccount;
import repository.TradeAccountRepository;

public class CashAccountService implements TradeAccountService{
    private TradeAccountRepository repository;

    public CashAccountService(TradeAccountRepository repository) {
        this.repository = repository;
    }

    @Override
    public void deposit(String id, BigDecimal amount) {
        CashAccount account = (CashAccount) this.repository.retrieveTradeAccount(id);
        if (account == null) {
            throw new NoSuchElementException("Element with the id " + id + " was not found.");
        } else {
            account.setCashBalance(account.getCashBalance().add(amount));
        }
        updateTradeAccount(account);
    }

    @Override
    public void withdraw(String id, BigDecimal amount) {
        CashAccount account = (CashAccount) this.repository.retrieveTradeAccount(id);
        if (account == null) {
            throw new NoSuchElementException("Element with the id " + id + " was not found.");
        } else {
            account.setCashBalance(account.getCashBalance().subtract(amount));
        }
        updateTradeAccount(account);
    }

    public void createTradeAccount(CashAccount account) {
        if (account != null) {
            repository.createTradeAccount(account);
        }
    }

    public CashAccount retrieveTradeAccount(String id) {
        return (CashAccount) this.repository.retrieveTradeAccount(id);
    }

    public void updateTradeAccount(CashAccount account) {
        if (account != null) {
            this.repository.updateTradeAccount(account);
        }
    }

    public CashAccount deleteTradeAccount(String id) {
        CashAccount account = retrieveTradeAccount(id);
        this.repository.deleteTradeAccount(id);
        return account;
    }
}
