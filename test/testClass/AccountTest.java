package testClass;

import actualClass.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    private Account account;

    @BeforeEach
    public void setUp(){
        account = new Account();
    }
    @Test
    public void accountObjectCanBeCreated(){
        assertNotNull(account);
    }

    @Test
    public void accountShouldHaveFirstName(){
        // Given that I have an account
        // When I try to set the name
        account.setFirstName("Jude");
        // Then
        assertEquals("peter", account.getFirstName());
    }

    @Test
    public void accountShouldHaveLastName(){
        // Given that I have an account
        // When I try to set the last name
        account.setLastName("Onyedeke");
        // Then
        assertEquals("Onyedeke", account.getLastName());

    }
    @Test
    public void accountShouldHaveBalance(){
        // Given that I have an account
        // When I try to set balance
        account.setBalance(10000);
        assertEquals(10000, account.getBalance());
    }
    @Test
    public void accountShouldNotHaveNegativeBalance(){

        // Given that I have an account
        // When I try to set balance
        account.setBalance(-1000);
        // Then
        assertEquals(0.0, account.getBalance());
    }

    @Test
    public void accountBalanceShouldIncreaseWhenWeDeposit(){
        // Given that I have an account with an initial balance
        account.setBalance(0.0);
        // When I try to deposit
        account.deposit(10000);
        // Then assert that the current balance is greater than the initial balance
        assertEquals(10000, account.getBalance());
    }
    @Test
    public void accountCannotAcceptNegativeDepositAmount(){
        // Given that I have an account with an initial balance
        account.setBalance(1000.00);
        // When I try to deposit a negative amount
        account.deposit(-45000);
        // Then assert that the initial balance is the same as the current balance
        assertEquals(1000.00, account.getBalance());
    }

    @Test
    public void accountBalanceDecreaseWhenWeWithdraw(){
        // Given that I have an account with an initial balance
        account.setBalance(50000);
        // When I withdraw 2500
        account.withdraw(2500);
        // assert that the current balance is less than the initial balance
        assertEquals(47500, account.getBalance());
    }
    @Test
    public void accountShouldNotAllowWithdrawalGreaterThanCurrentBalance(){
        // Given that I have an account with an initial balance
        account.setBalance(2500);
        // When I try to withdraw 3500
        account.withdraw(3500);
        //Then assert that current balance is still 2500
        assertEquals(2500, account.getBalance());
    }

    @Test
    public void accountWithBalanceLessThanOrEqualTo2000ShouldNotAllowWithdrawal(){
        // Given that I have an account with an initial balance
        account.setBalance(1000.05);
        // When I try to withdraw 200
        account.withdraw(200);
        // Then assert that the current balance is same as the initial balance
        assertEquals(1000.05, account.getBalance());
    }
    @Test
    public void accountShouldNotAllowWithdrawalAmountLessThan1000(){
        // Given that I have an account with an initial balance
        account.setBalance(3000);
        // When I try to withdraw 200
        account.withdraw(200);
        // Then assert that current balance is the same as initial balance
        assertEquals(3000, account.getBalance());
    }
}
