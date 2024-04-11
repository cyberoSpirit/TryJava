import java.io.IOException;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import constants.TradeAccountType;
import constants.Transaction;
import pojo.CashAccount;
import pojo.MarginAccount;
import pojo.TradeAccount;
import repository.TradeAccountRepository;
import service.CashAccountService;
import service.MarginAccountService;
import service.TradeAccountService;

public class TryCapstone {
    static Path[] paths = new Path[] {Paths.get("Capstone/data/accounts.txt"), Paths.get("Capstone/data/transactions.txt")};

    static TradeAccountRepository tradeAccountRepository = new TradeAccountRepository();
    static CashAccountService cashAccountService = new CashAccountService(tradeAccountRepository);
    static MarginAccountService marginAccountService = new MarginAccountService(tradeAccountRepository);

    public static void TestCapstone() {
        try {
            loadTradeAccounts();
            applyTransactions();
            finalTest();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void loadTradeAccounts() throws IOException {
        Files.lines(paths[0])
                .forEach(line -> {
                    String[] data = line.split(" ");
                    if (data[0].equals(TradeAccountType.CASH.toString())) {
                        cashAccountService.createTradeAccount(new CashAccount(data[1], new BigDecimal(data[2])));
                    } else if (data[0].equals(TradeAccountType.MARGIN.toString())) {
                        marginAccountService.createTradeAccount(new MarginAccount(data[1], new BigDecimal(data[2])));
                    } else {
                        System.out.println("Record is corupted or provided data are wrong. Data: " + Arrays.toString(data));
                    }
                });

    }

    public static void applyTransactions() throws IOException {
        Files.lines(paths[1])
                .forEach(line -> {
                    String[] data = line.split(" ");
                    boolean isCashService = data[0].equals(TradeAccountType.CASH.toString());
                    TradeAccountService service = isCashService ? cashAccountService : marginAccountService;
                    if (data[2].equals(Transaction.DEPOSIT.toString())) {
                        service.deposit(data[1], new BigDecimal(data[3]));
                    } else if (data[2].equals(Transaction.WITHDRAWAL.toString())) {
                        service.withdraw(data[1], new BigDecimal(data[3]));
                    } else {
                        System.out.println("Record is corupted or provided data are wrong. Data: " + Arrays.toString(data));
                    }
                });
    }

    public static void finalTest() throws IOException {
        System.out.println(
                "Account A1234B Cash Balance: " + cashAccountService.retrieveTradeAccount("A1234B").getCashBalance());
        System.out.println(
                "Account E3456F Cash Balance: " + cashAccountService.retrieveTradeAccount("E3456F").getCashBalance());
        System.out.println(
                "Account I5678J Cash Balance: " + cashAccountService.retrieveTradeAccount("I5678J").getCashBalance());
        System.out.println("Account C2345D Margin: " + marginAccountService.retrieveTradeAccount("C2345D").getMargin());
        System.out.println("Account G4567H Margin: " + marginAccountService.retrieveTradeAccount("G4567H").getMargin());
    }
    

}