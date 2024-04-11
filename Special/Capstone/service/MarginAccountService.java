package service;

import java.math.BigDecimal;
import java.util.NoSuchElementException;

import pojo.MarginAccount;
import repository.TradeAccountRepository;

public class MarginAccountService implements TradeAccountService {
    private TradeAccountRepository repository;

    public MarginAccountService(TradeAccountRepository repository) {
        this.repository = repository;
    }

    @Override
    public void deposit(String id, BigDecimal amount) {
        MarginAccount account = (MarginAccount) this.repository.retrieveTradeAccount(id);
        if (account == null) {
            throw new NoSuchElementException("Element with the id " + id + " was not found.");
        } else {
            account.setMargin(account.getMargin().add(amount));
        }
        updateTradeAccount(account);
    }

    @Override
    public void withdraw(String id, BigDecimal amount) {
        MarginAccount account = (MarginAccount) this.repository.retrieveTradeAccount(id);
        if (account == null) {
            throw new NoSuchElementException("Element with the id " + id + " was not found.");
        } else {
            account.setMargin(account.getMargin().subtract(amount));
        }
        updateTradeAccount(account);
    }

    public void createTradeAccount(MarginAccount account) {
        if (account != null) {
            repository.createTradeAccount(account);
        }
    }

    public MarginAccount retrieveTradeAccount(String id) {
        return (MarginAccount) this.repository.retrieveTradeAccount(id);
    }

    public void updateTradeAccount(MarginAccount account) {
        if (account != null) {
            this.repository.updateTradeAccount(account);
        }
    }

    public MarginAccount deleteTradeAccount(String id) {
        MarginAccount account = retrieveTradeAccount(id);
        this.repository.deleteTradeAccount(id);
        return account;
    }
}